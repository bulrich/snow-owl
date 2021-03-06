package com.b2international.snowowl.snomed.api.impl.domain;

import com.b2international.snowowl.snomed.api.domain.browser.ISnomedBrowserDescription;
import com.b2international.snowowl.snomed.api.domain.browser.ISnomedBrowserRelationship;
import com.b2international.snowowl.snomed.api.impl.domain.browser.SnomedBrowserConcept;
import com.b2international.snowowl.snomed.api.impl.domain.browser.SnomedBrowserConceptUpdate;
import com.b2international.snowowl.snomed.core.domain.InactivationIndicator;
import com.b2international.snowowl.snomed.datastore.request.BaseSnomedComponentUpdateRequest;
import com.b2international.snowowl.snomed.datastore.request.SnomedComponentCreateRequest;
import com.b2international.snowowl.snomed.datastore.request.SnomedConceptCreateRequest;
import com.b2international.snowowl.snomed.datastore.request.SnomedConceptCreateRequestBuilder;
import com.b2international.snowowl.snomed.datastore.request.SnomedConceptUpdateRequest;
import com.b2international.snowowl.snomed.datastore.request.SnomedConceptUpdateRequestBuilder;
import com.b2international.snowowl.snomed.datastore.request.SnomedDescriptionCreateRequest;
import com.b2international.snowowl.snomed.datastore.request.SnomedRelationshipCreateRequest;
import com.b2international.snowowl.snomed.datastore.request.SnomedRequests;

public class ConceptInputCreator extends AbstractInputCreator implements ComponentInputCreator<SnomedConceptCreateRequest, SnomedConceptUpdateRequest, SnomedBrowserConcept> {
	
	@Override
	public SnomedConceptCreateRequest createInput(final String branchPath, SnomedBrowserConcept concept, InputFactory inputFactory) {
		final SnomedConceptCreateRequestBuilder builder = SnomedRequests
				.prepareNewConcept()
				.setModuleId(getModuleOrDefault(concept))
				.setDefinitionStatus(concept.getDefinitionStatus());
		
		String conceptId = concept.getConceptId();
		if (conceptId != null) {
			builder.setId(conceptId);
		} else {
			builder.setIdFromNamespace(getDefaultNamespace());
		}

		for (ISnomedBrowserRelationship relationship : concept.getRelationships()) {
			builder.addRelationship(inputFactory.createComponentInput(branchPath, relationship, SnomedRelationshipCreateRequest.class));
		}
		
		for (ISnomedBrowserDescription description : concept.getDescriptions()) {
			builder.addDescription(inputFactory.createComponentInput(branchPath, description, SnomedDescriptionCreateRequest.class));
		}

		// TODO remove cast, use only Request interfaces with proper type
		return (SnomedConceptCreateRequest) builder.build();
	}

	@Override
	public SnomedConceptUpdateRequest createUpdate(SnomedBrowserConcept existingVersion, SnomedBrowserConcept newVersion) {
		final SnomedConceptUpdateRequestBuilder snomedConceptUpdate = SnomedRequests
				.prepareUpdateConcept(existingVersion.getConceptId());
		boolean anyDifference = false;

		if (existingVersion.isActive() != newVersion.isActive()) {
			anyDifference = true;
			snomedConceptUpdate.setActive(newVersion.isActive());
		}
		if (!existingVersion.getModuleId().equals(newVersion.getModuleId())) {
			anyDifference = true;
			snomedConceptUpdate.setModuleId(newVersion.getModuleId());
		}
		if (!existingVersion.getDefinitionStatus().equals(newVersion.getDefinitionStatus())) {
			anyDifference = true;
			snomedConceptUpdate.setDefinitionStatus(newVersion.getDefinitionStatus());
		}
		
		if (newVersion instanceof SnomedBrowserConceptUpdate) {
			SnomedBrowserConceptUpdate update = (SnomedBrowserConceptUpdate) newVersion;
			if (!newVersion.isActive()) {
				InactivationIndicator inactivationIndicator = update.getInactivationIndicator();
				if (inactivationIndicator != null) {
					snomedConceptUpdate.setInactivationIndicator(inactivationIndicator);
					anyDifference = true;
				}
			}
		}

		if (anyDifference) {
			// TODO remove cast, use only Request interfaces with proper types
			return (SnomedConceptUpdateRequest) snomedConceptUpdate.build();
		} else {
			return null;
		}
	}

	@Override
	public boolean canCreateInput(Class<? extends SnomedComponentCreateRequest> inputType) {
		return SnomedConceptCreateRequest.class.isAssignableFrom(inputType);
	}

	@Override
	public boolean canCreateUpdate(Class<? extends BaseSnomedComponentUpdateRequest> updateType) {
		return SnomedConceptUpdateRequest.class.isAssignableFrom(updateType);
	}

}
