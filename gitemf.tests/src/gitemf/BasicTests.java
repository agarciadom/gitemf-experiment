package gitemf;

import static org.junit.Assert.assertEquals;

import org.eclipse.emf.common.util.EList;
import org.junit.Test;

import jdtast.gitemf.core.Core.BinaryPackageFragmentRoot;
import jdtast.gitemf.core.Core.CoreFactory;
import jdtast.gitemf.core.Core.CorePackage;
import jdtast.gitemf.core.Core.IJavaProject;
import jdtast.gitemf.core.Core.IPackageFragmentRoot;
import jdtast.gitemf.core.Core.SourcePackageFragmentRoot;

public class BasicTests extends AbstractTest {

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
