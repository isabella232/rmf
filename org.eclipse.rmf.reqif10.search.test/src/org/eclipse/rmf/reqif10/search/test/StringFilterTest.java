/*******************************************************************************
 * Copyright (c) 2014 Formal Mind GmbH.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Ingo Weigelt - initial API and implementation
 *     Michael Jastram - adding SUPPORTED_OPERATIONS
 ******************************************************************************/
package org.eclipse.rmf.reqif10.search.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.GregorianCalendar;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.rmf.reqif10.AttributeDefinition;
import org.eclipse.rmf.reqif10.AttributeDefinitionString;
import org.eclipse.rmf.reqif10.AttributeValue;
import org.eclipse.rmf.reqif10.AttributeValueString;
import org.eclipse.rmf.reqif10.DatatypeDefinitionString;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.common.util.ReqIF10Util;
import org.eclipse.rmf.reqif10.search.filter.AbstractTextFilter.InternalAttribute;
import org.eclipse.rmf.reqif10.search.filter.IFilter;
import org.eclipse.rmf.reqif10.search.filter.IFilter.Operator;
import org.eclipse.rmf.reqif10.search.filter.StringFilter;
import org.eclipse.rmf.reqif10.search.testdata.TestData;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class StringFilterTest extends AbstractFilterTest{

	AttributeDefinitionString attributeDefinition; 

	@Rule public ExpectedException thrown= ExpectedException.none();
	
	@Before
	public void setUp(){
		createFixture("abcDEF");
	}
	
	
	@Test
	public void testEquals() throws Exception {
		StringFilter filter;
		
		filter = new StringFilter(IFilter.Operator.EQUALS, "abcDEF",  attributeDefinition, true);
		doMatch(filter, true);
		
		filter = new StringFilter(IFilter.Operator.EQUALS, "abcDEF",  attributeDefinition, false);
		doMatch(filter, true);
		
		filter = new StringFilter(IFilter.Operator.EQUALS, "abcdef",  attributeDefinition, true);
		doMatch(filter, false);
		
		filter = new StringFilter(IFilter.Operator.EQUALS, "abcdef",  attributeDefinition, false);
		doMatch(filter, true);
		
		filter = new StringFilter(IFilter.Operator.EQUALS, "abc",  attributeDefinition, false);
		doMatch(filter, false);
		
		filter = new StringFilter(IFilter.Operator.EQUALS, "abc",  attributeDefinition, true);
		doMatch(filter, false);
	}
	
	
	@Test
	public void testNotEquals() throws Exception {
		StringFilter filter;
		
		filter = new StringFilter(IFilter.Operator.NOT_EQUALS, "X",  attributeDefinition, true);
		doMatch(filter, true);
		
		filter = new StringFilter(IFilter.Operator.NOT_EQUALS, "abcdef",  attributeDefinition, true);
		doMatch(filter, true);
		
		filter = new StringFilter(IFilter.Operator.NOT_EQUALS, "abcdef",  attributeDefinition, false);
		doMatch(filter, false);
		
		filter = new StringFilter(IFilter.Operator.NOT_EQUALS, "abcDEF",  attributeDefinition, true);
		doMatch(filter, false);
	}
	
	
	@Test
	public void testContains() throws Exception {
		StringFilter filter;
		
		filter = new StringFilter(IFilter.Operator.CONTAINS, "A",  attributeDefinition, false);
		doMatch(filter, true);
		filter = new StringFilter(IFilter.Operator.CONTAINS, "A",  attributeDefinition, true);
		doMatch(filter, false);
		filter = new StringFilter(IFilter.Operator.CONTAINS, "nonexisting substring",  attributeDefinition, true);
		doMatch(filter, false);
		filter = new StringFilter(IFilter.Operator.CONTAINS, "nonexisting substring",  attributeDefinition, false);
		doMatch(filter, false);
		filter = new StringFilter(IFilter.Operator.CONTAINS, "abcDEF",  attributeDefinition, true);
		doMatch(filter, true);
		filter = new StringFilter(IFilter.Operator.CONTAINS, "abcDEF",  attributeDefinition, false);
		doMatch(filter, true);
	}
	
	
	@Test
	public void testNotContains() throws Exception {
		StringFilter filter;
		
		filter = new StringFilter(IFilter.Operator.NOT_CONTAINS, "A",  attributeDefinition, false);
		doMatch(filter, false);
		filter = new StringFilter(IFilter.Operator.NOT_CONTAINS, "A",  attributeDefinition, true);
		doMatch(filter, true);
		filter = new StringFilter(IFilter.Operator.NOT_CONTAINS, "nonexisting substring",  attributeDefinition, true);
		doMatch(filter, true);
		filter = new StringFilter(IFilter.Operator.NOT_CONTAINS, "nonexisting substring",  attributeDefinition, false);
		doMatch(filter, true);
		filter = new StringFilter(IFilter.Operator.NOT_CONTAINS, "abcDEF",  attributeDefinition, true);
		doMatch(filter, false);
		filter = new StringFilter(IFilter.Operator.NOT_CONTAINS, "abcDEF",  attributeDefinition, false);
		doMatch(filter, false);
	}
	
	@Test
	public void testRegExp() throws Exception {
		StringFilter filter;
		
		filter= new StringFilter(IFilter.Operator.REGEXP, ".*b.*",  attributeDefinition, true);
		doMatch(filter, true);
		
		filter= new StringFilter(IFilter.Operator.REGEXP, ".*b.*",  attributeDefinition, false);
		doMatch(filter, true);
		
		filter= new StringFilter(IFilter.Operator.REGEXP, ".*ABC.*",  attributeDefinition, true);
		doMatch(filter, false);
		
		filter= new StringFilter(IFilter.Operator.REGEXP, ".*ABC.*",  attributeDefinition, false);
		doMatch(filter, true);
		
	}
	
	@Test
	public void testInternalFeatures() throws Exception {
		
	}
	
	
	@Override
	public void doEmptyTest(){
		StringFilter filter;
		
		filter = new StringFilter(IFilter.Operator.EQUALS, "abcdef",  attributeDefinition, false);
		doMatch(filter, false);
		
		// A missing AD should always yield false for equals
		filter = new StringFilter(IFilter.Operator.EQUALS, "",  attributeDefinition, false);
		doMatch(filter, false);
		
		// A missing AD should always yield true for not_equals
		filter = new StringFilter(IFilter.Operator.NOT_EQUALS, "",  attributeDefinition, false);
		doMatch(filter, true);
		
		// A missing AD should always yield false for contains
		filter = new StringFilter(IFilter.Operator.CONTAINS, "",  attributeDefinition, false);
		doMatch(filter, false);
		
		// A missing AD should always yield true for not_contains
		filter = new StringFilter(IFilter.Operator.NOT_CONTAINS, "",  attributeDefinition, false);
		doMatch(filter, true);
		
		// apply Regexp to empty string
		filter = new StringFilter(IFilter.Operator.REGEXP, "",  attributeDefinition, false);
		doMatch(filter, true);
		
		filter = new StringFilter(IFilter.Operator.REGEXP, ".*",  attributeDefinition, false);
		doMatch(filter, true);
		
		filter = new StringFilter(IFilter.Operator.REGEXP, ".+",  attributeDefinition, false);
		doMatch(filter, false);
	}
	
	
	@Test
	public void testExceptionsAttributeDefinition() throws Exception {
		thrown.expect(IllegalArgumentException.class);
		new StringFilter(IFilter.Operator.EQUALS, "abcdef",  (AttributeDefinitionString) null, false);
	}
	
	@Test
	public void testExceptionsInternalAttribute() throws Exception {
		thrown.expect(IllegalArgumentException.class);
		new StringFilter(IFilter.Operator.EQUALS, "abcdef",  (InternalAttribute) null, false);
	}
	
	
	@Test
	public void testDefaultString() throws Exception {
		
		URI uri = TestData.getURI("defaultValues.reqif");
		final Resource resource = editingDomain.getResourceSet().getResource(uri, true);
		final ReqIF reqif = (ReqIF) resource.getContents().get(0);
		SpecObject so0 = reqif.getCoreContent().getSpecObjects().get(0);
		SpecObject so1 = reqif.getCoreContent().getSpecObjects().get(1);
		
		AttributeDefinitionString adString = null;
		for (AttributeValue attributeValue : so0.getValues()) {
			AttributeDefinition attributeDefinition = ReqIF10Util.getAttributeDefinition(attributeValue);
			System.out.println(attributeDefinition.getClass());
			if (attributeDefinition instanceof AttributeDefinitionString) {
				adString = (AttributeDefinitionString) attributeDefinition;
			}
		}
		
		StringFilter stringFilter = new StringFilter(Operator.EQUALS, "the default description value", adString, true);
		assertFalse(stringFilter.match(so0));
		assertTrue(stringFilter.match(so1));
		
	}
	
	
//	@Test
//	public void testDefaultValues() throws Exception {
//		DatatypeDefinitionString definitionString = createDatatypeDefinitionString("DD_STRING_ID");
//		attributeDefinition.setType(definitionString);
//		
//		AttributeValueString attributeValue = createAttributeValueString("the default Value");
//		attributeValue.setDefinition(attributeDefinition);
//		attributeDefinition.setDefaultValue(attributeValue);
//		
//		SpecObject specObject = createSpecObject("ID");
//		
//		
//		StringFilter filterForDefault = new StringFilter(Operator.EQUALS, "the default Value", attributeDefinition, true);
//		StringFilter filterForValue = new StringFilter(Operator.EQUALS, "NOT THE DEFAULT", attributeDefinition, true);
//		assertTrue(filterForDefault.match(specObject));
//		assertFalse(filterForValue.match(specObject));
//		
//		attributeValue = createAttributeValueString("NOT THE DEFAULT");
//		attributeValue.setDefinition(attributeDefinition);
//		specObject.getValues().add(attributeValue);
//		
//		assertFalse(filterForDefault.match(specObject));
//		assertTrue(filterForValue.match(specObject));
//	}
	
	
	
//	@Test
//	public void testHowtoLoadAReqif() throws Exception {
//		ReqIF reqIF = reqifFromFile("test.reqif");
//		Specification specification = reqIF.getCoreContent().getSpecifications().get(0);
//		SpecObject object = specification.getChildren().get(0).getObject();
//		EList<AttributeDefinition> specAttributes = reqIF.getCoreContent().getSpecTypes().get(0).getSpecAttributes();
//		AttributeDefinitionString attributeDefinition = (AttributeDefinitionString) specAttributes.get(0);
//		
//		StringFilter stringFilter = new StringFilter(IFilter.Operator.EQUALS, "ABC",  attributeDefinition, true);
//		assertTrue(stringFilter.match(object));
//	}
//
//	
//	AttributeDefinitionString createAttributeDefinitionString(String id){
//		AttributeDefinitionString ad = ReqIF10Factory.eINSTANCE.createAttributeDefinitionString();
//		ad.setIdentifier(id);
//		return ad;
//	}
//	
//	DatatypeDefinitionString createDatatypeDefinitionString(String id){
//		DatatypeDefinitionString dd = ReqIF10Factory.eINSTANCE.createDatatypeDefinitionString();
//		dd.setIdentifier(id);
//		return dd;
//	}
//	
//	AttributeValueString createAttributeValueString(String theValue){
//		AttributeValueString av = ReqIF10Factory.eINSTANCE.createAttributeValueString();
//		av.setTheValue(theValue);
//		return av;
//	}
//	
//	SpecObject createSpecObject(String id){
//		SpecObject specObject = ReqIF10Factory.eINSTANCE.createSpecObject();
//		specObject.setIdentifier(id);
//		return specObject;
//	}
//	
//	SpecObject createSpecObjectWithString(String id, String stringValue, AttributeDefinitionString attributeDefinition){
//		DatatypeDefinitionString definitionString = createDatatypeDefinitionString("DD_STRING_ID");
//		attributeDefinition.setType(definitionString);
//		AttributeValueString attributeValue = createAttributeValueString(stringValue);
//		attributeValue.setDefinition(attributeDefinition);
//		SpecObject specObject = createSpecObject(id);
//		specObject.getValues().add(attributeValue);
//		return specObject;
//	}




	@Override
	public Set<Operator> getSupportedOperators() {
		return StringFilter.SUPPORTED_OPERATORS; 
	}


	@Override
	public IFilter createFilterInstance(Operator operator) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public void createFixture(Object value) {
		String theValue = (String) value;
		
		attributeDefinition = ReqIF10Factory.eINSTANCE.createAttributeDefinitionString();
		attributeDefinition.setIdentifier("AD_ID0");
		DatatypeDefinitionString definition = ReqIF10Factory.eINSTANCE.createDatatypeDefinitionString();
		definition.setIdentifier("DD_ID0");
		attributeDefinition.setType(definition);
		AttributeValueString attributeValue = ReqIF10Factory.eINSTANCE.createAttributeValueString();
		attributeValue.setDefinition(attributeDefinition);
		attributeValue.setTheValue(theValue);
		SpecObject specObject = ReqIF10Factory.eINSTANCE.createSpecObject();
		specObject.getValues().add(attributeValue);
		specObject.setLastChange(new GregorianCalendar(2014, 12, 03));
		specObject.setIdentifier("THE_SPECOBJECT_ID");
		specObject.setDesc("THE_SPECOBJECT_DESC");
		specObject.setLongName("THE_SPECOBJECT_LONG_NAME");
		
		setFixture(specObject);
		
	}
	
}
