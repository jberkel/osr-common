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

package de.fau.cs.osr.utils;

public interface DeepComparerDelegate
{
	/**
	 * @return Returns false if the two objects cannot be compared by this
	 *         delegate. Returns true if the two objects were compared and
	 *         turned out to be equal. Otherwise an exception is thrown.
	 * @throws ComparisonException
	 *             Thrown if the two objects could be compared by this delegate
	 *             and turned out to be different.
	 */
	public boolean compare(Object a, Object b, DeepComparer comparer) throws ComparisonException;
}
