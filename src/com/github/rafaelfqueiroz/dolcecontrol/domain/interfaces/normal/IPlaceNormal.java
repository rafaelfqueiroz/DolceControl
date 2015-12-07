package com.github.rafaelfqueiroz.dolcecontrol.domain.interfaces.normal;

import com.github.rafaelfqueiroz.dolcecontrol.domain.interfaces.IPlace;
import com.github.rafaelfqueiroz.dolcecontrol.exceptions.InvalidName;

public interface IPlaceNormal extends IPlace {

	//@ ensures \result == mName;
	public /*@ pure @*/ String getName();

	//@ public normal_behavior
	//@ requires mName != "";
	//@ assignable mName;
	//@ ensures mName == name;
	public void setName(String name) throws InvalidName;
}
