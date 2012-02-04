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

package org.eclipse.rmf.xhtml.validation;

import org.eclipse.rmf.xhtml.DeclareType;
import org.eclipse.rmf.xhtml.XhtmlAType;
import org.eclipse.rmf.xhtml.XhtmlAbbrType;
import org.eclipse.rmf.xhtml.XhtmlAcronymType;
import org.eclipse.rmf.xhtml.XhtmlAddressType;
import org.eclipse.rmf.xhtml.XhtmlBlockquoteType;
import org.eclipse.rmf.xhtml.XhtmlBrType;
import org.eclipse.rmf.xhtml.XhtmlCiteType;
import org.eclipse.rmf.xhtml.XhtmlCodeType;
import org.eclipse.rmf.xhtml.XhtmlDfnType;
import org.eclipse.rmf.xhtml.XhtmlDivType;
import org.eclipse.rmf.xhtml.XhtmlDlType;
import org.eclipse.rmf.xhtml.XhtmlEditType;
import org.eclipse.rmf.xhtml.XhtmlEmType;
import org.eclipse.rmf.xhtml.XhtmlH1Type;
import org.eclipse.rmf.xhtml.XhtmlH2Type;
import org.eclipse.rmf.xhtml.XhtmlH3Type;
import org.eclipse.rmf.xhtml.XhtmlH4Type;
import org.eclipse.rmf.xhtml.XhtmlH5Type;
import org.eclipse.rmf.xhtml.XhtmlH6Type;
import org.eclipse.rmf.xhtml.XhtmlKbdType;
import org.eclipse.rmf.xhtml.XhtmlObjectType;
import org.eclipse.rmf.xhtml.XhtmlOlType;
import org.eclipse.rmf.xhtml.XhtmlPType;
import org.eclipse.rmf.xhtml.XhtmlParamType;
import org.eclipse.rmf.xhtml.XhtmlPreType;
import org.eclipse.rmf.xhtml.XhtmlQType;
import org.eclipse.rmf.xhtml.XhtmlSampType;
import org.eclipse.rmf.xhtml.XhtmlSpanType;
import org.eclipse.rmf.xhtml.XhtmlStrongType;
import org.eclipse.rmf.xhtml.XhtmlTableType;
import org.eclipse.rmf.xhtml.XhtmlUlType;
import org.eclipse.rmf.xhtml.XhtmlVarType;

import java.math.BigInteger;

import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * A sample validator interface for {@link org.eclipse.rmf.xhtml.XhtmlObjectType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface XhtmlObjectTypeValidator {
	boolean validate();

	boolean validateMixed(FeatureMap value);
	boolean validateGroup(FeatureMap value);
	boolean validateParam(EList<XhtmlParamType> value);
	boolean validateH1(EList<XhtmlH1Type> value);
	boolean validateH2(EList<XhtmlH2Type> value);
	boolean validateH3(EList<XhtmlH3Type> value);
	boolean validateH4(EList<XhtmlH4Type> value);
	boolean validateH5(EList<XhtmlH5Type> value);
	boolean validateH6(EList<XhtmlH6Type> value);
	boolean validateUl(EList<XhtmlUlType> value);
	boolean validateOl(EList<XhtmlOlType> value);
	boolean validateDl(EList<XhtmlDlType> value);
	boolean validateP(EList<XhtmlPType> value);
	boolean validateDiv(EList<XhtmlDivType> value);
	boolean validatePre(EList<XhtmlPreType> value);
	boolean validateBlockquote(EList<XhtmlBlockquoteType> value);
	boolean validateAddress(EList<XhtmlAddressType> value);
	boolean validateHr(EList<Object> value);
	boolean validateTable(EList<XhtmlTableType> value);
	boolean validateBr(EList<XhtmlBrType> value);
	boolean validateSpan(EList<XhtmlSpanType> value);
	boolean validateEm(EList<XhtmlEmType> value);
	boolean validateStrong(EList<XhtmlStrongType> value);
	boolean validateDfn(EList<XhtmlDfnType> value);
	boolean validateCode(EList<XhtmlCodeType> value);
	boolean validateSamp(EList<XhtmlSampType> value);
	boolean validateKbd(EList<XhtmlKbdType> value);
	boolean validateVar(EList<XhtmlVarType> value);
	boolean validateCite(EList<XhtmlCiteType> value);
	boolean validateAbbr(EList<XhtmlAbbrType> value);
	boolean validateAcronym(EList<XhtmlAcronymType> value);
	boolean validateQ(EList<XhtmlQType> value);
	boolean validateTt(EList<Object> value);
	boolean validateI(EList<Object> value);
	boolean validateB(EList<Object> value);
	boolean validateBig(EList<Object> value);
	boolean validateSmall(EList<Object> value);
	boolean validateSub(EList<Object> value);
	boolean validateSup(EList<Object> value);
	boolean validateA(EList<XhtmlAType> value);
	boolean validateObject(EList<XhtmlObjectType> value);
	boolean validateIns(EList<XhtmlEditType> value);
	boolean validateDel(EList<XhtmlEditType> value);
	boolean validateArchive(List<String> value);
	boolean validateClass(String value);
	boolean validateClassid(String value);
	boolean validateCodebase(String value);
	boolean validateCodetype(String value);
	boolean validateData(String value);
	boolean validateDeclare(DeclareType value);
	boolean validateHeight(Object value);
	boolean validateId(String value);
	boolean validateLang(Object value);
	boolean validateName(String value);
	boolean validateSpace(Object value);
	boolean validateStandby(String value);
	boolean validateStyle(String value);
	boolean validateTabindex(BigInteger value);
	boolean validateTitle(String value);
	boolean validateType(String value);
	boolean validateWidth(Object value);
}
