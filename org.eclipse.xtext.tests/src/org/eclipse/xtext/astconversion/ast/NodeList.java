/*******************************************************************************
 * Copyright (c) 2021 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.astconversion.ast;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author niklas - Initial contribution and API
 */
public class NodeList<E> extends ArrayList<E> {
	private static final long serialVersionUID = 1L;

	public NodeList() {
	}

	public NodeList(Collection<? extends E> c) {
		super(c);
	}

	public Iterable<E> customIterable() {
		return this;
	}
}
