package com.github.rafaelfqueiroz.dolcecontrol.main;

import java.util.Scanner;

import com.github.rafaelfqueiroz.dolcecontrol.exceptions.OptionNotFoundException;
import com.github.rafaelfqueiroz.dolcecontrol.utils.Commands;

public class Main {

	public static void main(String[] args) {
		Commands command = Commands.START;
		while (command != Commands.EXIT) {
			printOptions();
			try {
				command = readOption();
				if (command == Commands.EXIT) {	break; 
				} else if (command == Commands.LIST_ALL){
					
				}
				
				
			} catch (OptionNotFoundException e) {
				printMessage(e.getMessage());
			}
		}
	}
	
	private static void printOptions() {
		StringBuilder optionsString = new StringBuilder();
		optionsString.append("Choose an option:\n");
		optionsString.append("[1] List all rooms;");
		optionsString.append("[2] List free rooms;");
		optionsString.append("[3] Occupy room;");
		System.out.println(optionsString.toString());
	}
	
	private static Commands readOption() throws OptionNotFoundException {
		Scanner scanIn = new Scanner(System.in);
		String option = scanIn.nextLine();
		scanIn.close();
		Commands choosenOption = Commands.valueOf(option);
		if (choosenOption == null) {
			throw new OptionNotFoundException();
		}
		return choosenOption;
	}
	
	private static void printMessage(String message) {
		System.out.println(message);
	}
}
