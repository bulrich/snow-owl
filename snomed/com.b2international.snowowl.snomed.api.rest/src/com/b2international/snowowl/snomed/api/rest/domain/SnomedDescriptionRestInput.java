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
package com.b2international.snowowl.snomed.api.rest.domain;

import java.util.Map;

import com.b2international.snowowl.core.terminology.ComponentCategory;
import com.b2international.snowowl.snomed.api.domain.Acceptability;
import com.b2international.snowowl.snomed.api.domain.CaseSignificance;
import com.b2international.snowowl.snomed.api.impl.domain.SnomedDescriptionInput;

/**
 * @since 1.0
 */
public class SnomedDescriptionRestInput extends AbstractSnomedComponentRestInput<SnomedDescriptionInput> {

	private String typeId;
	private String term;
	private String languageCode;
	private String conceptId;
	private CaseSignificance caseSignificance = CaseSignificance.INITIAL_CHARACTER_CASE_INSENSITIVE;
	private Map<String, Acceptability> acceptability;

	/**
	 * @return
	 */
	public String getTypeId() {
		return typeId;
	}

	/**
	 * @return
	 */
	public String getTerm() {
		return term;
	}

	/**
	 * @return
	 */
	public String getLanguageCode() {
		return languageCode;
	}

	/**
	 * @return
	 */
	public String getConceptId() {
		return conceptId;
	}

	/**
	 * @return
	 */
	public CaseSignificance getCaseSignificance() {
		return caseSignificance;
	}

	public Map<String, Acceptability> getAcceptability() {
		return acceptability;
	}

	public void setTypeId(final String typeId) {
		this.typeId = typeId;
	}

	public void setTerm(final String term) {
		this.term = term;
	}

	public void setLanguageCode(final String languageCode) {
		this.languageCode = languageCode;
	}

	public void setConceptId(final String conceptId) {
		this.conceptId = conceptId;
	}

	public void setCaseSignificance(final CaseSignificance caseSignificance) {
		this.caseSignificance = caseSignificance;
	}

	public void setAcceptability(final Map<String, Acceptability> acceptability) {
		this.acceptability = acceptability;
	}

	@Override
	protected SnomedDescriptionInput createComponentInput() {
		return new SnomedDescriptionInput();
	}

	/**
	 * @return
	 */
	@Override
	public SnomedDescriptionInput toComponentInput(final String branchPath, final String codeSystemShortName) {
		final SnomedDescriptionInput result = super.toComponentInput(branchPath, codeSystemShortName);

		result.setCaseSignificance(getCaseSignificance());
		result.setConceptId(getConceptId());
		result.setLanguageCode(getLanguageCode());
		result.setTerm(getTerm());
		result.setTypeId(getTypeId());
		result.setAcceptability(getAcceptability());

		return result;
	}

	@Override
	protected ComponentCategory getComponentCategory() {
		return ComponentCategory.DESCRIPTION;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SnomedDescriptionRestInput [typeId=");
		builder.append(typeId);
		builder.append(", term=");
		builder.append(term);
		builder.append(", languageCode=");
		builder.append(languageCode);
		builder.append(", conceptId=");
		builder.append(conceptId);
		builder.append(", caseSignificance=");
		builder.append(caseSignificance);
		builder.append(", acceptability=");
		builder.append(acceptability);
		builder.append("]");
		return builder.toString();
	}
}