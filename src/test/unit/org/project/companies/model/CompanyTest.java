package org.project.companies.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/*
 * Unit test class, we test the getters from the company class to ensure data is returning as expected
 * Using an asserEquals method compares both the expected result and the actual result
 */

public class CompanyTest {

	// create Company instance
	Company company = new Company(3, "MobileCafe", "23 oldtown road, whitehall", "D11", "Hospitality",
			"Looking for open space to serve the public");

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetCompanyName() {
		String expectCompanName = "MobileCafe";
		String actualCompanyName = company.getCompanyName();
		assertEquals(expectCompanName, actualCompanyName);
	}

	@Test
	public void testGetAddress() {
		String expectAddress = "23 oldtown road, whitehall";
		String actualAddress = company.getAddress();
		assertTrue(expectAddress.contentEquals(actualAddress));
	}

	@Test
	public void testGetPostcode() {
		String expectPostcode = "D11";
		String actualPostcode = company.getPostcode();
		assertEquals(expectPostcode, actualPostcode);
	}

	@Test
	public void testGetSector() {
		String expectSector = "Hospitality";
		String actualSector = company.getSector();
		assertEquals(expectSector, actualSector);
	}

	@Test
	public void testGetDetails() {
		String expectDetails = "Looking for open space to serve the public";
		String actualDetails = company.getDetails();
		assertEquals(expectDetails, actualDetails);

	}

}
