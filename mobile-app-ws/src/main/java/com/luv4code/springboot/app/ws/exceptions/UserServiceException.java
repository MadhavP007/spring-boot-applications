package com.luv4code.springboot.app.ws.exceptions;

public class UserServiceException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public UserServiceException(String message) {
		super(message);
	}
}
