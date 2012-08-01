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

/* 
 * This file is auto-generated.
 * DO NOT MODIFY MANUALLY!
 * 
 * Generated by AstNodeGenerator.
 * Last generated: 2011-04-13 23:18:40.
 */

package de.fau.cs.osr.ptk.printergen.parser;

import de.fau.cs.osr.ptk.common.ast.*;
import java.util.List;




/**
 * <h1>Intro</h1>
 */
public class Intro
        extends InnerNode.InnerNode1
        
{
	private static final long serialVersionUID = 1L;

	// =========================================================================

	public Intro()
	{
		super(new NodeList());

	}
	public Intro(String name, String package_, List<String> implements_, NodeList ctorParams, String header, String body, String footer)
	{
		super(ctorParams);
		setName(name);
		setPackage(package_);
		setImplements(implements_);
		setHeader(header);
		setBody(body);
		setFooter(footer);

	}




	// =========================================================================
	// Properties

	private String name;

	public final String getName()
	{
		return this.name;
	}
	
	public final String setName(String name)
	{
		String old = this.name;
		this.name = name;
		return old;
	}
	private String package_;

	public final String getPackage()
	{
		return this.package_;
	}
	
	public final String setPackage(String package_)
	{
		String old = this.package_;
		this.package_ = package_;
		return old;
	}
	private List<String> implements_;

	public final List<String> getImplements()
	{
		return this.implements_;
	}
	
	public final List<String> setImplements(List<String> implements_)
	{
		List<String> old = this.implements_;
		this.implements_ = implements_;
		return old;
	}
	private String header;

	public final String getHeader()
	{
		return this.header;
	}
	
	public final String setHeader(String header)
	{
		String old = this.header;
		this.header = header;
		return old;
	}
	private String body;

	public final String getBody()
	{
		return this.body;
	}
	
	public final String setBody(String body)
	{
		String old = this.body;
		this.body = body;
		return old;
	}
	private String footer;

	public final String getFooter()
	{
		return this.footer;
	}
	
	public final String setFooter(String footer)
	{
		String old = this.footer;
		this.footer = footer;
		return old;
	}

	@Override
	public final int getPropertyCount()
	{
		return 6;
	}
	
	@Override
	public final AstNodePropertyIterator propertyIterator()
	{
		return new AstNodePropertyIterator()
		{
			@Override
			protected int getPropertyCount()
			{
				return 6;
			}
			
			@Override
			protected String getName(int index)
			{
				switch (index)
				{
					case 0:
						return "name";
					case 1:
						return "package";
					case 2:
						return "implements";
					case 3:
						return "header";
					case 4:
						return "body";
					case 5:
						return "footer";

					default:
						throw new IndexOutOfBoundsException();
				}
			}
			
			@Override
			protected Object getValue(int index)
			{
				switch (index)
				{
					case 0:
						return Intro.this.getName();
					case 1:
						return Intro.this.getPackage();
					case 2:
						return Intro.this.getImplements();
					case 3:
						return Intro.this.getHeader();
					case 4:
						return Intro.this.getBody();
					case 5:
						return Intro.this.getFooter();

					default:
						throw new IndexOutOfBoundsException();
				}
			}
			
			@Override
			protected Object setValue(int index, Object value)
			{
				switch (index)
				{
					case 0:
						return Intro.this.setName((String) value);
					case 1:
						return Intro.this.setPackage((String) value);
					case 2:
						return Intro.this.setImplements((List<String>) value);
					case 3:
						return Intro.this.setHeader((String) value);
					case 4:
						return Intro.this.setBody((String) value);
					case 5:
						return Intro.this.setFooter((String) value);

					default:
						throw new IndexOutOfBoundsException();
				}
			}
		};
	}


	// =========================================================================
	// Children

	public final void setCtorParams(NodeList ctorParams)
	{
		set(0, ctorParams);
	}
	
	public final NodeList getCtorParams()
	{
		return (NodeList) get(0);
	}

	private static final String[] CHILD_NAMES = new String[] {"ctorParams"};

	public final String[] getChildNames()
	{
		return CHILD_NAMES;
	}


	// =========================================================================


}