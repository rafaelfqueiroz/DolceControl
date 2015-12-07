package com.github.rafaelfqueiroz.dolcecontrol.service;

import java.util.List;

import com.github.rafaelfqueiroz.dolcecontrol.dao.ApartmentDAO;
import com.github.rafaelfqueiroz.dolcecontrol.domain.AbstractPlace;

public class ApartmentService {
	private final ApartmentDAO apartmentDao;

	public ApartmentService() {
		super();
		this.apartmentDao = new ApartmentDAO();
	}

	public List<AbstractPlace> all() {
		return this.apartmentDao.findAll();
	}

}
