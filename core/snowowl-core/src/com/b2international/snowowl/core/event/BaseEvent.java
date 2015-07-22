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
package com.b2international.snowowl.core.event;

import com.b2international.snowowl.core.MetadataHolderImpl;
import com.b2international.snowowl.core.event.util.AsyncSupport;
import com.b2international.snowowl.core.event.util.Promise;
import com.b2international.snowowl.eventbus.IEventBus;
import com.b2international.snowowl.eventbus.IHandler;
import com.b2international.snowowl.eventbus.IMessage;

/**
 * @since 4.1
 */
public abstract class BaseEvent extends MetadataHolderImpl implements Event {

	@Override
	public void send(IEventBus bus) {
		send(bus, (IHandler<IMessage>) null);
	}

	@Override
	public void send(IEventBus bus, IHandler<IMessage> replyHandler) {
		bus.send(getAddress(), this, replyHandler);
	}
	
	@Override
	public final <T> Promise<T> send(IEventBus bus, Class<T> returnType) {
		return new AsyncSupport<T>(bus, returnType).send(this);
	}

	/**
	 * Returns the address as the destination of this {@link Event}.
	 * 
	 * @return
	 */
	protected abstract String getAddress();

}
