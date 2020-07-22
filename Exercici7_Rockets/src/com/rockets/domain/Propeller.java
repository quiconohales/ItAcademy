package com.rockets.domain;

public class Propeller {
	private int power;
	private int maxPower;
	
//	public Propeller (Power power) {
//		
//	}
	public Propeller (int power,int maxPower) {
		this.power=power;
		this.maxPower=maxPower;
	}
	public int getPower() {
		return power;
	}
	public int getmaxPower() {
		return maxPower;
	}
	
}
