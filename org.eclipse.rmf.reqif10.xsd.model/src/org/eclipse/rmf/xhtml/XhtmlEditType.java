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

package org.eclipse.rmf.xhtml;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edit Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlEditType#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlEditType#getXhtmlFlowMix <em>Xhtml Flow Mix</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlEditType#getH1 <em>H1</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlEditType#getH2 <em>H2</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlEditType#getH3 <em>H3</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlEditType#getH4 <em>H4</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlEditType#getH5 <em>H5</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlEditType#getH6 <em>H6</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlEditType#getUl <em>Ul</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlEditType#getOl <em>Ol</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlEditType#getDl <em>Dl</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlEditType#getP <em>P</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlEditType#getDiv <em>Div</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlEditType#getPre <em>Pre</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlEditType#getBlockquote <em>Blockquote</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlEditType#getAddress <em>Address</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlEditType#getHr <em>Hr</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlEditType#getTable <em>Table</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlEditType#getBr <em>Br</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlEditType#getSpan <em>Span</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlEditType#getEm <em>Em</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlEditType#getStrong <em>Strong</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlEditType#getDfn <em>Dfn</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlEditType#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlEditType#getSamp <em>Samp</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlEditType#getKbd <em>Kbd</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlEditType#getVar <em>Var</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlEditType#getCite <em>Cite</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlEditType#getAbbr <em>Abbr</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlEditType#getAcronym <em>Acronym</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlEditType#getQ <em>Q</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlEditType#getTt <em>Tt</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlEditType#getI <em>I</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlEditType#getB <em>B</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlEditType#getBig <em>Big</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlEditType#getSmall <em>Small</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlEditType#getSub <em>Sub</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlEditType#getSup <em>Sup</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlEditType#getA <em>A</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlEditType#getObject <em>Object</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlEditType#getIns <em>Ins</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlEditType#getDel <em>Del</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlEditType#getCite1 <em>Cite1</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlEditType#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlEditType#getDatetime <em>Datetime</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlEditType#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlEditType#getLang <em>Lang</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlEditType#getSpace <em>Space</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlEditType#getStyle <em>Style</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlEditType#getTitle <em>Title</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlEditType()
 * @model extendedMetaData="name='xhtml.edit.type' kind='mixed'"
 * @generated
 */
