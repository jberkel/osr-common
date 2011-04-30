/**
 * Copyright 2011 The Open Source Research Group,
 *                University of Erlangen-Nürnberg
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.fau.cs.osr.ptk.common.ast;

import java.util.ListIterator;

interface AstChildIterator
        extends
            ListIterator<AstNode>
{
	/**
	 * Returns the child last returned by a call to previous() or next(). This
	 * method can only be called after previous() or next() have been called and
	 * must not be called after a call to remove() or add().
	 */
	public AstNode get();
	
	/**
	 * Resets the iterator.
	 */
	public void reset();
}
