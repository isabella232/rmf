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

package org.eclipse.rmf.reqif10.xsd;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SPECATTRIBUTES Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.SPECATTRIBUTESType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.SPECATTRIBUTESType#getATTRIBUTEDEFINITIONBOOLEAN <em>ATTRIBUTEDEFINITIONBOOLEAN</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.SPECATTRIBUTESType#getATTRIBUTEDEFINITIONDATE <em>ATTRIBUTEDEFINITIONDATE</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.SPECATTRIBUTESType#getATTRIBUTEDEFINITIONENUMERATION <em>ATTRIBUTEDEFINITIONENUMERATION</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.SPECATTRIBUTESType#getATTRIBUTEDEFINITIONINTEGER <em>ATTRIBUTEDEFINITIONINTEGER</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.SPECATTRIBUTESType#getATTRIBUTEDEFINITIONREAL <em>ATTRIBUTEDEFINITIONREAL</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.SPECATTRIBUTESType#getATTRIBUTEDEFINITIONSTRING <em>ATTRIBUTEDEFINITIONSTRING</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.SPECATTRIBUTESType#getATTRIBUTEDEFINITIONXHTML <em>ATTRIBUTEDEFINITIONXHTML</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.reqif10.xsd.ReqifPackage#getSPECATTRIBUTESType()
 * @model extendedMetaData="name='SPEC-ATTRIBUTES_._type' kind='elementOnly'"
 * @generated
 */
public interface SPECATTRIBUTESType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.eclipse.rmf.reqif10.xsd.ReqifPackage#getSPECATTRIBUTESType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>ATTRIBUTEDEFINITIONBOOLEAN</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.xsd.ATTRIBUTEDEFINITIONBOOLEAN}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ATTRIBUTEDEFINITIONBOOLEAN</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ATTRIBUTEDEFINITIONBOOLEAN</em>' containment reference list.
	 * @see org.eclipse.rmf.reqif10.xsd.ReqifPackage#getSPECATTRIBUTESType_ATTRIBUTEDEFINITIONBOOLEAN()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ATTRIBUTE-DEFINITION-BOOLEAN' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ATTRIBUTEDEFINITIONBOOLEAN> getATTRIBUTEDEFINITIONBOOLEAN();

	/**
	 * Returns the value of the '<em><b>ATTRIBUTEDEFINITIONDATE</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.xsd.ATTRIBUTEDEFINITIONDATE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ATTRIBUTEDEFINITIONDATE</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ATTRIBUTEDEFINITIONDATE</em>' containment reference list.
	 * @see org.eclipse.rmf.reqif10.xsd.ReqifPackage#getSPECATTRIBUTESType_ATTRIBUTEDEFINITIONDATE()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ATTRIBUTE-DEFINITION-DATE' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ATTRIBUTEDEFINITIONDATE> getATTRIBUTEDEFINITIONDATE();

	/**
	 * Returns the value of the '<em><b>ATTRIBUTEDEFINITIONENUMERATION</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.xsd.ATTRIBUTEDEFINITIONENUMERATION}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ATTRIBUTEDEFINITIONENUMERATION</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ATTRIBUTEDEFINITIONENUMERATION</em>' containment reference list.
	 * @see org.eclipse.rmf.reqif10.xsd.ReqifPackage#getSPECATTRIBUTESType_ATTRIBUTEDEFINITIONENUMERATION()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ATTRIBUTE-DEFINITION-ENUMERATION' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ATTRIBUTEDEFINITIONENUMERATION> getATTRIBUTEDEFINITIONENUMERATION();

	/**
	 * Returns the value of the '<em><b>ATTRIBUTEDEFINITIONINTEGER</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.xsd.ATTRIBUTEDEFINITIONINTEGER}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ATTRIBUTEDEFINITIONINTEGER</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ATTRIBUTEDEFINITIONINTEGER</em>' containment reference list.
	 * @see org.eclipse.rmf.reqif10.xsd.ReqifPackage#getSPECATTRIBUTESType_ATTRIBUTEDEFINITIONINTEGER()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ATTRIBUTE-DEFINITION-INTEGER' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ATTRIBUTEDEFINITIONINTEGER> getATTRIBUTEDEFINITIONINTEGER();

	/**
	 * Returns the value of the '<em><b>ATTRIBUTEDEFINITIONREAL</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.xsd.ATTRIBUTEDEFINITIONREAL}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ATTRIBUTEDEFINITIONREAL</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ATTRIBUTEDEFINITIONREAL</em>' containment reference list.
	 * @see org.eclipse.rmf.reqif10.xsd.ReqifPackage#getSPECATTRIBUTESType_ATTRIBUTEDEFINITIONREAL()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ATTRIBUTE-DEFINITION-REAL' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ATTRIBUTEDEFINITIONREAL> getATTRIBUTEDEFINITIONREAL();

	/**
	 * Returns the value of the '<em><b>ATTRIBUTEDEFINITIONSTRING</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.xsd.ATTRIBUTEDEFINITIONSTRING}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ATTRIBUTEDEFINITIONSTRING</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ATTRIBUTEDEFINITIONSTRING</em>' containment reference list.
	 * @see org.eclipse.rmf.reqif10.xsd.ReqifPackage#getSPECATTRIBUTESType_ATTRIBUTEDEFINITIONSTRING()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ATTRIBUTE-DEFINITION-STRING' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ATTRIBUTEDEFINITIONSTRING> getATTRIBUTEDEFINITIONSTRING();

	/**
	 * Returns the value of the '<em><b>ATTRIBUTEDEFINITIONXHTML</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.xsd.ATTRIBUTEDEFINITIONXHTML}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ATTRIBUTEDEFINITIONXHTML</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ATTRIBUTEDEFINITIONXHTML</em>' containment reference list.
	 * @see org.eclipse.rmf.reqif10.xsd.ReqifPackage#getSPECATTRIBUTESType_ATTRIBUTEDEFINITIONXHTML()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ATTRIBUTE-DEFINITION-XHTML' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ATTRIBUTEDEFINITIONXHTML> getATTRIBUTEDEFINITIONXHTML();

} // SPECATTRIBUTESType
