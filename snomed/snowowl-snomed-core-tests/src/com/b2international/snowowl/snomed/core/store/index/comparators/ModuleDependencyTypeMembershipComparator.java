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
package com.b2international.snowowl.snomed.core.store.index.comparators;

import com.b2international.snowowl.snomed.core.store.index.ModuleDependencyTypeMembership;

/**
 * @since 5.0
 */
public class ModuleDependencyTypeMembershipComparator extends MembershipComparator<ModuleDependencyTypeMembership> {
	@Override
	public int compare(ModuleDependencyTypeMembership o1, ModuleDependencyTypeMembership o2) {
		int membershipComparison = super.compare(o1, o2);
		if (membershipComparison != 0)
			return membershipComparison;
		int sourceEffectiveDateComparison = CompareUtils.nullSafeCompare(o1.getSourceEffectiveTime(), o2.getSourceEffectiveTime());
		if (sourceEffectiveDateComparison != 0)
			return sourceEffectiveDateComparison;
		int targetEffectiveDateComparison = CompareUtils.nullSafeCompare(o1.getTargetEffectiveTime(), o2.getTargetEffectiveTime());
		if (targetEffectiveDateComparison != 0)
			return targetEffectiveDateComparison;
		return 0;
	}
}