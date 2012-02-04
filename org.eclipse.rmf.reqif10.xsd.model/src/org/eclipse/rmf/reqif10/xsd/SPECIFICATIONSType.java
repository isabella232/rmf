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
 * A representation of the model object '<em><b>SPECIFICATIONS Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.SPECIFICATIONSType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.SPECIFICATIONSType#getSPECIFICATION <em>SPECIFICATION</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.reqif10.xsd.ReqifPackage#getSPECIFICATIONSType()
 * @model extendedMetaData="name='SPECIFICATIONS_._type' kind='elementOnly'"
 * @generated
 */
public interface SPECIFICATIONSType extends EObject {
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
	 * @see org.eclipse.rmf.reqif10.xsd.ReqifPackage#getSPECIFICATIONSType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>SPECIFICATION</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.xsd.SPECIFICATION}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SPECIFICATION</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SPECIFICATION</em>' containment reference list.
	 * @see org.eclipse.rmf.reqif10.xsd.ReqifPackage#getSPECIFICATIONSType_SPECIFICATION()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SPECIFICATION' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<SPECIFICATION> getSPECIFICATION();

} // SPECIFICATIONSType
