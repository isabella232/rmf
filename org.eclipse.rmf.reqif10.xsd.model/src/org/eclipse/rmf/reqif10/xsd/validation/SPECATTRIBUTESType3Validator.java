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

package org.eclipse.rmf.reqif10.xsd.validation;

import org.eclipse.rmf.reqif10.xsd.ATTRIBUTEDEFINITIONBOOLEAN;
import org.eclipse.rmf.reqif10.xsd.ATTRIBUTEDEFINITIONDATE;
import org.eclipse.rmf.reqif10.xsd.ATTRIBUTEDEFINITIONENUMERATION;
import org.eclipse.rmf.reqif10.xsd.ATTRIBUTEDEFINITIONINTEGER;
import org.eclipse.rmf.reqif10.xsd.ATTRIBUTEDEFINITIONREAL;
import org.eclipse.rmf.reqif10.xsd.ATTRIBUTEDEFINITIONSTRING;
import org.eclipse.rmf.reqif10.xsd.ATTRIBUTEDEFINITIONXHTML;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * A sample validator interface for {@link org.eclipse.rmf.reqif10.xsd.SPECATTRIBUTESType3}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface SPECATTRIBUTESType3Validator {
	boolean validate();

	boolean validateGroup(FeatureMap value);
	boolean validateATTRIBUTEDEFINITIONBOOLEAN(EList<ATTRIBUTEDEFINITIONBOOLEAN> value);
	boolean validateATTRIBUTEDEFINITIONDATE(EList<ATTRIBUTEDEFINITIONDATE> value);
	boolean validateATTRIBUTEDEFINITIONENUMERATION(EList<ATTRIBUTEDEFINITIONENUMERATION> value);
	boolean validateATTRIBUTEDEFINITIONINTEGER(EList<ATTRIBUTEDEFINITIONINTEGER> value);
	boolean validateATTRIBUTEDEFINITIONREAL(EList<ATTRIBUTEDEFINITIONREAL> value);
	boolean validateATTRIBUTEDEFINITIONSTRING(EList<ATTRIBUTEDEFINITIONSTRING> value);
	boolean validateATTRIBUTEDEFINITIONXHTML(EList<ATTRIBUTEDEFINITIONXHTML> value);
}
