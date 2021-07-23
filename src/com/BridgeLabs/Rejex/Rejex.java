package com.BridgeLabs.Rejex;

import java.util.regex.Pattern;

public class Rejex extends Exception {

	public static boolean validateName(String check) throws Exception {
		String compiler = "^[A-Z]\\w{2,}$";
		
		boolean send=Pattern.compile(compiler).matcher(check).matches();
		if(!send) {
			throw new UserRegistrationException(UserRegistrationException.ExceptionType.INVALID_NAME);
		}
		return send;
	}

	public static  boolean valisdatePhoneNumber(String phoneNumer)throws Exception  {
		String regex = "^\\+(?:[0-9] ?){6,14}[0-9]$";
		boolean send=Pattern.matches(regex, phoneNumer);
		if(!send) {
			throw new UserRegistrationException(UserRegistrationException.ExceptionType.INVALID_PHONRNUMBER);

		}
		return send;
	}
 
	public static boolean validateEmail(String email) throws Exception{
		if (email.length() == 0)
			return false;
		String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";// $ represents the end of the string ^ represents the starting of a string
		boolean send=Pattern.matches(regex, email);
		if(!send) {
			throw new UserRegistrationException(UserRegistrationException.ExceptionType.INVALID_EMAIL_ID);

		}
		return send;
	}

	public static  boolean validatepassWord(String passWord)throws Exception {
		System.err.println(passWord+" 2525");
		String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{6,}$";
		
		boolean send = Pattern.matches(regex, passWord);
		if(!send) {
			throw new UserRegistrationException(UserRegistrationException.ExceptionType.INVALID_PASSWORD);

		}
		return send;

	}

}