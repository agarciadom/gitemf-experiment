package gitemf.estores;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeSet;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.InternalEObject.EStore;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import gitemf.GitEObjectImpl;
import gitemf.GitResourceImpl;

/**
 * EStore that represents objects as folders in a git repository, preserving
 * containment structure and keeping bidirectional links between them.
 *
 * TODO: reorganise code to have a better split between GitEObjectImpl and this.
 * TODO: maps, unordered lists.
 */
public class GitEStore implements EStore {

	private static final class ArrayListType implements ParameterizedType {
		private Class<?> type;

		public ArrayListType(Class<?> type) {
			this.type = type;
		}

		@Override
		public Type getRawType() {
			return ArrayList.class;
		}

		@Override
		public Type getOwnerType() {
			return null;
		}

		@Override
		public Type[] getActualTypeArguments() {
			return new Type[] {type};
		}

		@Override
		public boolean equals(Object o) {
			if (o instanceof ParameterizedType) {
				ParameterizedType po = (ParameterizedType)o;
				return getRawType() == po.getRawType()
						&& Arrays.equals(getActualTypeArguments(), po.getActualTypeArguments()); 
			}
			return false;
		}
	}

	private final GitResourceImpl git;
	private final Gson gson = new GsonBuilder().setPrettyPrinting().create();

	public GitEStore(GitResourceImpl git) {
		this.git = git;
	}

