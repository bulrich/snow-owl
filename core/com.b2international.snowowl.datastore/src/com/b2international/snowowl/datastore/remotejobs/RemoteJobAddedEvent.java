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
package com.b2international.snowowl.datastore.remotejobs;

import java.io.Serializable;

/**
 */
public final class RemoteJobAddedEvent extends AbstractRemoteJobEvent implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private final RemoteJobEntry entry;

	public RemoteJobAddedEvent(final RemoteJobEntry entry) {
		this.entry = entry;
	}
	
	public RemoteJobEntry getEntry() {
		return entry;
	}
	
	@Override
	/* package */ void accept(final RemoteJobEventSwitch eventSwitch) {
		eventSwitch.caseAdded(this);
	}
}