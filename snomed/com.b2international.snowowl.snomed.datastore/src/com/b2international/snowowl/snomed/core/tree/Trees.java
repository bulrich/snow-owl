/*
 * Copyright 2011-2016 B2i Healthcare Pte Ltd, http://b2i.sg
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
package com.b2international.snowowl.snomed.core.tree;

import java.util.List;

import com.b2international.commons.http.ExtendedLocale;
import com.b2international.snowowl.eventbus.IEventBus;
import com.b2international.snowowl.snomed.datastore.BaseSnomedClientTerminologyBrowser;

/**
 * @since 4.6
 */
public class Trees {
	
	public static final String STATED_FORM = "stated";
	public static final String INFERRED_FORM = "inferred";
	
	public static TreeBuilder newInferredTree(String branch, List<ExtendedLocale> locales, BaseSnomedClientTerminologyBrowser browser, IEventBus bus) {
		return new TreeBuilderImpl(INFERRED_FORM, branch, locales, browser, bus);
	}
	
	public static TreeBuilder newStatedTree(String branch, List<ExtendedLocale> locales, BaseSnomedClientTerminologyBrowser browser, IEventBus bus) {
		return new TreeBuilderImpl(STATED_FORM, branch, locales, browser, bus);
	}

}