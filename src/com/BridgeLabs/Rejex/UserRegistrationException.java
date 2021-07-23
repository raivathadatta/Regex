package com.BridgeLabs.Rejex;

public class UserRegistrationException extends Exception {
	ExceptionType type;

	enum ExceptionType {
		INVALID_EMAIL_ID, INVALID_NAME, INVALID_PHONRNUMBER, INVALID_PASSWORD
	}

	public UserRegistrationException(ExceptionType type) {
		super();
		this.type = type;
	}
}
