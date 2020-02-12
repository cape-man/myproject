package com.mindtree.mystayapplication.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

public class UserAlreadyBookedForTheDayException extends ServiceException {

	public UserAlreadyBookedForTheDayException() {
		super("User Already Booked For That Day");
	}

	public UserAlreadyBookedForTheDayException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
		// TODO Auto-generated constructor stub
	}

	public UserAlreadyBookedForTheDayException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	public UserAlreadyBookedForTheDayException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public UserAlreadyBookedForTheDayException(Throwable arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

}
