/*******************************************************************************
 * Copyright (c) 2021 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.xtext.generator.grammarAccess

import org.eclipse.xtext.Action
import org.eclipse.xtext.Assignment
import org.eclipse.xtext.ParserRule

/**
 * @author niklas - Initial contribution and API
 */
class ASTUtils {
	def isUnassigningRule(ParserRule rule) {
		// TODO is there a better way?
		val ti = rule.eAllContents()
		while (ti.hasNext()) {
			val obj = ti.next()
			if (obj instanceof Assignment) {
				return false
			}
		}
		return true
	}

	def containsDifferentSimpleAction(ParserRule rule) {
		// TODO is there a better way?
		val ti = rule.eAllContents()
		while (ti.hasNext()) {
			val obj = ti.next()
			if (obj instanceof Action && (obj as Action).type.classifier != rule.type.classifier) {
				return obj as Action
			}
		}
		return null
	}
}
