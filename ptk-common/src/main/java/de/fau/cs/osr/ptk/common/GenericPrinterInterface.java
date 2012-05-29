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

package de.fau.cs.osr.ptk.common;

import java.io.IOException;
import java.io.Writer;

public interface GenericPrinterInterface
{
	public void print(Object ast, Writer out) throws IOException;
	
	/**
	 * Return a name describing the type of text which the printer produces. For
	 * a pretty printer this could be "wikitext", while for a printer which
	 * dumps an AST this could be "ast". The extension should be suitable as
	 * file extension!
	 */
	public String getPrintoutType();
}
