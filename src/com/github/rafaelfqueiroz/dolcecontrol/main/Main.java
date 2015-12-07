package com.github.rafaelfqueiroz.dolcecontrol.main;

import java.util.List;
import java.util.Scanner;

import com.github.rafaelfqueiroz.dolcecontrol.domain.AbstractPlace;
import com.github.rafaelfqueiroz.dolcecontrol.exceptions.OptionNotFoundException;
import com.github.rafaelfqueiroz.dolcecontrol.service.ApartmentService;
import com.github.rafaelfqueiroz.dolcecontrol.utils.Commands;
import com.github.rafaelfqueiroz.dolcecontrol.utils.VisualIdentity;

public class Main {

	public static void main(String[] args) {
		Commands command = Commands.START;
		while (command != Commands.EXIT) {
			VisualIdentity.printLogotype();
			printPlaces();
			try {
				command = readOption();
				if (command == Commands.EXIT) {
					break;
				} else if (command == Commands.LIST_ALL) {

				}

			} catch (final OptionNotFoundException e) {
				printMessage(e.getMessage());
			}
		}
	}

	private static void printMessage(String message) {
		System.out.println(message);
	}

	private static void printOptions() {
		final StringBuilder optionsString = new StringBuilder();
		optionsString.append("Choose an option:\n");
		optionsString.append("[1] List all rooms;");
		optionsString.append("[2] List free rooms;");
		optionsString.append("[3] Occupy room;");
		System.out.println(optionsString.toString());
	}

	private static void printPlaces() {
		final ApartmentService apartmentService = new ApartmentService();
		final List<AbstractPlace> apartments = apartmentService.all();

		final StringBuilder outputString = new StringBuilder();

		outputString.append(
				"                ____________ ______________________________________________________________________________________________________");
		outputString.append(
				"\n               |------------|------------------------------------------------------------------------------------------------------");
		for (int i = 0; i < apartments.size(); i++) {
			if ((apartments.size() / 2) == i) {
				outputString.append("\n               | APARTMENTS | ");
			} else if ((i % 5) == 0) {
				outputString.append("\n               |            | ");
			}
			outputString.append(apartments.get(i).getName() + " (" + apartments.get(i).isAvailable() + ")     ");
		}

		outputString.append(
				"\n               |------------|------------------------------------------------------------------------------------------------------");
		System.out.println(outputString.toString());
	}

	private static Commands readOption() throws OptionNotFoundException {
		final Scanner scanIn = new Scanner(System.in);
		final String option = scanIn.nextLine();
		scanIn.close();
		final Commands choosenOption = Commands.valueOf(option);
		if (choosenOption == null) {
			throw new OptionNotFoundException();
		}
		return choosenOption;
	}
}
