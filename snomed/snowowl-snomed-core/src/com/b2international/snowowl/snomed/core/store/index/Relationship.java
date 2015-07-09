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
 * Represents a relationship.
 * 
 * @since 5.0
 */
public class Relationship extends SnomedComponent {
	private int group;
	private int unionGroup;
	private String typeId;
	private List<String> typeAncestorIds = new ArrayList<>();
	private String destinationId;
	private List<String> destinationAncestorIds = new ArrayList<>();
	private String characteristicTypeId;
	private String modifierId;
	private List<Membership> memberships = new ArrayList<>();
	private List<ConcreteDomain> concreteDomains = new ArrayList<>();

	public int getGroup() {
		return group;
	}

	void setGroup(int group) {
		this.group = group;
	}

	public int getUnionGroup() {
		return unionGroup;
	}

	void setUnionGroup(int unionGroup) {
		this.unionGroup = unionGroup;
	}

	public String getTypeId() {
		return typeId;
	}

	void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public List<String> getTypeAncestorIds() {
		return typeAncestorIds;
	}

	void setTypeAncestorIds(List<String> typeAncestorIds) {
		this.typeAncestorIds = typeAncestorIds;
	}

	public String getDestinationId() {
		return destinationId;
	}

	void setDestinationId(String destinationId) {
		this.destinationId = destinationId;
	}

	public List<String> getDestinationAncestorIds() {
		return destinationAncestorIds;
	}

	void setDestinationAncestorIds(List<String> destinationAncestorIds) {
		this.destinationAncestorIds = destinationAncestorIds;
	}

	public String getCharacteristicTypeId() {
		return characteristicTypeId;
	}

	void setCharacteristicTypeId(String characteristicTypeId) {
		this.characteristicTypeId = characteristicTypeId;
	}

	public String getModifierId() {
		return modifierId;
	}

	void setModifierId(String modifierId) {
		this.modifierId = modifierId;
	}

	public List<Membership> getMemberships() {
		return memberships;
	}

	void setMemberships(List<Membership> memberships) {
		this.memberships = memberships;
	}

	public List<ConcreteDomain> getConcreteDomains() {
		return concreteDomains;
	}

	void setConcreteDomains(List<ConcreteDomain> concreteDomains) {
		this.concreteDomains = concreteDomains;
	}

	public static Relationship of(String[] values) {
		final Relationship relationship = new Relationship();
		relationship.setId(values[0]);
		final Date et = EffectiveTimes.parse(values[1], DateFormats.SHORT);
		relationship.setEffectiveTime(et);
		relationship.setReleased(et != null);
		relationship.setActive("1".equals(values[2]));
		relationship.setModuleId(values[3]);
		relationship.setDestinationId(values[5]);
		relationship.setGroup(Integer.parseInt(values[6]));
		relationship.setTypeId(values[7]);
		relationship.setCharacteristicTypeId(values[8]);
		relationship.setModifierId(values[9]);
		return relationship;
	}

}
