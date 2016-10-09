package gitemf.estores;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.InternalEObject.EStore;
import org.eclipse.jgit.api.Git;

import com.google.gson.Gson;

import gitemf.GitEObjectImpl;

public class GitEStore implements EStore {

	private final Git git;
	private final Gson gson = new Gson();

	public GitEStore(Git git) throws IOException {
		this.git = git;
	}

	@Override
	public Object get(InternalEObject object, EStructuralFeature feature, int index) {
		GitEObjectImpl geob = (GitEObjectImpl) object;

		try {
			Object value = deserialize(geob, feature);
			if (index == EStore.NO_INDEX || !feature.isMany()) {
				return value;
			} else {
				throw new UnsupportedOperationException("not implemented yet");
			}
		} catch (IOException ex) {
			ex.printStackTrace();
			return null;
		}
	}

	@Override
	public Object set(InternalEObject object, EStructuralFeature feature, int index, Object value) {
		GitEObjectImpl geob = (GitEObjectImpl) object;

		try {
			final Object oldValue = deserialize(geob, feature);
			serialize(geob, feature, value);
			return oldValue;
		} catch (IOException ex) {
			ex.printStackTrace();
			return null;
		}
	}

	private void serialize(GitEObjectImpl geob, EStructuralFeature feature, Object value) throws IOException {
		final File featureFile = getFeatureFile(geob, feature);

		try (Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(featureFile), "UTF-8"))) {
			String json = gson.toJson(value);
			writer.write(json);
		}
	}

	private Object deserialize(GitEObjectImpl geob, EStructuralFeature feature) throws IOException {
		final File featureFile = getFeatureFile(geob, feature);
		if (!featureFile.exists()) {
			return null;
		}

		try (Reader reader = new BufferedReader(new InputStreamReader(new FileInputStream(featureFile), "UTF-8"))) {
			// TODO support more types
			String val = gson.fromJson(reader, String.class);
			return val;
		}
	}

	private File getFeatureFile(GitEObjectImpl geob, EStructuralFeature feature) throws IOException {
		final String prefix = feature instanceof EAttribute ? "attr_" : "oref_";
		final File featureFile = new File(geob.getFolder(), prefix + feature.getName());
		return featureFile;
	}

	@Override
	public boolean isSet(InternalEObject object, EStructuralFeature feature) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void unset(InternalEObject object, EStructuralFeature feature) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isEmpty(InternalEObject object, EStructuralFeature feature) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size(InternalEObject object, EStructuralFeature feature) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean contains(InternalEObject object, EStructuralFeature feature, Object value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int indexOf(InternalEObject object, EStructuralFeature feature, Object value) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int lastIndexOf(InternalEObject object, EStructuralFeature feature, Object value) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void add(InternalEObject object, EStructuralFeature feature, int index, Object value) {
		// TODO Auto-generated method stub

	}

	@Override
	public Object remove(InternalEObject object, EStructuralFeature feature, int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object move(InternalEObject object, EStructuralFeature feature, int targetIndex, int sourceIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void clear(InternalEObject object, EStructuralFeature feature) {
		// TODO Auto-generated method stub

	}

	@Override
	public Object[] toArray(InternalEObject object, EStructuralFeature feature) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(InternalEObject object, EStructuralFeature feature, T[] array) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int hashCode(InternalEObject object, EStructuralFeature feature) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public InternalEObject getContainer(InternalEObject object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EStructuralFeature getContainingFeature(InternalEObject object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EObject create(EClass eClass) {
		// TODO Auto-generated method stub
		return null;
	}

}
