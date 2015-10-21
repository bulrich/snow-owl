/*
 * Copyright 2011-2015 B2i Healthcare Pte Ltd, http://b2i.sg
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.b2international.snowowl.snomed.datastore.server.domain;

import java.util.Collections;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.b2international.snowowl.core.domain.RepositoryContext;
import com.b2international.snowowl.core.exceptions.NotImplementedException;
import com.b2international.snowowl.snomed.core.domain.BaseSnomedComponentCreateRequest;
import com.b2international.snowowl.snomed.core.domain.ISnomedConcept;
import com.b2international.snowowl.snomed.core.domain.IdGenerationStrategy;
import com.b2international.snowowl.snomed.core.domain.SnomedConceptCreateRequest;
import com.b2international.snowowl.snomed.core.domain.SnomedDescriptionCreateRequest;
import com.google.common.collect.ImmutableList;

public class DefaultSnomedConceptCreateRequest extends BaseSnomedComponentCreateRequest<ISnomedConcept> implements SnomedConceptCreateRequest {

	@Size(min = 2)
	private List<SnomedDescriptionCreateRequest> descriptions = Collections.emptyList();

	@NotEmpty
	private String parentId;

	@NotNull
	private IdGenerationStrategy isAIdGenerationStrategy;

	@Override
	public List<SnomedDescriptionCreateRequest> getDescriptions() {
		return descriptions;
	}

	@Override
	public String getParentId() {
		return parentId;
	}

	@Override
	public IdGenerationStrategy getIsAIdGenerationStrategy() {
		return isAIdGenerationStrategy;
	}

	public void setParentId(final String parentId) {
		this.parentId = parentId;
	}

	public void setIsAIdGenerationStrategy(final IdGenerationStrategy isAIdGenerationStrategy) {
		this.isAIdGenerationStrategy = isAIdGenerationStrategy;
	}

	public void setDescriptions(final List<? extends SnomedDescriptionCreateRequest> descriptions) {
		this.descriptions = ImmutableList.copyOf(descriptions);
	}

	@Override
	public ISnomedConcept execute(RepositoryContext context) {
		throw new NotImplementedException();
	}

	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("SnomedConceptInput [getIdGenerationStrategy()=");
		builder.append(getIdGenerationStrategy());
		builder.append(", getModuleId()=");
		builder.append(getModuleId());
		builder.append(", getCodeSystemShortName()=");
		builder.append(getCodeSystemShortName());
		builder.append(", getBranchPath()=");
		builder.append(getBranchPath());
		builder.append(", getParentId()=");
		builder.append(getParentId());
		builder.append(", getIsAIdGenerationStrategy()=");
		builder.append(getIsAIdGenerationStrategy());
		builder.append(", getDescriptions()=");
		builder.append(getDescriptions());
		builder.append("]");
		return builder.toString();
	}
}