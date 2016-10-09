package gitemf;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.InternalEObject.EStore;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.jgit.api.CommitCommand;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.revwalk.RevCommit;

import gitemf.estores.GitEStore;

public class GitResourceImpl extends ResourceImpl {

	private static final String ECLASS_FNAME = "eclass";

	private static final class DirectoryFilter implements FileFilter {
		@Override
		public boolean accept(File pathname) {
			return pathname.isDirectory();
		}
	}

	public static final String SCHEME = "gitemf";

	private Git git;
	private GitEStore store;

	public GitResourceImpl(URI uri) throws IOException {
		this.uri = uri;
		getURIConverter().getURIHandlers().add(0, new GitURIHandler());
	}

	public File getModelFolder() {
		return new File(git.getRepository().getWorkTree(), "model");
	}

	@Override
	public String getURIFragment(EObject eObject) {
		throw new UnsupportedOperationException("not implemented yet");
	}

	@Override
	public EObject getEObject(String uriFragment) {
		throw new UnsupportedOperationException("not implemented yet");
	}

	@Override
	protected void doSave(OutputStream os, Map<?, ?> options) throws IOException {
		try {
			// TODO accept commit message / author in options
			prepareCommitInfo("resource save").setAll(true).call();
		} catch (GitAPIException e) {
			throw new IOException(e);
		}
	}

	@Override
	protected void doLoad(InputStream is, Map<?, ?> options) throws IOException {
		try {
			final File fFolder = new File(uri.path());
			if (!fFolder.exists() || fFolder.list().length == 0) {
				fFolder.mkdirs();
				Git.init().setDirectory(fFolder).call();
			}
			git = Git.open(fFolder);
			store = new GitEStore(git);

			File fAttributes = new File(fFolder, ".gitattributes");
			if (!fAttributes.exists()) {
				// TODO move contents of this to resource file
				FileUtils.write(fAttributes, "irefs\tfilter=union");

				git.add().addFilepattern(fAttributes.getPath()).call();
				prepareCommitInfo("repo init").setAll(true).call();
			}

			for (RevCommit commit : git.log().setMaxCount(1).call()) {
				setTimeStamp(commit.getCommitTime());
			}

			File modelFolder = getModelFolder();
			modelFolder.mkdirs();
			for (File f : modelFolder.listFiles(new DirectoryFilter())) {
				EClass eClass = loadEClassFile(f);

				EObject eob = eClass.getEPackage().getEFactoryInstance().create(eClass);
				if (eob instanceof GitEObjectImpl) {
					GitEObjectImpl geob = (GitEObjectImpl)eob;
					geob.setFolder(f);
					geob.eSetStore(store);
				}

				getContents().add(eob);
			}
		} catch (GitAPIException e) {
			throw new IOException(e);
		}
	}

	@Override
	protected void doUnload() {
		if (git != null) {
			git.close();
			git = null;
		}
	}

	public EStore eStore() {
		return store;
	}

	protected CommitCommand prepareCommitInfo(String msg) {
		return git.commit()
			.setMessage(msg)
			.setAuthor("gitemf", "author@example.com");
	}

	@Override
	public void attached(EObject eObject) {
		super.attached(eObject);
		if (eObject instanceof GitEObjectImpl) {
			((GitEObjectImpl)eObject).attach(this);
		}
	}

	public void saveEClassFile(GitEObjectImpl geob) throws IOException {
		// Create file indicating type
		try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(geob.getFolder(), ECLASS_FNAME)), "UTF-8"))) {
			EClass eClass = geob.eClass();
			writer.write(eClass.getEPackage().getNsURI());
			writer.write("\n");
			writer.write(eClass.getName());
		}
	}

	public EClass loadEClassFile(File folder) throws IOException {
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(new File(folder, ECLASS_FNAME)), "UTF-8"))) {
			String nsURI = reader.readLine();
			String className = reader.readLine();
			
			EPackage.Registry registry = getResourceSet() != null ? getResourceSet().getPackageRegistry() : EPackage.Registry.INSTANCE;
			return (EClass) registry.getEPackage(nsURI).getEClassifier(className);
		}
	}
	
}
