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
package com.b2international.snowowl.datastore.editor.notification;

import com.b2international.snowowl.datastore.editor.operation.status.IOperationExecutionStatus;

/**
 * @since 2.8
 */
public class OperationExecutionStatusNotificationMessage extends NotificationMessage<IOperationExecutionStatus> {

	private static final long serialVersionUID = -5148356752421464433L;

	public OperationExecutionStatusNotificationMessage(IOperationExecutionStatus status, String message) {
		super(status, message);
	}

}