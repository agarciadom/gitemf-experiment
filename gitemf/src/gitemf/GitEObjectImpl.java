package gitemf;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEStoreEObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;

import gitemf.estores.GitEStore;
import gitemf.estores.MapBackedEStore;

public class GitEObjectImpl extends MinimalEStoreEObjectImpl {

	private File folder;
	private EStore store;
	private InternalEObject eContainer;
	private Resource resource;

	public GitEObjectImpl() {
		// no folder assigned yet
	}

	public GitEObjectImpl(File fFolder) {
		this.folder = fFolder;
	}

	public File getFolder() throws IOException {
		if (folder == null && resource instanceof GitResourceImpl) {
			GitResourceImpl gitResource = (GitResourceImpl) resource;

			final String objID = RandomStringUtils.randomAlphanumeric(16);
			if (eContainer instanceof GitEObjectImpl) {
				folder = new File(((GitEObjectImpl)eContainer).getFolder(), objID);
			} else {
				folder = new File(gitResource.getModelFolder(), objID);
			}
			if (!folder.mkdirs()) {
				throw new IllegalStateException("Could not create folder for new object");
			}

			gitResource.saveEClassFile(this);
		}
		return folder;
	}

	public void setFolder(File folder) {
		this.folder = folder;
	}

	public String getReferencePath() {
		if (resource instanceof GitResourceImpl) {
			GitResourceImpl gitResource = (GitResourceImpl) resource;
			Path modelPath = gitResource.getModelFolder().toPath();
			try {
				return modelPath.relativize(getFolder().toPath()).toString();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return folder != null ? folder.getPath() : "";
	}

	@Override
	public EStore eStore() {
		if (store == null) {
			store = new MapBackedEStore();
		}
		return store;
	}

	@Override
	public void eSetStore(EStore store) {
		this.store = store;
	}

	@Override
	protected void eBasicSetContainer(InternalEObject newContainer) {
		eContainer = newContainer;

		attach(eContainer != null ? eContainer.eResource() : null);
		if (resource instanceof GitResourceImpl && eContainer instanceof GitEObjectImpl) {
			GitEObjectImpl gEobContainer = (GitEObjectImpl) eContainer;
			if (!gEobContainer.folder.equals(folder.getParentFile())) {
				final String oldReferencePath = getReferencePath();
				final File newFolder = new File(gEobContainer.folder, folder.getName());
				try {
					FileUtils.moveDirectory(folder, newFolder);
					folder = newFolder;
					if (store instanceof GitEStore) {
						((GitEStore)store).updateIncomingReferences(this, oldReferencePath);
					}
				} catch (IOException ex) {
					ex.printStackTrace();
				}
			}
		}
	}

	public void attach(Resource newResource) {
		if (newResource == resource) {
			return;
		}
		resource = newResource;

		final EStore oldStore = store;
		if (resource instanceof GitResourceImpl) {
			store = ((GitResourceImpl) resource).eStore();
		} else {
			store = new MapBackedEStore();
		}

		if (oldStore != store && oldStore != null) {
			// Move values to new EStore
			for (EStructuralFeature sf : eClass().getEAllStructuralFeatures()) {
				if (oldStore.isSet(this, sf)) {
					if (sf.isMany()) {
						store.clear(this, sf);

						final int nValues = oldStore.size(this, sf);
						for (int i = 0; i < nValues; i++) {
							Object value = adaptToGit(oldStore.get(this, sf, i));
							store.add(this, sf, i, value);
						}
					} else {
						Object value = adaptToGit(oldStore.get(this, sf, EStore.NO_INDEX));
						store.set(this, sf, EStore.NO_INDEX, value);
					}
				}
			}

			// If detaching, remove old refs and delete directory
			if (oldStore instanceof GitEStore) {
				try {
					((GitEStore)oldStore).updateIncomingReferences(this, null);
					FileUtils.deleteDirectory(folder);
					folder = null;
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	private Object adaptToGit(Object object) {
		if (object instanceof GitEObjectImpl) {
			GitEObjectImpl geob = (GitEObjectImpl) object;
			geob.attach(resource);
		}
		return object;
	}

	@Override
	public InternalEObject eInternalContainer() {
		return eContainer;
	}

	@Override
	public Resource eResource() {
		return resource != null ? resource : super.eResource();
	}

}
