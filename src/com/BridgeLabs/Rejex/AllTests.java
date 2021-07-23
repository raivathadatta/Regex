package com.BridgeLabs.Rejex;

import static org.junit.Assert.assertEquals;

import java.util.LinkedList;

import org.junit.Test;

import junit.framework.Assert;

public class AllTests {
	LinkedList<String> list = new LinkedList<String>();
	LinkedList<String> invalied = new LinkedList<String>();
	UserValidation rejex = new UserValidation();

	@Test
	public void testFirstname() throws Exception {
		try {
			UserValidation userImpl = new UserValidation();
			userImpl.validateName("datta");
		} catch (UserRegistrationException e) {
			assertEquals(UserRegistrationException.ExceptionType.INVALID_NAME, e.type);
		}
	}

	@Test
	public void testFirstname1() {

		try {
			assertEquals(false, rejex.validateName("da"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void testFirstname11() throws Exception {
		try {
			assertEquals(true, rejex.validateName("Datta"));
		} catch (Exception e) {
			throw new Exception("Enter wrong Format");
		}
	}

	@Test
	public void testPhoneNumber() throws Exception {
		String string = "+91 852147963";
		try {
			assertEquals(true, rejex.valisdatePhoneNumber(string));
		} catch (UserRegistrationException e) {
			throw new UserRegistrationException(UserRegistrationException.ExceptionType.INVALID_PHONRNUMBER);
		}
	}

	@Test
	public void testPhoneNumberWrong() throws Exception {
		String string = "+97963";
		try {
			rejex.valisdatePhoneNumber(string);
		} catch (UserRegistrationException e) {
			assertEquals(UserRegistrationException.ExceptionType.INVALID_PHONRNUMBER, e.type);
		}
	}

	@Test
	public void testPassword() throws Exception {
		String string = "acd#121A25";
		try {
			assertEquals(true, rejex.validatepassWord(string));
		} catch (UserRegistrationException e) {
			throw new UserRegistrationException(UserRegistrationException.ExceptionType.INVALID_PASSWORD);
		}

	}

	@Test
	public void testPasswordWrong() throws Exception {
		String string = "acdA25";
		try {
			rejex.validatepassWord(string);
		} catch (UserRegistrationException e) {
			assertEquals(UserRegistrationException.ExceptionType.INVALID_PASSWORD, e.type);
		}

	}
}
