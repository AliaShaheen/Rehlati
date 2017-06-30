package com.rehlati.client.exceptions;

import java.io.Serializable;

public class InvalidCardNumberException extends Exception implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -786453687923994385L;

	private String message;
	 public InvalidCardNumberException(String message) {
		this. message=message;
	}
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return this. message;
	}
	
}
