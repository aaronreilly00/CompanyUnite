package org.project.companies.model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AccountTest {

	//create Company instance
	Company company = new Company(3,"MobileCafe","23 oldtown road, whitehall","D11","Hospitality","Looking for open space to serve the public");
		
	//create Company instance
	Account account = new Account(2,company,"Rachel","Johnson","RachJohnson567","hhfotyf369","08924372","RachJohnson@fakegmail.com");
		
		
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetFirstName() {
		String expectFirstName = "Rachel";
		String actualFirstName = account.getFirstName();
		assertEquals(expectFirstName,actualFirstName);
	}

	@Test
	public void testGetLastName() {
		String expectLastName = "Johnson";
		String actualLastName = account.getLastName();
		assertEquals(expectLastName,actualLastName);
	}

	@Test
	public void testGetUsername() {
		String expectUsername = "RachJohnson567";
		String actualUsername = account.getUsername();
		assertEquals(expectUsername,actualUsername);
	}

	@Test
	public void testGetPassword() {
		String expectPassword = "hhfotyf369";
		String actualPassword = account.getPassword();
		assertEquals(expectPassword,actualPassword);
	}

	@Test
	public void testGetPhone() {
		String expectPhone = "08924372";
		String actualPhone = account.getPhone();
		assertEquals(expectPhone,actualPhone);
	}

	@Test
	public void testGetEmail() {
		String expectEmail = "RachJohnson@fakegmail.com";
		String actualEmail = account.getEmail();
		assertEquals(expectEmail,actualEmail);
	}

}
