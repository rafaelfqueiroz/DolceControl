package com.github.rafaelfqueiroz.dolcecontrol.domain;

public interface Room {

	public int getNumber();
	public void setNumber(int number);
	
	public double getCostForStay();
	public void setCostForStay(double costForStay);
	
	public int getMinimumTime();
	public void setMinimumTime(int minimumTime);
	
	public boolean getStatus();
	public void setStatus(boolean status);
	
}
