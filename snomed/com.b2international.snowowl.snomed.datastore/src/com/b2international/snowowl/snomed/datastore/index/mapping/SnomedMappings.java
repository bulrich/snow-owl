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
package com.b2international.snowowl.snomed.datastore.index.mapping;

import com.b2international.snowowl.datastore.index.mapping.IndexField;
import com.b2international.snowowl.datastore.index.mapping.IntIndexField;
import com.b2international.snowowl.datastore.index.mapping.LongIndexField;
import com.b2international.snowowl.datastore.index.mapping.Mappings;
import com.b2international.snowowl.datastore.index.mapping.NumericDocValuesIndexField;

/**
 * @since 4.3
 */
public class SnomedMappings {

	public static final Long ROOT_ID = -1L;
	
	// common component fields
	private static final String COMPONENT_MODULE_ID_FIELD_NAME = "component_module_id";
	private static final String COMPONENT_ACTIVE_FIELD_NAME = "component_active";
	
	// relationship fields
	private static final String RELATIONSHIP_ATTRIBUTE_ID_FIELD_NAME = "relationship_attribute_id";
	private static final String RELATIONSHIP_CHARACTERISTIC_TYPE_ID_FIELD_NAME = "relationship_characteristic_type_id";
	
	// description fields
	private static final String DESCRIPTION_TYPE_ID_FIELD_NAME = "description_type_id";
	private static final String DESCRIPTION_CONCEPT_ID_FIELD_NAME = "description_concept_id";
	
	// reference set member fields
	private static final String REFERENCE_SET_MEMBER_REFERENCED_COMPONENT_ID_FIELD_NAME = "ref_set_member_referenced_component_id";
	private static final String REFERENCE_SET_MEMBER_REFERENCE_SET_ID_FIELD_NAME = "ref_set_member_reference_set_id";
	private static final String REFERENCE_SET_MEMBER_REFERENCE_SET_TYPE_FIELD_NAME = "ref_set_member_reference_set_type";
	private static final String REFERENCE_SET_MEMBER_REFERENCED_COMPONENT_TYPE_FIELD_NAME = "ref_set_member_referenced_component_type";

	// overridden SNOMED CT specific common field instances
	private static final NumericDocValuesIndexField<Long> COMPONENT_ID = Mappings.longDocValuesField(Mappings.id().fieldName());
	private static final NumericDocValuesIndexField<Long> COMPONENT_ICON_ID = Mappings.longDocValuesField(Mappings.iconId().fieldName());

	// default parent and ancestor fields are used for inferred taxonomy
	private static final LongIndexField COMPONENT_PARENT = parent("");
	private static final LongIndexField COMPONENT_ANCESTOR = ancestor("");
	
	// pre-constructed IndexField instances
	private static final NumericDocValuesIndexField<Long> REFERENCE_SET_MEMBER_REFERENCED_COMPONENT_ID = Mappings.longDocValuesField(REFERENCE_SET_MEMBER_REFERENCED_COMPONENT_ID_FIELD_NAME);
	private static final NumericDocValuesIndexField<Long> REFERENCE_SET_MEMBER_REFERENCE_SET_ID = Mappings.longDocValuesField(REFERENCE_SET_MEMBER_REFERENCE_SET_ID_FIELD_NAME);
	private static final NumericDocValuesIndexField<Long> COMPONENT_MODULE = Mappings.longDocValuesField(COMPONENT_MODULE_ID_FIELD_NAME);
	private static final IndexField<Integer> COMPONENT_ACTIVE = Mappings.intField(COMPONENT_ACTIVE_FIELD_NAME);
	private static final IntIndexField REFERENCE_SET_MEMBER_REFERENCE_SET_TYPE = Mappings.intField(REFERENCE_SET_MEMBER_REFERENCE_SET_TYPE_FIELD_NAME);
	private static final IntIndexField REFERENCE_SET_MEMBER_REFERENCED_COMPONENT_TYPE = Mappings.intField(REFERENCE_SET_MEMBER_REFERENCED_COMPONENT_TYPE_FIELD_NAME);
	private static final NumericDocValuesIndexField<Long> RELATIONSHIP_TYPE = Mappings.longDocValuesField(RELATIONSHIP_ATTRIBUTE_ID_FIELD_NAME);
	private static final NumericDocValuesIndexField<Long> RELATIONSHIP_CHARACTERISTIC_TYPE = Mappings.longDocValuesField(RELATIONSHIP_CHARACTERISTIC_TYPE_ID_FIELD_NAME);
	private static final NumericDocValuesIndexField<Long> DESCRIPTION_TYPE_ID = Mappings.longDocValuesField(DESCRIPTION_TYPE_ID_FIELD_NAME);
	private static final NumericDocValuesIndexField<Long> DESCRIPTION_CONCEPT_ID = Mappings.longDocValuesField(DESCRIPTION_CONCEPT_ID_FIELD_NAME);
	
	public static boolean isRoot(long parent) {
		return ROOT_ID == parent;
	}
	
	public static NumericDocValuesIndexField<Long> id() {
		return COMPONENT_ID;
	}
	
	public static LongIndexField parent() {
		return COMPONENT_PARENT;
	}
	
	public static LongIndexField parent(String fieldNameSuffix) {
		return (LongIndexField) Mappings.longField(Mappings.parent().fieldName() + fieldNameSuffix);
	}
	
	public static LongIndexField ancestor() {
		return COMPONENT_ANCESTOR;
	}
	
	public static LongIndexField ancestor(String fieldNameSuffix) {
		return (LongIndexField) Mappings.longField(Mappings.ancestor().fieldName() + fieldNameSuffix);
	}
	
	public static NumericDocValuesIndexField<Long> iconId() {
		return COMPONENT_ICON_ID;
	}
	
	public static NumericDocValuesIndexField<Long> memberReferencedComponentId() {
		return REFERENCE_SET_MEMBER_REFERENCED_COMPONENT_ID;
	}
	
	public static IntIndexField memberReferencedComponentType() {
		return REFERENCE_SET_MEMBER_REFERENCED_COMPONENT_TYPE;
	}

	public static NumericDocValuesIndexField<Long> memberRefSetId() {
		return REFERENCE_SET_MEMBER_REFERENCE_SET_ID;
	}
	
	public static IntIndexField memberRefSetType() {
		return REFERENCE_SET_MEMBER_REFERENCE_SET_TYPE;
	}
	
	public static NumericDocValuesIndexField<Long> module() {
		return COMPONENT_MODULE;
	}
	
	public static IndexField<Integer> active() {
		return COMPONENT_ACTIVE;
	}
	
	public static NumericDocValuesIndexField<Long> relationshipType() {
		return RELATIONSHIP_TYPE;
	}
	
	public static NumericDocValuesIndexField<Long> relationshipCharacteristicType() {
		return RELATIONSHIP_CHARACTERISTIC_TYPE;
	}
	
	public static NumericDocValuesIndexField<Long> descriptionType() {
		return DESCRIPTION_TYPE_ID;
	}
	
	public static NumericDocValuesIndexField<Long> descriptionConcept() {
		return DESCRIPTION_CONCEPT_ID;
	}
	
	public static SnomedQueryBuilder newQuery() {
		return new SnomedQueryBuilder();
	}

	public static SnomedFieldsToLoadBuilder fieldsToLoad() {
		return new SnomedFieldsToLoadBuilder();
	}

	public static SnomedDocumentBuilder doc() {
		return new SnomedDocumentBuilder();
	}

}
