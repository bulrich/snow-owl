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
package com.b2international.snowowl.core.exceptions;

import java.util.Collection;
import java.util.Map;

import javax.validation.ConstraintViolation;

import com.b2international.commons.validation.ConstraintViolations;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;


/**
 * @since 4.1.1
 */
public class ValidationException extends BadRequestException {

	private static final long serialVersionUID = 5786944138934316434L;
	private Collection<? extends ConstraintViolation<?>> violations;

	public ValidationException(Collection<? extends ConstraintViolation<?>> violations) {
		super("%s validation error%s", violations.size(), violations.size() == 1 ? "" : "s");
		this.violations = violations;
	}
	
	@Override
	protected Map<String, Object> getAdditionalInfo() {
		final Builder<String, Object> builder = ImmutableMap.<String, Object>builder();
		return builder.put("violations", ConstraintViolations.format(this.violations)).build();
	}
	
}
