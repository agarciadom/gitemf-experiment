package gitemf;

import java.io.File;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.junit.Test;

import jdtast.gitemf.core.Core.CorePackage;
import jdtast.gitemf.dom.DOM.DOMPackage;
import jdtast.gitemf.ptypes.PrimitiveTypes.PrimitiveTypesPackage;

public class IntegrationTests extends AbstractTest {

	@Test
	public void loadSet0() throws Exception {
		CorePackage.eINSTANCE.getName();
		DOMPackage.eINSTANCE.getName();
		PrimitiveTypesPackage.eINSTANCE.getName();
	
		final File fSet0 = new File("resources/set0.xmi").getAbsoluteFile();
		final XMIResourceImpl rXMI = new XMIResourceImpl(URI.createFileURI(fSet0.getAbsolutePath()));
		rXMI.load(null);
	
		final GitResourceImpl rGit = new GitResourceImpl(fRepoURI);
		rGit.load(null);
		rGit.getContents().addAll(rXMI.getContents());
		rGit.save(null);
	
		System.out.println("saved!");
		// TODO should compare contents
	}

}
