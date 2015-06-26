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
package com.b2international.snowowl.snomed.core.index.comparators;

import java.util.Comparator;

import com.b2international.snowowl.snomed.core.index.Label;
import com.google.common.collect.Ordering;

/**
 * @since 5.0
 */
public class LabelComparator implements Comparator<Label> {

	final private ListComparator<String> stringListComparator = new ListComparator<>(Ordering.<String> natural());

	@Override
	public int compare(Label o1, Label o2) {
		int termComparison = CompareUtils.nullSafeCompare(o1.getTerm(), o2.getTerm());
		if (termComparison != 0)
			return termComparison;
		int typeIdComparison = CompareUtils.nullSafeCompare(o1.getTypeId(), o2.getTypeId());
		if (typeIdComparison != 0)
			return typeIdComparison;
		int acceptableIdsComparison = stringListComparator.compare(o1.getAcceptableIds(), o2.getAcceptableIds());
		if (acceptableIdsComparison != 0)
			return acceptableIdsComparison;
		int preferredIdsComparison = stringListComparator.compare(o1.getPreferredIds(), o2.getPreferredIds());
		if (preferredIdsComparison != 0)
			return preferredIdsComparison;
		return 0;
	}

}
