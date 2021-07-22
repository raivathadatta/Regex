package com.BridgeLabs.Rejex;

import java.util.regex.Pattern;

public class Rejex {

	public static boolean validateName(String check) {
		String compiler = "^[A-Z]\\w{2,}$";
		return Pattern.compile(compiler).matcher(check).matches();
	}

	public static  boolean valisdatePhoneNumber(String phoneNumer) {
		String regex = "^\\+(?:[0-9]?){6-14}[0-9]";
		return Pattern.matches(regex, phoneNumer);
	}

	public  static boolean validateEmail(String email) {
		if (email.length() == 0)
			return false;
		String regex = "^(.+)@(.+)$";// $ represents the end of the string ^ represents the starting of a string
		return Pattern.matches(regex, email);
	}

	public static  boolean validatepassWord(String passWord) {
		String regex = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,}$";
		return Pattern.matches(regex, passWord);

	}

}
