package com.github.rafaelfqueiroz.dolcecontrol.dao;

import java.util.List;

import com.github.rafaelfqueiroz.dolcecontrol.domain.Place;
import com.github.rafaelfqueiroz.dolcecontrol.utils.DataBase;

public class RoomDAO implements DAO<Place>{

	@SuppressWarnings("static-access")
	@Override
	public List<Place> findAll() {
		
		return DataBase.getInstance().getRooms();
	}
}
