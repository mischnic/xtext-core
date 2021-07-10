/**
 * Copyright (c) 2021 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.xtext.generator.grammarAccess;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.ParserRule;

/**
 * @author niklas - Initial contribution and API
 */
@SuppressWarnings("all")
public class ASTUtils {
  public boolean isUnassigningRule(final ParserRule rule) {
    final TreeIterator<EObject> ti = rule.eAllContents();
    while (ti.hasNext()) {
      {
        final EObject obj = ti.next();
        if ((obj instanceof Assignment)) {
          return false;
        }
      }
    }
    return true;
  }
}
