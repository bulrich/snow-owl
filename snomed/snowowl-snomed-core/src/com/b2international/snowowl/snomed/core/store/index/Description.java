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
package com.b2international.snowowl.snomed.core.store.index;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.b2international.snowowl.core.date.DateFormats;
import com.b2international.snowowl.core.date.EffectiveTimes;

/**
 * Represents a description.
 * 
 * @since 5.0
 */
public class Description extends SnomedComponent {
	private String typeId;
	private String languageCode;
	private String caseSensitivityId;
	private String term;
	private List<Membership> memberships = new ArrayList<>();

	public String getTypeId() {
		return typeId;
	}

	void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public String getLanguageCode() {
		return languageCode;
	}

	void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}

	public String getCaseSensitivityId() {
		return caseSensitivityId;
	}

	void setCaseSensitivityId(String caseSensitivityId) {
		this.caseSensitivityId = caseSensitivityId;
	}

	public String getTerm() {
		return term;
	}

	void setTerm(String term) {
		this.term = term;
	}

	public List<Membership> getMemberships() {
		return memberships;
	}

	void setMemberships(List<Membership> memberships) {
		this.memberships = memberships;
	}

	public static Description of(String[] values) {
		final Description description = new Description();
		description.setId(values[0]);
		final Date et = EffectiveTimes.parse(values[1], DateFormats.SHORT);
		description.setEffectiveTime(et);
		description.setReleased(et != null);
		description.setActive("1".equals(values[2]));
		description.setModuleId(values[3]);
		description.setLanguageCode(values[5]);
		description.setTypeId(values[6]);
		description.setTerm(values[7]);
		description.setCaseSensitivityId(values[8]);
		return description;
	}
	
	@Override
	public String toString() {
		return String.format("Description[%s]", getId(), EffectiveTimes.format(getEffectiveTime(), DateFormats.SHORT));
	}

}
