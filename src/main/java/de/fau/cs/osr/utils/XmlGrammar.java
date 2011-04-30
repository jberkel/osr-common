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

public class XmlGrammar
{
	// FIXME: That's not correct due to Java only supporting UTF-16 
	//        The range [#x10000-#xEFFFF] is missing!
	public final static String XmlNameStartCharStr =
			"(?:" +
            ":" +
            "|[A-Z]" +
            "|_" +
            "|[a-z]" +
            "|[\\u00C0-\\u00D6]" +
            "|[\\u00D8-\\u00F6]" +
            "|[\\u00F8-\\u02FF]" +
            "|[\\u0370-\\u037D]" +
            "|[\\u037F-\\u1FFF]" +
            "|[\\u200C-\\u200D]" +
            "|[\\u2070-\\u218F]" +
            "|[\\u2C00-\\u2FEF]" +
            "|[\\u3001-\\uD7FF]" +
            "|[\\uF900-\\uFDCF]" +
            "|[\\uFDF0-\\uFFFD]" +
            "|[\\uD800-\\uDB7F][\\uDC00-\\uDFFF]" + // [#x10000-#xEFFFF]
            ")";
	
	public final static String XmlNameCharStr =
	        "(?:" +
            XmlNameStartCharStr +
            "|-" +
            "|\\." +
            "|[0-9]" +
            "|\\u00B7" +
            "|[\\u0300-\\u036F]" +
            "|[\\u203F-\\u2040]" +
            ")";
	
	public final static String XmlNameStr =
	        "(?:" + XmlNameStartCharStr + XmlNameCharStr + "*)";
	
	public final static String XmlEntityRefStr =
	        "(?:&%" + XmlNameStr + ";)";
	
	public final static String XmlCharRefStr =
	        "(?:&#[0-9]+;|&#x[0-9a-fA-F]+;)";
	
	public final static String XmlReferenceStr =
	        "(?:" + XmlEntityRefStr + "|" + XmlCharRefStr + ")";
}
