package com.BridgeLabs.Rejex;

import static org.junit.Assert.assertEquals;

import java.util.LinkedList;

import org.junit.Test;

public class AllTests {
	LinkedList<String> list = new LinkedList<String>();
	LinkedList<String> invalied = new LinkedList<String>();
	Rejex rejex = new Rejex();

	@Test
	public void testFirstname() throws Exception {
		try {
			assertEquals(false, rejex.validateName("da"));
		} catch (Exception e) {
			throw new Exception("Enter wrong Format");
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

	public void trueEmails() {

		list.add("abc@yahoo.com");
		list.add("abc-100@yahoo.com");
		list.add("abc.100@yahoo.com");
		list.add("abc111@abc.com");
		list.add("abc-100@abc.net");
		// list.add("abc.100@abc.com.au");
		list.add("abc@1.com");
		list.add("abc@1.com");
		list.add("abc@gmail.com");

	}

	@Test
	public void testValiedEmail() throws Exception {
		trueEmails();
		for (String string : list) {
			System.out.println(string);
			try {
				assertEquals(true, rejex.validateEmail(string));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				throw new Exception(" invalid email");
			}
		}

	}

	@Test
	public void testInvaliedEmail() throws Exception {
		invaliedEmail();
		for (String string : invalied) {
			System.out.println(string);
			try {
				assertEquals(false, rejex.validateEmail(string));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				throw new Exception("invalied Email");
			}
		}
	}
@Test
public void testPhoneNumber() throws Exception {
	String string ="+91 852147963";
	try {
		assertEquals(true, rejex.valisdatePhoneNumber(string));
	} catch (Exception e) {
		throw new Exception("Entered Phone Number ForMatis Wrong");
	}
}
	private void invaliedEmail() {
		invalied.add("abc");
		invalied.add(".abc@.com.my");
		invalied.add("abc123@gmail.a");
		invalied.add("abc123@.com");
		invalied.add(" .abc@abc.com");
		invalied.add("abc()*@gmail.com");
		invalied.add(" abc()*@gmail.com");
		invalied.add("abc..2002@gmail.com");
		invalied.add("abc@gmail.com.1a");
		invalied.add("abc@gmail.com.1a");
		invalied.add(" abc@gmail.com.aa.au");
		invalied.add("abc@%*.com");
	}

}
