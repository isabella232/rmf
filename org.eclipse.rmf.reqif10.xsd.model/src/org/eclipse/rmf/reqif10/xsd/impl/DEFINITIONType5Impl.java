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

package org.eclipse.rmf.reqif10.xsd.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.rmf.reqif10.xsd.ATTRIBUTEDEFINITIONINTEGER;
import org.eclipse.rmf.reqif10.xsd.DEFINITIONType5;
import org.eclipse.rmf.reqif10.xsd.ReqifPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DEFINITION Type5</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.impl.DEFINITIONType5Impl#getATTRIBUTEDEFINITIONINTEGERREF <em>ATTRIBUTEDEFINITIONINTEGERREF</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DEFINITIONType5Impl extends EObjectImpl implements DEFINITIONType5 {
	/**
	 * The cached value of the '{@link #getATTRIBUTEDEFINITIONINTEGERREF() <em>ATTRIBUTEDEFINITIONINTEGERREF</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getATTRIBUTEDEFINITIONINTEGERREF()
	 * @generated
	 * @ordered
	 */
	protected ATTRIBUTEDEFINITIONINTEGER aTTRIBUTEDEFINITIONINTEGERREF;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DEFINITIONType5Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReqifPackage.Literals.DEFINITION_TYPE5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATTRIBUTEDEFINITIONINTEGER getATTRIBUTEDEFINITIONINTEGERREF() {
		return aTTRIBUTEDEFINITIONINTEGERREF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setATTRIBUTEDEFINITIONINTEGERREF(ATTRIBUTEDEFINITIONINTEGER newATTRIBUTEDEFINITIONINTEGERREF) {
		ATTRIBUTEDEFINITIONINTEGER oldATTRIBUTEDEFINITIONINTEGERREF = aTTRIBUTEDEFINITIONINTEGERREF;
		aTTRIBUTEDEFINITIONINTEGERREF = newATTRIBUTEDEFINITIONINTEGERREF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReqifPackage.DEFINITION_TYPE5__ATTRIBUTEDEFINITIONINTEGERREF, oldATTRIBUTEDEFINITIONINTEGERREF, aTTRIBUTEDEFINITIONINTEGERREF));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReqifPackage.DEFINITION_TYPE5__ATTRIBUTEDEFINITIONINTEGERREF:
				return getATTRIBUTEDEFINITIONINTEGERREF();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ReqifPackage.DEFINITION_TYPE5__ATTRIBUTEDEFINITIONINTEGERREF:
				setATTRIBUTEDEFINITIONINTEGERREF((ATTRIBUTEDEFINITIONINTEGER)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ReqifPackage.DEFINITION_TYPE5__ATTRIBUTEDEFINITIONINTEGERREF:
				setATTRIBUTEDEFINITIONINTEGERREF((ATTRIBUTEDEFINITIONINTEGER)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ReqifPackage.DEFINITION_TYPE5__ATTRIBUTEDEFINITIONINTEGERREF:
				return aTTRIBUTEDEFINITIONINTEGERREF != null;
		}
		return super.eIsSet(featureID);
	}

} //DEFINITIONType5Impl
