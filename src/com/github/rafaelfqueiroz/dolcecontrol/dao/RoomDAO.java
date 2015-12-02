package com.github.rafaelfqueiroz.dolcecontrol.dao;

import java.util.List;

import com.github.rafaelfqueiroz.dolcecontrol.domain.Room;
import com.github.rafaelfqueiroz.dolcecontrol.utils.DataBase;

public class RoomDAO implements DAO<Room>{

	@SuppressWarnings("static-access")
	@Override
	public List<Room> findAll() {
		
		return DataBase.getInstance().getRooms();
	}
}