	@Override
	public Object get(InternalEObject object, EStructuralFeature feature, int index) {
		GitEObjectImpl geob = (GitEObjectImpl) object;

		try {
			Object value = deserialize(geob, feature);
			if (index == EStore.NO_INDEX || !feature.isMany()) {
				return value;
			} else if (value != null) {
				return ((List<?>)value).get(index);
			} else {
				throw new NoSuchElementException();
			}
		} catch (IOException ex) {
			ex.printStackTrace();
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public Object set(InternalEObject object, EStructuralFeature feature, int index, Object value) {
		GitEObjectImpl geob = (GitEObjectImpl) object;

		try {
			final Object oldValue = deserialize(geob, feature);
			if (index == EStore.NO_INDEX || !feature.isMany()) {
				serialize(geob, feature, value);
				return oldValue;
			} else {
				List<Object> l = (List<Object>)oldValue;
				Object oldElem = l.set(index, value);
				serialize(geob, feature, l);

				if (feature instanceof EReference) {
					final GitEObjectImpl target = (GitEObjectImpl)value;
					geob.attach(git);

					final File irefsFile = getIncomingReferencesFile(target);
					final Set<IncomingRef> irefs = deserializeIncomingRefs(irefsFile);
					if (oldElem instanceof GitEObjectImpl) {
						final GitEObjectImpl geobOldTarget = (GitEObjectImpl)oldElem;
						irefs.remove(new IncomingRef(geobOldTarget.getReferencePath(), feature.getName(), index));
					}
					irefs.add(new IncomingRef(target.getReferencePath(), feature.getName(), index));
					serializeIncomingRefs(irefsFile, irefs);
				}

				return oldElem;
			}
		} catch (IOException ex) {
			ex.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean isSet(InternalEObject object, EStructuralFeature feature) {
		GitEObjectImpl geob = (GitEObjectImpl) object;
		try {
			File file = getFeatureFile(geob, feature);
			return file.exists();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return false;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void unset(InternalEObject object, EStructuralFeature feature) {
		GitEObjectImpl geob = (GitEObjectImpl) object;
		try {
			final File file = getFeatureFile(geob, feature);
		
			if (feature instanceof EReference && file.exists()) {
				final String geobRefPath = geob.getReferencePath();
				final EList<GitEObjectImpl> eobs = (EList<GitEObjectImpl>) deserialize(feature, file);

				int index = 0;
				for (GitEObjectImpl eob : eobs) {
					final File incomingRefsFile = getIncomingReferencesFile(eob);
					final Set<IncomingRef> incomingRefs = deserializeIncomingRefs(incomingRefsFile);
					incomingRefs.remove(new IncomingRef(geobRefPath, feature.getName(), index));
					serializeIncomingRefs(incomingRefsFile, incomingRefs);

					index++;
				}
			}
			file.delete();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean isEmpty(InternalEObject object, EStructuralFeature feature) {
		GitEObjectImpl geob = (GitEObjectImpl) object;
		try {
			File file = getFeatureFile(geob, feature);
			if (feature instanceof EAttribute) {
				Object value = deserialize(feature, file);
				if (value instanceof List) {
					return ((List<?>)value).isEmpty();
				} else {
					return value == null;
				}
			} else {
				return file.length() == 0;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return true;
	}

	@Override
	public int size(InternalEObject object, EStructuralFeature feature) {
		GitEObjectImpl geob = (GitEObjectImpl) object;

		try {
			File file = getFeatureFile(geob, feature);
			if (file.exists()) {

				if (!feature.isMany()) {
					return 1;
				} else if (feature instanceof EAttribute) {
					// TODO maps
					Object val = deserialize(feature, file);
					return ((List<?>) val).size();
				} else if (feature instanceof EReference) {
					int iLines = 0;
					try (BufferedReader reader = openReader(file)) {
						while (reader.readLine() != null) {
							++iLines;
						}
					}
					return iLines;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return 0;
	}

	@Override
	public boolean contains(InternalEObject object, EStructuralFeature feature, Object value) {
		return indexOf(object, feature, value) != EStore.NO_INDEX;
	}

	@SuppressWarnings("unchecked")
	@Override
	public int indexOf(InternalEObject object, EStructuralFeature feature, Object value) {
		GitEObjectImpl geob = (GitEObjectImpl) object;

		try {
			final Object raw = deserialize(geob, feature);
			if (raw instanceof List) {
				if (feature instanceof EAttribute) {
					return ((List<Object>)raw).indexOf(value);
				} else {
					final File valueFolder = ((GitEObjectImpl)value).getFolder();
					if (valueFolder == null) {
						return EStore.NO_INDEX;
					}

					int i = 0;
					for (Iterator<GitEObjectImpl> itEob = ((List<GitEObjectImpl>)raw).iterator(); itEob.hasNext(); ) {
						final GitEObjectImpl geobElem = itEob.next();
						if (valueFolder.equals(geobElem.getFolder())) {
							return i;
						}
						i++;
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return EStore.NO_INDEX;
	}

	@SuppressWarnings("unchecked")
	@Override
	public int lastIndexOf(InternalEObject object, EStructuralFeature feature, Object value) {
		GitEObjectImpl geob = (GitEObjectImpl) object;

		try {
			final Object raw = deserialize(geob, feature);
			if (raw instanceof List) {
				if (feature instanceof EAttribute) {
					return ((List<Object>)raw).indexOf(value);
				} else {
					final File valueFolder = ((GitEObjectImpl)value).getFolder();
					if (valueFolder == null) {
						return EStore.NO_INDEX;
					}

					final List<GitEObjectImpl> l = (List<GitEObjectImpl>)raw;
					for (int i = l.size() - 1; i >= 0; i--) {
						final GitEObjectImpl geobElem = l.get(i);
						if (valueFolder.equals(geobElem.getFolder())) {
							return i;
						}
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return EStore.NO_INDEX;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void add(InternalEObject object, EStructuralFeature feature, int index, Object value) {
		GitEObjectImpl geob = (GitEObjectImpl) object;

		try {
			List<Object> vals = (List<Object>) deserialize(geob, feature);
			if (vals == null) {
				vals = new BasicEList<>();
			}
			vals.add(index, value);
			serialize(geob, feature, vals);

			if (feature instanceof EReference) {
				GitEObjectImpl target = (GitEObjectImpl) value;

				final File incomingRefsFile = getIncomingReferencesFile(target);
				final Set<IncomingRef> oldRefs = deserializeIncomingRefs(incomingRefsFile);
				oldRefs.add(new IncomingRef(geob.getReferencePath(), feature.getName(), index));
				serializeIncomingRefs(incomingRefsFile, oldRefs);
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public Object remove(InternalEObject object, EStructuralFeature feature, int index) {
		GitEObjectImpl geob = (GitEObjectImpl) object;

		try {
			List<Object> vals = (List<Object>) deserialize(geob, feature);
			Object oldElem = vals.remove(index);
			serialize(geob, feature, vals);

			if (feature instanceof EReference && oldElem instanceof GitEObjectImpl) {
				GitEObjectImpl target = (GitEObjectImpl) oldElem;

				final File incomingRefsFile = getIncomingReferencesFile(target);
				final Set<IncomingRef> oldRefs = deserializeIncomingRefs(incomingRefsFile);
				oldRefs.remove(new IncomingRef(geob.getReferencePath(), feature.getName(), index));
				serializeIncomingRefs(incomingRefsFile, oldRefs);
			}
			return oldElem;
		} catch (IOException ex) {
			ex.printStackTrace();
		}

		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Object move(InternalEObject object, EStructuralFeature feature, int targetIndex, int sourceIndex) {
		GitEObjectImpl geob = (GitEObjectImpl) object;

		try {
			EList<Object> vals = (EList<Object>) deserialize(geob, feature);
			Object oldElem = vals.move(targetIndex, sourceIndex);
			serialize(geob, feature, vals);

			if (feature instanceof EReference && oldElem instanceof GitEObjectImpl) {
				GitEObjectImpl target = (GitEObjectImpl) oldElem;

				final File incomingRefsFile = getIncomingReferencesFile(target);
				final Set<IncomingRef> oldRefs = deserializeIncomingRefs(incomingRefsFile);
				oldRefs.remove(new IncomingRef(geob.getReferencePath(), feature.getName(), sourceIndex));
				oldRefs.add(new IncomingRef(geob.getReferencePath(), feature.getName(), targetIndex));
				serializeIncomingRefs(incomingRefsFile, oldRefs);
			}
			return oldElem;
		} catch (IOException ex) {
			ex.printStackTrace();
		}

		return null;
	}

	@Override
	public void clear(InternalEObject object, EStructuralFeature feature) {
		unset(object, feature);
		set(object, feature, EStore.NO_INDEX, feature.getDefaultValue());
	}

	@SuppressWarnings("unchecked")
	@Override
	public Object[] toArray(InternalEObject object, EStructuralFeature feature) {
		GitEObjectImpl geob = (GitEObjectImpl) object;

		try {
			Object value = deserialize(geob, feature);
			if (feature.isMany()) {
				return ((List<Object>)value).toArray();
			} else if (value != null) {
				return new Object[]{ value };
			} else {
				return new Object[0];
			}
		} catch (IOException ex) {
			ex.printStackTrace();
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> T[] toArray(InternalEObject object, EStructuralFeature feature, T[] array) {
		GitEObjectImpl geob = (GitEObjectImpl) object;

		try {
			Object value = deserialize(geob, feature);

			if (feature.isMany()) {
				return ((List<Object>) value).toArray(array);
			} else if (value != null) {
				if (array.length >= 1) {
					array[0] = (T) value;
					for (int i = 1; i < array.length; i++) {
						array[i] = null;
					}
					return array;
				} else {
					T[] newArray = (T[]) Array.newInstance(array.getClass().getComponentType(), 1);
					newArray[0] = (T) value;
					return newArray;
				}
			} else {
				return (T[]) Array.newInstance(array.getClass().getComponentType(), 0);
			}
		} catch (IOException ex) {
			ex.printStackTrace();
			return null;
		}
	}

	@Override
	public int hashCode(InternalEObject object, EStructuralFeature feature) {
		GitEObjectImpl geob = (GitEObjectImpl) object;

		try {
			Object value = deserialize(geob, feature);
			if (value != null) {
				return value.hashCode();
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return 0;
	}

	@Override
	public InternalEObject getContainer(InternalEObject object) {
		GitEObjectImpl geob = (GitEObjectImpl) object;
		return geob.eInternalContainer();
	}

	@Override
	public EStructuralFeature getContainingFeature(InternalEObject object) {
		throw new UnsupportedOperationException();
	}

	@Override
	public EObject create(EClass eClass) {
		throw new UnsupportedOperationException();
	}

	private void serializeIncomingRefs(File fIncomingReferences, final Set<IncomingRef> refs)
			throws IOException, UnsupportedEncodingException, FileNotFoundException {
		try (BufferedWriter writer = openWriter(fIncomingReferences)) {
			for (IncomingRef ref : refs) {
				writer.write(ref.getReferencePath());
				writer.write('\t');
				writer.write(ref.getFeatureName());
				writer.write('\t');
				writer.write(ref.getIndex() + "");
				writer.newLine();
			}
		}
	}

	private Set<IncomingRef> deserializeIncomingRefs(File fIncomingReferences) throws IOException {
		final Set<IncomingRef> oldRefs = new TreeSet<>();
	
		if (fIncomingReferences.exists()) {
			try (BufferedReader reader = openReader(fIncomingReferences)) {
				String line;
				while ((line = reader.readLine()) != null) {
					String[] parts = line.split("\t", 3);
					oldRefs.add(new IncomingRef(parts[0], parts[1], Integer.valueOf(parts[2])));
				}
			}
		}
		return oldRefs;
	}

	private File getIncomingReferencesFile(GitEObjectImpl target) throws IOException {
		return new File(target.getFolder(), "irefs");
	}

	@SuppressWarnings("unchecked")
	private void serialize(GitEObjectImpl geob, EStructuralFeature feature, Object value) throws IOException {
		final File featureFile = getFeatureFile(geob, feature);

		try (BufferedWriter writer = openWriter(featureFile)) {
			if (feature instanceof EAttribute) {
				String json = gson.toJson(value);
				writer.write(json);
			} else if (value instanceof GitEObjectImpl) {
				GitEObjectImpl target = (GitEObjectImpl) value;
				target.attach(git);
				writer.write(target.getReferencePath());
				writer.newLine();
			} else if (value instanceof List) {
				List<GitEObjectImpl> l = (List<GitEObjectImpl>) value;
				for (GitEObjectImpl target : l) {
					target.attach(git);
					writer.write(target.getReferencePath());
					writer.newLine();
				}
			}
		}
	}

	private Object deserialize(GitEObjectImpl geob, EStructuralFeature feature) throws IOException {
		final File featureFile = getFeatureFile(geob, feature);
		if (!featureFile.exists()) {
			return null;
		}
		return deserialize(feature, featureFile);
	}

	private Object deserialize(EStructuralFeature feature, final File featureFile)
			throws IOException, UnsupportedEncodingException, FileNotFoundException {
		try (BufferedReader reader = openReader(featureFile)) {
			if (feature instanceof EAttribute) {
				if (feature.isMany()) {
					return gson.fromJson(reader, new ArrayListType(feature.getEType().getInstanceClass()));
				} else {
					return gson.fromJson(reader, feature.getEType().getInstanceClass());
				}
			} else {
				EList<EObject> objs = new BasicEList<>();

				String line;
				while ((line = reader.readLine()) != null) {
					final File eobFolder = new File(git.getModelFolder(), line);
					final EObject eob = git.loadEObjectFromFolder(eobFolder);
					objs.add(eob);
				}
				return objs;
			}
		}
	}

	private File getFeatureFile(GitEObjectImpl geob, EStructuralFeature feature) throws IOException {
		final File folder = geob.getFolder();
		return getFeatureFile(feature, folder);
	}

	private File getFeatureFile(EStructuralFeature feature, final File folder) {
		final File featureFile = new File(folder, "sf_" + feature.getName());
		return featureFile;
	}

	private BufferedWriter openWriter(final File featureFile)
			throws UnsupportedEncodingException, FileNotFoundException {
		return new BufferedWriter(new OutputStreamWriter(new FileOutputStream(featureFile), "UTF-8"));
	}

	private BufferedReader openReader(final File featureFile)
			throws UnsupportedEncodingException, FileNotFoundException {
		return new BufferedReader(new InputStreamReader(new FileInputStream(featureFile), "UTF-8"));
	}

	public void updateIncomingReferences(GitEObjectImpl movedEObject, String oldReferencePath) throws IOException {
		final String newReferencePath = movedEObject.getReferencePath();

		final File fIncomingRefs = getIncomingReferencesFile(movedEObject);
		final Set<IncomingRef> iRefs = deserializeIncomingRefs(fIncomingRefs);
		final Set<String> processedFiles = new HashSet<>();
		for (IncomingRef iRef : iRefs) {
			final File featureFile = new File(new File(git.getModelFolder(), iRef.getReferencePath()), "sf_" + iRef.getFeatureName());
			if (processedFiles.add(iRef.getReferencePath())) {
				updateOutgoingReference(oldReferencePath, newReferencePath, featureFile);
			}
		}
	}

	private void updateOutgoingReference(String oldReferencePath, final String newReferencePath, final File featureFile)
			throws IOException, UnsupportedEncodingException, FileNotFoundException {
		List<String> newRefs = new ArrayList<>();
		try (BufferedReader reader = openReader(featureFile)) {
			String line;
			while ((line = reader.readLine()) != null) {
				if (oldReferencePath.equals(line)) {
					if (newReferencePath != null) {
						newRefs.add(newReferencePath);
					}
				} else {
					newRefs.add(line);
				}
			}
		}
		try (BufferedWriter writer = openWriter(featureFile)) {
			for (String oref : newRefs) {
				writer.write(oref);
				writer.newLine();
			}
		}
	}

}
