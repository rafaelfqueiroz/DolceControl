package com.github.rafaelfqueiroz.dolcecontrol.utils;

import java.util.LinkedList;
import java.util.List;

import com.github.rafaelfqueiroz.dolcecontrol.domain.Room;

public class DataBase {

	private static List<Room> rooms = new LinkedList<Room>();
	
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
	
	public static List<Room> getRooms() {
		return rooms;
	}
	
	private void populateDatabase() {
		
	}
}
