package com.github.rafaelfqueiroz.dolcecontrol.utils;

import java.util.LinkedList;
import java.util.List;

import com.github.rafaelfqueiroz.dolcecontrol.domain.Place;

public class DataBase {

	private static List<Place> rooms = new LinkedList<Place>();
	
	private static DataBase dataBase;
	
	private DataBase() {
		populateDatabase();
	}
	
	public static DataBase getInstance() {
		if (dataBase == null) {
			dataBase = new DataBase();
		}
		return dataBase;
	}
	
	public static List<Place> getRooms() {
		return rooms;
	}
	
	private void populateDatabase() {
		
	}
}
