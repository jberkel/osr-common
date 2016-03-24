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
package de.fau.cs.osr.ptk.common.test.nodes;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import de.fau.cs.osr.ptk.common.ast.AstNode;
import de.fau.cs.osr.ptk.common.ast.AstNodePropertyIterator;
import xtc.tree.Locatable;
import xtc.tree.Location;
import xtc.util.Pair;

public abstract class CtnEmptyImmutableNode
		implements
			CtnNode
{
	private static final long serialVersionUID = -8143436141986490761L;

	// =========================================================================

	protected String genMsg()
	{
		return "You are operating on an immutable " + getNodeName() + " object!";
	}

	// =========================================================================

	@Override
	public boolean hasLocation()
	{
		return false;
	}

	@Override
	public Location getLocation()
	{
		return null;
	}

	@Override
	public void setLocation(Location location)
	{
		// This is called by the parser, can't prevent that ...
	}

	@Override
	public void setLocation(Locatable locatable)
	{
		// This is called by the parser, can't prevent that ...
	}

	// =========================================================================

	@Override
	public boolean hasAttributes()
	{
		return false;
	}

	@Override
	public Map<String, Object> getAttributes()
	{
		return Collections.emptyMap();
	}

	@Override
	public void setAttributes(Map<String, Object> attrs)
	{
		throw new UnsupportedOperationException(genMsg());
	}

	@Override
	public void clearAttributes()
	{
		throw new UnsupportedOperationException(genMsg());
	}

	@Override
	public boolean hasAttribute(String name)
	{
		return false;
	}

	@Override
	public Object getAttribute(String name)
	{
		return null;
	}

	@Override
	public Object setAttribute(String name, Object value)
	{
		throw new UnsupportedOperationException(genMsg());
	}

	@Override
	public Object removeAttribute(String name)
	{
		throw new UnsupportedOperationException(genMsg());
	}

	@Override
	public int getIntAttribute(String name)
	{
		return 0;
	}

	@Override
	public Integer setIntAttribute(String name, Integer value)
	{
		throw new UnsupportedOperationException(genMsg());
	}

	@Override
	public boolean getBooleanAttribute(String name)
	{
		return false;
	}

	@Override
	public boolean setBooleanAttribute(String name, boolean value)
	{
		throw new UnsupportedOperationException(genMsg());
	}

	@Override
	public String getStringAttribute(String name)
	{
		return null;
	}

	@Override
	public String setStringAttribute(String name, String value)
	{
		throw new UnsupportedOperationException(genMsg());
	}

	// =========================================================================

	@Override
	public boolean hasProperties()
	{
		return false;
	}

	@Override
	public int getPropertyCount()
	{
		return 0;
	}

	@Override
	public Object getProperty(String name)
	{
		throw new UnsupportedOperationException(genMsg());
	}

	@Override
	public Object getProperty(String name, Object default_)
	{
		return default_;
	}

	@Override
	public boolean hasProperty(String name)
	{
		return false;
	}

	@Override
	public Object setProperty(String name, Object value)
	{
		throw new UnsupportedOperationException(genMsg());
	}

	@Override
	public AstNodePropertyIterator propertyIterator()
	{
		return new AstNodePropertyIterator()
		{
			@Override
			protected Object setValue(int index, Object value)
			{
				throw new UnsupportedOperationException(genMsg());
			}

			@Override
			protected Object getValue(int index)
			{
				throw new UnsupportedOperationException(genMsg());
			}

			@Override
			protected int getPropertyCount()
			{
				return 0;
			}

			@Override
			protected String getName(int index)
			{
				throw new UnsupportedOperationException(genMsg());
			}
		};
	}

	// =========================================================================

	@Override
	public abstract int getNodeType();

	@Override
	public boolean isNodeType(int testType)
	{
		return getNodeType() == testType;
	}

	@Override
	public final String getNodeTypeName()
	{
		return getClass().getName();
	}

	@Override
	public abstract String getNodeName();

	@Override
	public de.fau.cs.osr.ptk.common.ast.AstLocation getNativeLocation()
	{
		return null;
	}

	@Override
	public void setNativeLocation(
			de.fau.cs.osr.ptk.common.ast.AstLocation location)
	{
		throw new UnsupportedOperationException(genMsg());
	}

	@Override
	public boolean addAll(Pair<? extends CtnNode> p)
	{
		throw new UnsupportedOperationException(genMsg());
	}

	@Override
	public boolean isList()
	{
		return false;
	}

	@Override
	public String[] getChildNames()
	{
		return EMPTY_CHILD_NAMES;
	}

	@Override
	public void toString(Appendable out) throws IOException
	{
		out.append(getClass().getSimpleName());
		out.append("()");
	}

	@Override
	public Object clone() throws CloneNotSupportedException
	{
		throw new UnsupportedOperationException(genMsg());
	}

	@Override
	public AstNode<CtnNode> cloneWrapException()
	{
		throw new UnsupportedOperationException(genMsg());
	}

	@Override
	public AstNode<CtnNode> deepClone() throws CloneNotSupportedException
	{
		throw new UnsupportedOperationException(genMsg());
	}

	@Override
	public AstNode<CtnNode> deepCloneWrapException()
	{
		throw new UnsupportedOperationException(genMsg());
	}

	// =========================================================================

	@Override
	public void add(int index, CtnNode element)
	{
		throw new UnsupportedOperationException(genMsg());
	}

	@Override
	public boolean add(CtnNode e)
	{
		throw new UnsupportedOperationException(genMsg());
	}

	@Override
	public boolean addAll(Collection<? extends CtnNode> c)
	{
		throw new UnsupportedOperationException(genMsg());
	}

	@Override
	public boolean addAll(int index, Collection<? extends CtnNode> c)
	{
		throw new UnsupportedOperationException(genMsg());
	}

	@Override
	public void clear()
	{
		throw new UnsupportedOperationException(genMsg());
	}

	@Override
	public boolean contains(Object o)
	{
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c)
	{
		return false;
	}

	@Override
	public CtnNode get(int index)
	{
		throw new UnsupportedOperationException(genMsg());
	}

	@Override
	public <S extends CtnNode> S get(int index, Class<S> clazz)
	{
		throw new UnsupportedOperationException(genMsg());
	}

	@Override
	public int indexOf(Object o)
	{
		return -1;
	}

	@Override
	public boolean isEmpty()
	{
		return true;
	}

	@Override
	public Iterator<CtnNode> iterator()
	{
		return new Iterator<CtnNode>()
		{
			@Override
			public void remove()
			{
				throw new UnsupportedOperationException(genMsg());
			}

			@Override
			public CtnNode next()
			{
				throw new UnsupportedOperationException(genMsg());
			}

			@Override
			public boolean hasNext()
			{
				return false;
			}
		};
	}

	@Override
	public int lastIndexOf(Object o)
	{
		return -1;
	}

	@Override
	public ListIterator<CtnNode> listIterator()
	{
		return new NullNodeListIterator();
	}

	@Override
	public ListIterator<CtnNode> listIterator(int index)
	{
		return new NullNodeListIterator();
	}

	@Override
	public CtnNode remove(int index)
	{
		throw new UnsupportedOperationException(genMsg());
	}

	@Override
	public boolean remove(Object o)
	{
		throw new UnsupportedOperationException(genMsg());
	}

	@Override
	public boolean removeAll(Collection<?> c)
	{
		throw new UnsupportedOperationException(genMsg());
	}

	@Override
	public boolean retainAll(Collection<?> c)
	{
		throw new UnsupportedOperationException(genMsg());
	}

	@Override
	public CtnNode set(int index, CtnNode element)
	{
		throw new UnsupportedOperationException(genMsg());
	}

	@Override
	public int size()
	{
		return 0;
	}

	@Override
	public List<CtnNode> subList(int fromIndex, int toIndex)
	{
		if (fromIndex == toIndex)
			return Collections.emptyList();
		throw new UnsupportedOperationException(genMsg());
	}

	@Override
	public Object[] toArray()
	{
		return new Object[] {};
	}

	@Override
	public <T> T[] toArray(T[] a)
	{
		if (a.length > 0)
			a[0] = null;
		return a;
	}

	// =========================================================================

	private final class NullNodeListIterator
			implements
				ListIterator<CtnNode>
	{
		@Override
		public void set(CtnNode arg0)
		{
			throw new UnsupportedOperationException(genMsg());
		}

		@Override
		public void remove()
		{
			throw new UnsupportedOperationException(genMsg());
		}

		@Override
		public int previousIndex()
		{
			return -1;
		}

		@Override
		public CtnNode previous()
		{
			throw new UnsupportedOperationException(genMsg());
		}

		@Override
		public int nextIndex()
		{
			return 0;
		}

		@Override
		public CtnNode next()
		{
			throw new UnsupportedOperationException(genMsg());
		}

		@Override
		public boolean hasPrevious()
		{
			return false;
		}

		@Override
		public boolean hasNext()
		{
			return false;
		}

		@Override
		public void add(CtnNode arg0)
		{
			throw new UnsupportedOperationException(genMsg());
		}
	}

	// =========================================================================

	@Override
	public String toString()
	{
		return "---";
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == null)
			return false;
		return (obj.getClass() == getClass());
	}
}
