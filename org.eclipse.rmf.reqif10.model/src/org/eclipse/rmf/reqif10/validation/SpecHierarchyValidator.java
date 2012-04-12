/*******************************************************************************
 * Copyright (c) 2011 itemis GmbH.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Nirmal Sasidharan - initial API and implementation
 ******************************************************************************/

package org.eclipse.rmf.reqif10.validation;

import org.eclipse.rmf.reqif10.AttributeDefinition;
import org.eclipse.rmf.reqif10.SpecHierarchy;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.Specification;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link org.eclipse.rmf.reqif10.SpecHierarchy}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface SpecHierarchyValidator {
	boolean validate();

	boolean validateIsTableInternal(Object value);
	boolean validateObject(SpecObject value);
	boolean validateParent(SpecHierarchy value);
	boolean validateChildren(EList<SpecHierarchy> value);
	boolean validateEditableAtts(EList<AttributeDefinition> value);
	boolean validateRoot(Specification value);
}
