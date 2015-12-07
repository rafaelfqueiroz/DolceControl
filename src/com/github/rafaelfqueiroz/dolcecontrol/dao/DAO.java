package com.github.rafaelfqueiroz.dolcecontrol.dao;

import java.util.List;

import com.github.rafaelfqueiroz.dolcecontrol.domain.AbstractPlace;

public interface DAO<T> {

	List<AbstractPlace> findAll();
}
