package com.criticalsoftware.panorama.failurelogic.traces;

import java.util.List;

import org.eclipse.capra.core.adapters.AbstractArtifactMetaModelAdapter;
import org.eclipse.capra.generic.artifactmodel.ArtifactWrapper;
import org.eclipse.capra.generic.artifactmodel.ArtifactWrapperContainer;
import org.eclipse.capra.generic.artifactmodel.ArtifactmodelFactory;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EObject;

public class FailureArtifactMetaModelAdapter extends AbstractArtifactMetaModelAdapter {

	private ArtifactWrapperContainer getContainer(EObject artifactModel) {
		return (ArtifactWrapperContainer) artifactModel;
	}

	@Override
	public EObject createModel() {
		return ArtifactmodelFactory.eINSTANCE.createArtifactWrapperContainer();
	}

	@Override
	public EObject getArtifact(EObject artifactModel, String artifactHandler, String artifactUri) {
		ArtifactWrapperContainer container = getContainer(artifactModel);
		for (ArtifactWrapper artifact : container.getArtifacts()) {
			if (getArtifactHandler(artifact).equals(artifactHandler) && getArtifactUri(artifact).equals(artifactUri))
				return artifact;
		}
		return null;
	}

	@Override
	public EObject createArtifact(EObject artifactModel, String artifactHandler, String artifactUri, String artifactId,
			String artifactName, String artifactPath) {
		ArtifactWrapperContainer container = getContainer(artifactModel);
		EObject existingWrapper = getArtifact(artifactModel, artifactHandler, artifactUri);
		if (existingWrapper != null)
			return existingWrapper;

		ArtifactWrapper wrapper = ArtifactmodelFactory.eINSTANCE.createArtifactWrapper();
		wrapper.setArtifactHandler(artifactHandler);
		wrapper.setUri(artifactUri);
		wrapper.setName(artifactName);
		wrapper.setPath(artifactPath);
		wrapper.setIdentifier(artifactId);
		container.getArtifacts().add(wrapper);

		return wrapper;
	}

	@Override
	public String getArtifactHandler(EObject artifact) {
		if (artifact instanceof ArtifactWrapper) {
			ArtifactWrapper wrapper = (ArtifactWrapper) artifact;
			return wrapper.getArtifactHandler();
		}
		return null;
	}

	@Override
	public String getArtifactName(EObject artifact) {
		if (artifact instanceof ArtifactWrapper) {
			ArtifactWrapper wrapper = (ArtifactWrapper) artifact;
			return wrapper.getName();
		}
		return null;
	}

	@Override
	public String getArtifactUri(EObject artifact) {
		if (artifact instanceof ArtifactWrapper) {
			ArtifactWrapper wrapper = (ArtifactWrapper) artifact;
			return wrapper.getUri();
		}
		return null;
	}

	@Override
	public String getArtifactIdentifier(EObject artifact) {
		if (artifact instanceof ArtifactWrapper) {
			ArtifactWrapper wrapper = (ArtifactWrapper) artifact;
			return wrapper.getIdentifier();
		}
		return null;
	}

	@Override
	public IPath getArtifactPath(EObject artifact) {
		if (artifact instanceof ArtifactWrapper) {
			ArtifactWrapper wrapper = (ArtifactWrapper) artifact;
			return new Path(wrapper.getPath());
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<EObject> getAllArtifacts(EObject artifactModel) {
		ArtifactWrapperContainer container = getContainer(artifactModel);
		return (List<EObject>) (Object) container.getArtifacts();
	}

}