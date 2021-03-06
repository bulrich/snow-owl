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
package com.b2international.snowowl.snomed.reasoner.server.classification;

import java.util.EnumSet;

/**
 */
public enum ReasonerState {
	/** Failure state, ontology and/or reasoner are not loaded */
	FAILED,
	/** Reasoner is not loaded */
	UNLOADED,
	/** Ready for classification */
	IDLE,
	/** Computing taxonomy of OWL classes */
	CLASSIFYING,
	/** Taxonomy is computed and the reasoner is up to date */
	SYNCHRONIZED;
	
	public boolean oneOf(final ReasonerState firstState, final ReasonerState... restStates) {
		return EnumSet.of(firstState, restStates).contains(this);
	}
}