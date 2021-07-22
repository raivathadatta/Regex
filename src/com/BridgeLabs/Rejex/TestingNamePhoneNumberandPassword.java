package com.BridgeLabs.Rejex;

import static org.junit.Assert.assertEquals;

import java.util.LinkedList;

import org.junit.Test;

public class TestingNamePhoneNumberandPassword {
	LinkedList<String> list = new LinkedList<String>();
	LinkedList<String> invalied = new LinkedList<String>();
	Rejex rejex = new Rejex();

	@Test
	public void testFirstname() {
		assertEquals(false, rejex.validateName("da"));
	}

	@Test
	public void testFirstname1() {

		assertEquals(false, rejex.validateName("da"));
	}

	@Test
	public void testFirstname11() {
		assertEquals(true, rejex.validateName("Datta"));
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
	public void testValiedEmail() {
		trueEmails();
		for (String string : list) {
			System.out.println(string);
			assertEquals(true, rejex.validateEmail(string));
		}

	}

	@Test
	public void testInvaliedEmail() {
		invaliedEmail();
		for (String string : invalied) {
			System.out.println(string);
			assertEquals(false, rejex.validateEmail(string));
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
