package com.github.rafaelfqueiroz.dolcecontrol.utils;

public enum Commands {
	LIST_ALL(1),
	LIST_OCCUPIED(2),
	START(-1),
	EXIT(0);
	
	private final int value;
	
	Commands(int optionValue) {
		value = optionValue;
	}
	
	public int getValue() {return value;}
}
