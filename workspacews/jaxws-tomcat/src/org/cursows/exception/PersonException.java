package org.cursows.exception;

import javax.xml.ws.WebFault;

@WebFault
public class PersonException extends Exception {

	public PersonException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PersonException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public PersonException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public PersonException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public PersonException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
