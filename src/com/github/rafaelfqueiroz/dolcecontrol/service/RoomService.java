package com.github.rafaelfqueiroz.dolcecontrol.service;

import java.util.List;

import com.github.rafaelfqueiroz.dolcecontrol.domain.Place;
import com.github.rafaelfqueiroz.dolcecontrol.utils.DataBase;

public class RoomService {

	public List<Place> all() {
		return DataBase.getInstance().getRooms();
	}
	
	
	
}
