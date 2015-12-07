package com.github.rafaelfqueiroz.dolcecontrol.domain.interfaces.exceptional;

import java.util.Date;

import com.github.rafaelfqueiroz.dolcecontrol.domain.interfaces.IAllocable;
import com.github.rafaelfqueiroz.dolcecontrol.exceptions.AllocableNotAvailableException;

public interface IAllocableExceptional extends IAllocable {

	//@ public exceptional_behavior
	//@ requires !isAvailable() || dateTime == null || dateTime < Instante.now() || aditionalTime == null || aditionalTime < 0;
	//@ assignable \nothing;
	//@ signals_only AllocableNotAvailableException;
	public void allocate(Date dateTime, double aditionalTime) throws AllocableNotAvailableException;
}
