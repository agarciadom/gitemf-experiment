package gitemf;

import java.io.File;
import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEStoreEObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;

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
			GitResourceImpl gitResource = (GitResourceImpl)resource;
			folder = new File(gitResource.getModelFolder(), RandomStringUtils.randomAlphanumeric(16));
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
		attach(eContainer.eResource());
	}

	protected void attach(Resource newResource) {
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
		}
	}

	private Object adaptToGit(Object object) {
		if (object instanceof GitEObjectImpl) {
			GitEObjectImpl geob = (GitEObjectImpl)object;
			if (geob.eResource() != resource) {
				geob.attach(resource);
			}
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
