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
package com.b2international.snowowl.core.internal.exceptions;

import java.util.Collections;
import java.util.Map;

import com.b2international.snowowl.core.exceptions.ApiError;

/**
 * @since 4.1
 */
public class ApiErrorImpl implements ApiError {

	private String message;
	private String developerMessage;
	private Integer code;
	private Map<String, Object> additionalInformation;

	public ApiErrorImpl(String message, String developerMessage, int code, Map<String, Object> additionalInformation) {
		this.message = message;
		this.developerMessage = developerMessage;
		this.code = code;
		this.additionalInformation = additionalInformation == null ? Collections.<String, Object>emptyMap() : additionalInformation;
	}
	
	@Override
	public String getMessage() {
		return message;
	}

	@Override
	public String getDeveloperMessage() {
		return developerMessage;
	}

	@Override
	public Integer getCode() {
		return code;
	}

	@Override
	public Map<String, Object> getAdditionalInfo() {
		return additionalInformation;
	}

}
