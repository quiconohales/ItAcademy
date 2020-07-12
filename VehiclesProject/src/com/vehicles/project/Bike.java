package com.vehicles.project;

import java.util.List;

public class Bike extends Vehicle {

	public Bike(String plate, String brand, String color) {
		super(plate, brand, color);
	}

	public void addWheel(List<Wheel> frontWheels, List<Wheel> backWheels) throws Exception {
		addFrontWheel(frontWheels);
		addBackWheel(backWheels);
	}

	public void addFrontWheel(List<Wheel> wheels) throws Exception {

		if (wheels.size() != 1)
			throw new Exception();

		Wheel FrontWheel = wheels.get(0);

		this.wheels.add(FrontWheel);
		// this.wheels.add(rightWheel);
	}

	public void addBackWheel(List<Wheel> wheels) throws Exception {

		if (wheels.size() != 1)
			throw new Exception();

		Wheel BackWheel = wheels.get(0);

		this.wheels.add(BackWheel);
		// this.wheels.add(rightWheel);

}

}