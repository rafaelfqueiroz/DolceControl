package com.github.rafaelfqueiroz.dolcecontrol.exceptions;

public class OptionNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;
	
	private final String MESSAGE = "OPTION NOT FOUND!!! CHOOSE AN OPTION FROM THE LIST!!!";
	
	@Override
	public String getMessage() {
		return MESSAGE;
	}
}
