package com.github.rafaelfqueiroz.dolcecontrol.dao;

import java.util.List;

public interface DAO<T> {

	List<T> findAll();
}
