package com.github.rafaelfqueiroz.dolcecontrol.utils;

import java.util.LinkedList;
import java.util.List;

import com.github.rafaelfqueiroz.dolcecontrol.domain.AbstractPlace;
import com.github.rafaelfqueiroz.dolcecontrol.domain.Apartment;
import com.github.rafaelfqueiroz.dolcecontrol.domain.Chalet;
import com.github.rafaelfqueiroz.dolcecontrol.domain.interfaces.IPlace;

public class DataBase {

	private static List<AbstractPlace> apartments = new LinkedList<AbstractPlace>();
	private static List<IPlace> chalets = new LinkedList<IPlace>();
	private static DataBase dataBase;

	public static List<AbstractPlace> getApartaments() {
		return apartments;
	}

	public static DataBase getInstance() {
		if (dataBase == null) {
			dataBase = new DataBase();
		}
		return dataBase;
	}

	private DataBase() {
		this.populateDatabase();
	}

	private void populateDatabase() {
		for (int i = 100; i <= 200; i += 10) {
			final AbstractPlace apartment = new Apartment();
			apartments.add(apartment);
		}

		for (int i = 200; i <= 400; i += 50) {
			final AbstractPlace chalet = new Chalet();
			chalets.add(chalet);
		}

	}

}
