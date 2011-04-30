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




/**
 * <h1>Parameter</h1>
 */
public class Parameter
        extends LeafNode
        
{
	private static final long serialVersionUID = 1L;

	// =========================================================================

	public Parameter()
	{
		super();

	}
	public Parameter(String type)
	{
		super();
		setType(type);

	}
	public Parameter(String type, String name)
	{
		super();
		setType(type);
		setName(name);

	}




	// =========================================================================
	// Properties

	private String type;

	public final String getType()
	{
		return this.type;
	}
	
	public final String setType(String type)
	{
		String old = this.type;
		this.type = type;
		return old;
	}
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

	@Override
	public final int getPropertyCount()
	{
		return 2;
	}
	
	@Override
	public final AstNodePropertyIterator propertyIterator()
	{
		return new AstNodePropertyIterator()
		{
			@Override
			protected int getPropertyCount()
			{
				return 2;
			}
			
			@Override
			protected String getName(int index)
			{
				switch (index)
				{
					case 0:
						return "type";
					case 1:
						return "name";

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
						return Parameter.this.getType();
					case 1:
						return Parameter.this.getName();

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
						return Parameter.this.setType((String) value);
					case 1:
						return Parameter.this.setName((String) value);

					default:
						throw new IndexOutOfBoundsException();
				}
			}
		};
	}


	// =========================================================================
	// Children




	// =========================================================================


}
