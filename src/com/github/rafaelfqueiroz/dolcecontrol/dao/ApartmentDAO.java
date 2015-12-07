package com.github.rafaelfqueiroz.dolcecontrol.dao;

import java.util.List;

import com.github.rafaelfqueiroz.dolcecontrol.domain.AbstractPlace;
import com.github.rafaelfqueiroz.dolcecontrol.domain.interfaces.IPlace;
import com.github.rafaelfqueiroz.dolcecontrol.utils.DataBase;

public class ApartmentDAO implements DAO<IPlace> {

	@SuppressWarnings("static-access")
	@Override
	public List<AbstractPlace> findAll() {

		return DataBase.getInstance().getApartaments();
	}
}
