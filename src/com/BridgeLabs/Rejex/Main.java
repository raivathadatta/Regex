package com.BridgeLabs.Rejex;

import Utility.Utility;

public class Main {
	public static void main(String[] args) throws Exception {
		Utility utility = new Utility();
		
		UserRegistration person = new UserRegistration();
		
		System.out.println("Enter firstName");
		person.setFirstName(utility.getStiring());
		System.out.println(UserValidation.validateName(person.getFirstName()));

		System.out.println("Enter Middle Name");
		person.setLastNmae(utility.getStiring());
		System.out.println(UserValidation.validateName(person.getLastNmae()));

		System.out.println("Enter phone Number");
		person.setPhoneNumber(utility.getStiring());
		System.out.println(UserValidation.valisdatePhoneNumber(person.getPhoneNumber()));

		System.out.println("Enter Email");
		person.setEmail(utility.getStiring());
		System.out.println(UserValidation.validateEmail(person.getEmail()));

		System.out.println("Enter Password");
		person.setPassWord(utility.getStiring());
		System.out.println(UserValidation.validatepassWord(person.getPassWord()));

	}
}
