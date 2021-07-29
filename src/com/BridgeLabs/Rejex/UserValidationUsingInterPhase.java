package com.BridgeLabs.Rejex;

import java.util.regex.Pattern;

public class UserValidationUsingInterPhase {

	public UserValidationInterphace validateName = (String check) -> {
		String compiler = "^[A-Z]\\w{2,}$";

		boolean send = Pattern.compile(compiler).matcher(check).matches();
		if (!send) {
			throw new UserRegistrationException(UserRegistrationException.ExceptionType.INVALID_NAME);
		}
		return send;

	};

	public UserValidationInterphace valisdatePhoneNumber = (String phoneNumer) -> {
		String regex = "^\\+(?:[0-9] ?){6,14}[0-9]$";
		boolean send = Pattern.matches(regex, phoneNumer);
		if (!send) {
			throw new UserRegistrationException(UserRegistrationException.ExceptionType.INVALID_PHONRNUMBER);

		}
		return send;
	};
	public UserValidationInterphace validateEmail =(String email)-> {
		if (email.length() == 0)
			return false;
		String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
		boolean send = Pattern.matches(regex, email);
		if (!send) {
			throw new UserRegistrationException(UserRegistrationException.ExceptionType.INVALID_EMAIL_ID);

		}
		return send;
	};
	
	public UserValidationInterphace validatepassWord=(String passWord) ->{
		System.err.println(passWord + " 2525");
		String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{6,}$";

		boolean send = Pattern.matches(regex, passWord);
		if (!send) {
			throw new UserRegistrationException(UserRegistrationException.ExceptionType.INVALID_PASSWORD);

		}
		return send;

	};

	
}