package com.rocket.domain;

public class Propeller  {
	private int power;
	private int maxPower;

	public Propeller (int power,int maxPower) {
		this.power=power;
		this.maxPower=maxPower;
	}
	public int getMaxPower() {
		return maxPower;
	}

	public void setPower(int power) {
		this.power = power;
	}
	public int getPower() {
		return power;
	}
	public int getmaxPower() {
		return maxPower;
	}
	
}
