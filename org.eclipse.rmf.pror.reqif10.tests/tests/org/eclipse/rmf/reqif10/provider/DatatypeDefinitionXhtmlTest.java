/*******************************************************************************
 * Copyright (c) 2011 Formal Mind GmbH and University of Dusseldorf.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Michael Jastram - initial API and implementation
 ******************************************************************************/

package org.eclipse.rmf.reqif10.provider;

import org.eclipse.rmf.reqif10.DatatypeDefinitionXhtml;
import org.eclipse.rmf.reqif10.Reqif10Factory;
import org.junit.After;
import org.junit.Before;

/**
 * A test case for the model object '<em><b>Datatype Definition Xhtml</b></em>'.
 */
public class DatatypeDefinitionXhtmlTest extends DatatypeDefinitionTest {

	/**
	 * Returns the fixture for this Datatype Definition Xhtml test case.
	 */
	@Override
	protected DatatypeDefinitionXhtml getFixture() {
		return (DatatypeDefinitionXhtml)fixture;
	}

	/**
	 * @see junit.framework.TestCase#setUp()
	 */
	@Before
	public void setUpDatatypeDefinitionXhtmlTest() throws Exception {
		setFixture(Reqif10Factory.eINSTANCE.createDatatypeDefinitionXhtml());
	}

	/**
	 * @see junit.framework.TestCase#tearDown()
	 */
	@After
	public void tearDownDatatypeDefinitionXhtmlTest() throws Exception {
		setFixture(null);
	}

} //DatatypeDefinitionXhtmlTest
