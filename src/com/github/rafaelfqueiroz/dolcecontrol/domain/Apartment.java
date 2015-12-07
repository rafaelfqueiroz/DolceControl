package com.github.rafaelfqueiroz.dolcecontrol.domain;

import java.util.Date;

import com.github.rafaelfqueiroz.dolcecontrol.exceptions.AllocableNotAvailableException;
import com.github.rafaelfqueiroz.dolcecontrol.exceptions.InvalidName;

public class Apartment extends AbstractPlace {

	@Override
	public void allocate(Date dateTime, double aditionalTime) throws AllocableNotAvailableException {
		// TODO Auto-generated method stub

	}

	@Override
	public String getName() {
		return "A";
	}

	@Override
	public boolean isAvailable() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setName(String name) throws InvalidName {
		// TODO Auto-generated method stub

	}
}
