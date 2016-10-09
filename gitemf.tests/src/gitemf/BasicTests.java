package gitemf;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.apache.commons.io.FileUtils;
import org.eclipse.emf.common.util.URI;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import jdtast.gitemf.core.Core.CorePackage;
import jdtast.gitemf.core.Core.IJavaProject;

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
	public void addIJavaProject() throws Exception {
		{
			final GitResourceImpl r = new GitResourceImpl(fRepoURI);
			r.load(null);

			final IJavaProject project = CorePackage.eINSTANCE.getCoreFactory().createIJavaProject();
			project.setElementName("Test");
			r.getContents().add(project);
			assertEquals("Test", project.getElementName());
			r.save(null);
			r.unload();
		}

		final GitResourceImpl r = new GitResourceImpl(fRepoURI);
		r.load(null);
		assertEquals(1, r.getContents().size());
		assertEquals("Test", ((IJavaProject)r.getContents().get(0)).getElementName());
	}
}
