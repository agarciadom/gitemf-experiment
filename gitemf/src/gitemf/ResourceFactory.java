package gitemf;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Factory;

public class ResourceFactory implements Factory {

	public ResourceFactory() {
		// nothing to do
	}

	@Override
	public Resource createResource(URI uri) {
		try {
			return new GitResourceImpl(uri);
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

}