public interface XhtmlEditType extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlEditType_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>Xhtml Flow Mix</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xhtml Flow Mix</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xhtml Flow Mix</em>' attribute list.
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlEditType_XhtmlFlowMix()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='XhtmlFlowMix:1'"
	 * @generated
	 */
	FeatureMap getXhtmlFlowMix();

	/**
	 * Returns the value of the '<em><b>H1</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.xhtml.XhtmlH1Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>H1</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>H1</em>' containment reference list.
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlEditType_H1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='h1' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
	 * @generated
	 */
	EList<XhtmlH1Type> getH1();

	/**
	 * Returns the value of the '<em><b>H2</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.xhtml.XhtmlH2Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>H2</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>H2</em>' containment reference list.
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlEditType_H2()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='h2' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
	 * @generated
	 */
	EList<XhtmlH2Type> getH2();

	/**
	 * Returns the value of the '<em><b>H3</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.xhtml.XhtmlH3Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>H3</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>H3</em>' containment reference list.
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlEditType_H3()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='h3' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
	 * @generated
	 */
	EList<XhtmlH3Type> getH3();

	/**
	 * Returns the value of the '<em><b>H4</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.xhtml.XhtmlH4Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>H4</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>H4</em>' containment reference list.
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlEditType_H4()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='h4' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
	 * @generated
	 */
	EList<XhtmlH4Type> getH4();

	/**
	 * Returns the value of the '<em><b>H5</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.xhtml.XhtmlH5Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>H5</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>H5</em>' containment reference list.
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlEditType_H5()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='h5' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
	 * @generated
	 */
	EList<XhtmlH5Type> getH5();

	/**
	 * Returns the value of the '<em><b>H6</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.xhtml.XhtmlH6Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>H6</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>H6</em>' containment reference list.
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlEditType_H6()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='h6' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
	 * @generated
	 */
	EList<XhtmlH6Type> getH6();

	/**
	 * Returns the value of the '<em><b>Ul</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.xhtml.XhtmlUlType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ul</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ul</em>' containment reference list.
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlEditType_Ul()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ul' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
	 * @generated
	 */
	EList<XhtmlUlType> getUl();

	/**
	 * Returns the value of the '<em><b>Ol</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.xhtml.XhtmlOlType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ol</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ol</em>' containment reference list.
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlEditType_Ol()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ol' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
	 * @generated
	 */
	EList<XhtmlOlType> getOl();

	/**
	 * Returns the value of the '<em><b>Dl</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.xhtml.XhtmlDlType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dl</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dl</em>' containment reference list.
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlEditType_Dl()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dl' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
	 * @generated
	 */
	EList<XhtmlDlType> getDl();

	/**
	 * Returns the value of the '<em><b>P</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.xhtml.XhtmlPType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>P</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>P</em>' containment reference list.
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlEditType_P()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='p' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
	 * @generated
	 */
	EList<XhtmlPType> getP();

	/**
	 * Returns the value of the '<em><b>Div</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.xhtml.XhtmlDivType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Div</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Div</em>' containment reference list.
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlEditType_Div()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='div' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
	 * @generated
	 */
	EList<XhtmlDivType> getDiv();

	/**
	 * Returns the value of the '<em><b>Pre</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.xhtml.XhtmlPreType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre</em>' containment reference list.
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlEditType_Pre()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='pre' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
	 * @generated
	 */
	EList<XhtmlPreType> getPre();

	/**
	 * Returns the value of the '<em><b>Blockquote</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.xhtml.XhtmlBlockquoteType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blockquote</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blockquote</em>' containment reference list.
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlEditType_Blockquote()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='blockquote' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
	 * @generated
	 */
	EList<XhtmlBlockquoteType> getBlockquote();

	/**
	 * Returns the value of the '<em><b>Address</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.xhtml.XhtmlAddressType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' containment reference list.
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlEditType_Address()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='address' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
	 * @generated
	 */
	EList<XhtmlAddressType> getAddress();

	/**
	 * Returns the value of the '<em><b>Hr</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hr</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hr</em>' attribute list.
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlEditType_Hr()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='hr' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
	 * @generated
	 */
	EList<Object> getHr();

	/**
	 * Returns the value of the '<em><b>Table</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.xhtml.XhtmlTableType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' containment reference list.
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlEditType_Table()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='table' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
	 * @generated
	 */
	EList<XhtmlTableType> getTable();

	/**
	 * Returns the value of the '<em><b>Br</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.xhtml.XhtmlBrType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Br</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Br</em>' containment reference list.
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlEditType_Br()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='br' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
	 * @generated
	 */
	EList<XhtmlBrType> getBr();

	/**
	 * Returns the value of the '<em><b>Span</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.xhtml.XhtmlSpanType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Span</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Span</em>' containment reference list.
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlEditType_Span()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='span' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
	 * @generated
	 */
	EList<XhtmlSpanType> getSpan();

	/**
	 * Returns the value of the '<em><b>Em</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.xhtml.XhtmlEmType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Em</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Em</em>' containment reference list.
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlEditType_Em()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='em' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
	 * @generated
	 */
	EList<XhtmlEmType> getEm();

	/**
	 * Returns the value of the '<em><b>Strong</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.xhtml.XhtmlStrongType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strong</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strong</em>' containment reference list.
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlEditType_Strong()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='strong' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
	 * @generated
	 */
	EList<XhtmlStrongType> getStrong();

	/**
	 * Returns the value of the '<em><b>Dfn</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.xhtml.XhtmlDfnType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dfn</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dfn</em>' containment reference list.
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlEditType_Dfn()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dfn' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
	 * @generated
	 */
	EList<XhtmlDfnType> getDfn();

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.xhtml.XhtmlCodeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' containment reference list.
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlEditType_Code()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
	 * @generated
	 */
	EList<XhtmlCodeType> getCode();

	/**
	 * Returns the value of the '<em><b>Samp</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.xhtml.XhtmlSampType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Samp</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Samp</em>' containment reference list.
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlEditType_Samp()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='samp' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
	 * @generated
	 */
	EList<XhtmlSampType> getSamp();

	/**
	 * Returns the value of the '<em><b>Kbd</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.xhtml.XhtmlKbdType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kbd</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kbd</em>' containment reference list.
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlEditType_Kbd()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='kbd' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
	 * @generated
	 */
	EList<XhtmlKbdType> getKbd();

	/**
	 * Returns the value of the '<em><b>Var</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.xhtml.XhtmlVarType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Var</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var</em>' containment reference list.
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlEditType_Var()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='var' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
	 * @generated
	 */
	EList<XhtmlVarType> getVar();

	/**
	 * Returns the value of the '<em><b>Cite</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.xhtml.XhtmlCiteType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cite</em>' containment reference list.
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlEditType_Cite()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='cite' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
	 * @generated
	 */
	EList<XhtmlCiteType> getCite();

	/**
	 * Returns the value of the '<em><b>Abbr</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.xhtml.XhtmlAbbrType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abbr</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abbr</em>' containment reference list.
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlEditType_Abbr()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abbr' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
	 * @generated
	 */
	EList<XhtmlAbbrType> getAbbr();

	/**
	 * Returns the value of the '<em><b>Acronym</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.xhtml.XhtmlAcronymType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Acronym</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acronym</em>' containment reference list.
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlEditType_Acronym()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='acronym' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
	 * @generated
	 */
	EList<XhtmlAcronymType> getAcronym();

	/**
	 * Returns the value of the '<em><b>Q</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.xhtml.XhtmlQType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Q</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Q</em>' containment reference list.
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlEditType_Q()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='q' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
	 * @generated
	 */
	EList<XhtmlQType> getQ();

	/**
	 * Returns the value of the '<em><b>Tt</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tt</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tt</em>' attribute list.
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlEditType_Tt()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='tt' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
	 * @generated
	 */
	EList<Object> getTt();

	/**
	 * Returns the value of the '<em><b>I</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>I</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>I</em>' attribute list.
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlEditType_I()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='i' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
	 * @generated
	 */
	EList<Object> getI();

	/**
	 * Returns the value of the '<em><b>B</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>B</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>B</em>' attribute list.
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlEditType_B()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='b' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
	 * @generated
	 */
	EList<Object> getB();

	/**
	 * Returns the value of the '<em><b>Big</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Big</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Big</em>' attribute list.
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlEditType_Big()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='big' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
	 * @generated
	 */
	EList<Object> getBig();

	/**
	 * Returns the value of the '<em><b>Small</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Small</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Small</em>' attribute list.
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlEditType_Small()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='small' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
	 * @generated
	 */
	EList<Object> getSmall();

	/**
	 * Returns the value of the '<em><b>Sub</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub</em>' attribute list.
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlEditType_Sub()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sub' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
	 * @generated
	 */
	EList<Object> getSub();

	/**
	 * Returns the value of the '<em><b>Sup</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sup</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sup</em>' attribute list.
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlEditType_Sup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sup' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
	 * @generated
	 */
	EList<Object> getSup();

	/**
	 * Returns the value of the '<em><b>A</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.xhtml.XhtmlAType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>A</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>A</em>' containment reference list.
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlEditType_A()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='a' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
	 * @generated
	 */
	EList<XhtmlAType> getA();

	/**
	 * Returns the value of the '<em><b>Object</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.xhtml.XhtmlObjectType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' containment reference list.
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlEditType_Object()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='object' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
	 * @generated
	 */
	EList<XhtmlObjectType> getObject();

	/**
	 * Returns the value of the '<em><b>Ins</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.xhtml.XhtmlEditType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ins</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ins</em>' containment reference list.
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlEditType_Ins()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ins' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
	 * @generated
	 */
	EList<XhtmlEditType> getIns();

	/**
	 * Returns the value of the '<em><b>Del</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.xhtml.XhtmlEditType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Del</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Del</em>' containment reference list.
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlEditType_Del()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='del' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
	 * @generated
	 */
	EList<XhtmlEditType> getDel();

	/**
	 * Returns the value of the '<em><b>Cite1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cite1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cite1</em>' attribute.
	 * @see #setCite1(String)
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlEditType_Cite1()
	 * @model dataType="org.eclipse.rmf.datatypes.URI"
	 *        extendedMetaData="kind='attribute' name='cite'"
	 * @generated
	 */
	String getCite1();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.xhtml.XhtmlEditType#getCite1 <em>Cite1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cite1</em>' attribute.
	 * @see #getCite1()
	 * @generated
	 */
	void setCite1(String value);

	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' attribute.
	 * @see #setClass(String)
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlEditType_Class()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='class'"
	 * @generated
	 */
	String getClass_();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.xhtml.XhtmlEditType#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(String value);

	/**
	 * Returns the value of the '<em><b>Datetime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datetime</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datetime</em>' attribute.
	 * @see #setDatetime(XMLGregorianCalendar)
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlEditType_Datetime()
	 * @model dataType="org.eclipse.rmf.datatypes.Datetime"
	 *        extendedMetaData="kind='attribute' name='datetime'"
	 * @generated
	 */
	XMLGregorianCalendar getDatetime();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.xhtml.XhtmlEditType#getDatetime <em>Datetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datetime</em>' attribute.
	 * @see #getDatetime()
	 * @generated
	 */
	void setDatetime(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlEditType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.xhtml.XhtmlEditType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lang</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lang</em>' attribute.
	 * @see #setLang(Object)
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlEditType_Lang()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='lang' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	Object getLang();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.xhtml.XhtmlEditType#getLang <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang</em>' attribute.
	 * @see #getLang()
	 * @generated
	 */
	void setLang(Object value);

	/**
	 * Returns the value of the '<em><b>Space</b></em>' attribute.
	 * The default value is <code>"preserve"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Space</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Space</em>' attribute.
	 * @see #isSetSpace()
	 * @see #unsetSpace()
	 * @see #setSpace(Object)
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlEditType_Space()
	 * @model default="preserve" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='space' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	Object getSpace();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.xhtml.XhtmlEditType#getSpace <em>Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Space</em>' attribute.
	 * @see #isSetSpace()
	 * @see #unsetSpace()
	 * @see #getSpace()
	 * @generated
	 */
	void setSpace(Object value);

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.xhtml.XhtmlEditType#getSpace <em>Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSpace()
	 * @see #getSpace()
	 * @see #setSpace(Object)
	 * @generated
	 */
	void unsetSpace();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.xhtml.XhtmlEditType#getSpace <em>Space</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Space</em>' attribute is set.
	 * @see #unsetSpace()
	 * @see #getSpace()
	 * @see #setSpace(Object)
	 * @generated
	 */
	boolean isSetSpace();

	/**
	 * Returns the value of the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' attribute.
	 * @see #setStyle(String)
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlEditType_Style()
	 * @model dataType="org.eclipse.rmf.datatypes.CDATA"
	 *        extendedMetaData="kind='attribute' name='style'"
	 * @generated
	 */
	String getStyle();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.xhtml.XhtmlEditType#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' attribute.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlEditType_Title()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='title'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.xhtml.XhtmlEditType#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

} // XhtmlEditType
