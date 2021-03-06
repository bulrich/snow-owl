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
package com.b2international.snowowl.internal.eventbus.net4j;

import org.eclipse.net4j.signal.Request;
import org.eclipse.net4j.signal.RequestWithConfirmation;

import com.b2international.snowowl.eventbus.net4j.IRequestFactory;


/**
 * @since 3.1
 */
public class RequestFactory implements IRequestFactory {

	@Override
	public Request createRequest(EventBusProtocol protocol, short signalID, Object body) {
		return new SendRequest(protocol, signalID, body);
	}
	
	@Override
	public RequestWithConfirmation<Object> createRequestWithConfirmation(EventBusProtocol protocol, short signalID, Object body) {
		return new HandlerChangeRequest(protocol, signalID, body);
	}
	
}