package com.github.rafaelfqueiroz.dolcecontrol.domain;

import java.util.List;

import com.github.rafaelfqueiroz.dolcecontrol.domain.interfaces.exceptional.IAllocableExceptional;
import com.github.rafaelfqueiroz.dolcecontrol.domain.interfaces.exceptional.IPlaceExceptional;
import com.github.rafaelfqueiroz.dolcecontrol.domain.interfaces.normal.IAllocableNormal;
import com.github.rafaelfqueiroz.dolcecontrol.domain.interfaces.normal.IPlaceNormal;

public abstract class AbstractPlace
		implements IPlaceNormal, IPlaceExceptional, IAllocableNormal, IAllocableExceptional {

	private double aditionalUnitTimePrice; //@ in mAllocable;
	//@ private represents mAditionalUnitTimePrice <- aditionalUnitTimePrice;
	private List<Allocation> allocations; //@ in mAllocable;
	//@ private represents mAllocations <- allocations;
	private double minimumUnitTime; //@ in mAllocable;
	//@ private represents mMinimumUnitTime <- minimumUnitTime;
	private double minimumUnitTimePrice; //@ in mAllocable;
	//@ private represents mMinimumUnitTimePrice <- minimumUnitTimePrice;
	private double timeUnit; //@ in mAllocable;
	//@ private represents mTimeUnit <- timeUnit;

	public double getAditionalUnitTimePrice() {
		return this.aditionalUnitTimePrice;
	}

	public List<Allocation> getAllocations() {
		return this.allocations;
	}

	public double getMinimumUnitTime() {
		return this.minimumUnitTime;
	}

	public double getMinimumUnitTimePrice() {
		return this.minimumUnitTimePrice;
	}

	public double getTimeUnit() {
		return this.timeUnit;
	}

	public void setAditionalUnitTimePrice(double aditionalUnitTimePrice) {
		this.aditionalUnitTimePrice = aditionalUnitTimePrice;
	}

	public void setAllocations(List<Allocation> allocations) {
		this.allocations = allocations;
	}

	public void setMinimumUnitTime(double minimumUnitTime) {
		this.minimumUnitTime = minimumUnitTime;
	}

	public void setMinimumUnitTimePrice(double minimumUnitTimePrice) {
		this.minimumUnitTimePrice = minimumUnitTimePrice;
	}

	public void setTimeUnit(double timeUnit) {
		this.timeUnit = timeUnit;
	}
}
