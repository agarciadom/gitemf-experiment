package gitemf;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.apache.commons.io.FileUtils;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import jdtast.gitemf.core.Core.BinaryPackageFragmentRoot;
import jdtast.gitemf.core.Core.CoreFactory;
import jdtast.gitemf.core.Core.CorePackage;
import jdtast.gitemf.core.Core.IJavaProject;
import jdtast.gitemf.core.Core.IPackageFragmentRoot;
import jdtast.gitemf.core.Core.SourcePackageFragmentRoot;
import jdtast.gitemf.dom.DOM.DOMPackage;
import jdtast.gitemf.ptypes.PrimitiveTypes.PrimitiveTypesPackage;

public class BasicTests {

	private File fRepo;
	private URI fRepoURI;

	@Before
	public void setUp() throws IOException {
		fRepo = Files.createTempDirectory("gitemf").toFile();
		fRepoURI = URI.createURI("gitemf://" + fRepo.getAbsolutePath());
	}

	@After
	public void tearDown() throws IOException {
		if (fRepo != null) {
			FileUtils.deleteDirectory(fRepo);
		}
	}
	
	@Test
	public void loadUnload() throws Exception {
		GitResourceImpl r = new GitResourceImpl(fRepoURI);
		r.load(null);
		r.unload();
	}

	@Test
	public void rootIJavaProject() throws Exception {
		{
			final GitResourceImpl r = new GitResourceImpl(fRepoURI);
			r.load(null);

			final IJavaProject project = CorePackage.eINSTANCE.getCoreFactory().createIJavaProject();
			project.setElementName("Test");
			project.setIsReadOnly(true);
			r.getContents().add(project);
			assertEquals("Test", project.getElementName());
			r.save(null);
			r.unload();
		}

		final GitResourceImpl r = new GitResourceImpl(fRepoURI);
		r.load(null);
		assertEquals(1, r.getContents().size());
		IJavaProject iJavaProject = (IJavaProject)r.getContents().get(0);
		assertEquals("Test", iJavaProject.getElementName());
		assertEquals(true, iJavaProject.getIsReadOnly());
	}

	@Test
	public void nestedObjects() throws Exception {
		{
			final GitResourceImpl r = new GitResourceImpl(fRepoURI);
			r.load(null);

			final CoreFactory factory = CorePackage.eINSTANCE.getCoreFactory();
			final IJavaProject project = factory.createIJavaProject();
			project.setElementName("Test");
			project.setIsReadOnly(true);
			r.getContents().add(project);
			r.save(null);

			final SourcePackageFragmentRoot root1 = factory.createSourcePackageFragmentRoot();
			root1.setElementName("XYZ");
			project.getPackageFragmentRoots().add(root1);
			r.save(null);

			final BinaryPackageFragmentRoot root2 = factory.createBinaryPackageFragmentRoot();
			root2.setElementName("ABC");
			project.getPackageFragmentRoots().add(root2);
			r.save(null);

			r.unload();
		}

		final GitResourceImpl r = new GitResourceImpl(fRepoURI);
		r.load(null);
		assertEquals(1, r.getContents().size());
		IJavaProject iJavaProject = (IJavaProject)r.getContents().get(0);

		EList<IPackageFragmentRoot> children = iJavaProject.getPackageFragmentRoots();
		assertEquals(2, children.size());
		assertEquals("XYZ", children.get(0).getElementName());
	}

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

	@Test
	public void doDelete() throws Exception {
		{
			final GitResourceImpl r = new GitResourceImpl(fRepoURI);
			r.load(null);

			final CoreFactory factory = CorePackage.eINSTANCE.getCoreFactory();
			final IJavaProject project = factory.createIJavaProject();
			project.setElementName("Test");
			project.setIsReadOnly(true);
			r.getContents().add(project);
			r.save(null);

			final SourcePackageFragmentRoot root1 = factory.createSourcePackageFragmentRoot();
			root1.setElementName("XYZ");
			project.getPackageFragmentRoots().add(root1);
			r.save(null);

			project.getPackageFragmentRoots().remove(root1);
			r.save(null);

			r.unload();
		}

		final GitResourceImpl r = new GitResourceImpl(fRepoURI);
		r.load(null);
		assertEquals(1, r.getContents().size());
		IJavaProject iJavaProject = (IJavaProject) r.getContents().get(0);

		EList<IPackageFragmentRoot> children = iJavaProject.getPackageFragmentRoots();
		assertEquals(0, children.size());
		assertEquals(0, ((GitEObjectImpl)iJavaProject).getFolder().listFiles(new DirectoryFilter()).length);
	}
}
