package com.BridgeLabs.Rejex;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runner.Runner;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class TestingEmail {
	String email;
	boolean compare;

	public TestingEmail(String email, boolean compare) {
		super();
		this.email = email;
		this.compare = compare;
	}
	@Before
	public void initialize() {
		TestingEmail testing = new TestingEmail(email, compare);
	}
	@Parameterized.Parameters
       public static Collection parameters() {
		return Arrays.asList(new Object[][] {
			{" abc",false},{".abc@.com.my",false},{"abc123@gmail.a",false},{"abc123@.com",false},{".abc@abc.com",false},
			{"abc()*@gmail.com",false},{" abc()*@gmail.com",false},{" abc()*@gmail.com",false},{"abc..2002@gmail.com",false},
			{"abc@%*.com",false},{" abc@gmail.com.aa.au",false},{"abc@gmail.com.1a",false},{"abc+%@gmail.com.1a",false},
			{"abc@yahoo.com",true},{"abc-100@yahoo.com",true},{"abc.100@yahoo.com",true},{"abc111@abc.com",true},{"abc-100@abc.net",true},
			{"abc.100@abc.com.au",true},{"abc@1.com",true},{"abc@1.com",true},{"abc@gmail.com",true}
		});
	}
	@Test
	public void testEmail() throws Exception  {
		try {
			assertEquals(compare,UserValidation .validateEmail(email));
		} catch (Exception e) {
			throw new Exception("Enter wrong Email Format");
		}
	}
	 @Test
	    public void givenEmail_IsValidOrInvalid() throws Exception {
	        try {
	          UserValidation userImpl = new UserValidation();
	            userImpl.validateEmail(this.email);
	        } catch ( UserRegistrationException e) {
	            assertEquals(UserRegistrationException.ExceptionType.INVALID_EMAIL_ID, e.type);
	        }
	    }
}
