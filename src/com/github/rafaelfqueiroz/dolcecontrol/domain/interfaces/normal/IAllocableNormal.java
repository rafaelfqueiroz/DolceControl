package com.github.rafaelfqueiroz.dolcecontrol.domain.interfaces.normal;

import java.util.Date;

import com.github.rafaelfqueiroz.dolcecontrol.domain.interfaces.IAllocable;
import com.github.rafaelfqueiroz.dolcecontrol.exceptions.AllocableNotAvailableException;

public interface IAllocableNormal extends IAllocable {

	//@ public normal_behavior
	//@ requires isAvaliable();
	//@ requires dateTime != null;
	//@ requires dateTime >= Instante.now();
	//@ requires aditionalTime != null;
	//@ requires aditionalTime >= 0;
	//@ assignable allocations;
	//@ ensures this.allocations.size() == \old(allocations.size()) + 1;
	//@ ensures ( \forall int i; 0 <= i && i < \old(allocations.size()); allocations.get(i).equals( \old(allocations.get(i)) ) );
	public void allocate(Date dateTime, double aditionalTime) throws AllocableNotAvailableException;

	//@ requires mAllocations.size() > 0;
	//@ ensures \result = mAllocations.get(mAllocations.size() - 1).getEndTime() < Instante.now();
	public /*@ pure @*/ boolean isAvailable();

}
