package gitemf;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.apache.commons.io.FileUtils;
import org.eclipse.emf.common.util.URI;
import org.junit.After;
import org.junit.Before;

public abstract class AbstractTest {

	private File fRepo;
	protected URI fRepoURI;

	public AbstractTest() {
		super();
	}

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

}