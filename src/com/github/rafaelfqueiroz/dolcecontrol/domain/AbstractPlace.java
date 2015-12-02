package com.github.rafaelfqueiroz.dolcecontrol.domain;

public abstract class AbstractPlace implements Place {

	private int number;
	private double costForStay;
	private int minimumTime;
	private boolean status;
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public double getCostForStay() {
		return costForStay;
	}
	public void setCostForStay(double costForStay) {
		this.costForStay = costForStay;
	}
	public int getMinimumTime() {
		return minimumTime;
	}
	public void setMinimumTime(int minimumTime) {
		this.minimumTime = minimumTime;
	}
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
}
