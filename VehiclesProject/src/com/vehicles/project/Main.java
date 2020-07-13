package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner car_registration = new Scanner(System.in);
		Scanner car_double = new Scanner(System.in);
		Car car = null;
		Bike bike = null;

		InputCommons entrada = new InputCommons(car_double);

		//////////// P H A S E 2 For implement the phase 2 make a new metod
		//////////// askCarRegistration

		int option = entrada.askOptionBC(1, 2);// For implement the Phase 3. Ask Car or Bike ?

		//////////// P H A S E 1
		// Input the car registration, trademark and colour-
		String car_registration_value = entrada.askCarRegistration("Enter your car registration (in format 9999xxx)");
		String car_trademark_value = entrada.askString("Ener the trademark: ");
		String car_color_value = entrada.askString("Enter the colour: ");

		System.out.println("The card registration is: " + car_registration_value);
		System.out.println("The trademark is: " + car_trademark_value);
		System.out.println("The color is: " + car_color_value);

		// Make a object type option 2= car, option 1 = bike
		if (option == 2) {
			car = new Car(car_registration_value, car_trademark_value, car_color_value);
			System.out.println("Car created successfully  ");
			entrada.pause();
		} else {
			bike = new Bike(car_registration_value, car_trademark_value, car_color_value);
			System.out.println("Bike created successfully  ");
			entrada.pause();
		}

		// PHASE 1 point 3
		// Ask the brand and the diameter of the back tyres.
		// Create a List of Wheel with the values introduced.

		String car_brand_back_tyres_value = entrada.askString("Enter the brand of the back tyres: ");
		Double car_diameter_back_tyres_value = entrada
				.askDoubleValidate("Enter the diameter of the back tyres (a number between 0,4 & 4):");

		// For implement the phase 2, make a new metod askDoubleValidate
		Wheel back_tyres = new Wheel(car_brand_back_tyres_value, car_diameter_back_tyres_value);
		List<Wheel> llista_back = new ArrayList<Wheel>();
		try {
			if (option == 1) {
				llista_back.add(back_tyres);
				bike.addBackWheel(llista_back);
			} else {
				llista_back.add(back_tyres);
				llista_back.add(back_tyres);
				car.addTwoWheels(llista_back);
			}

		} catch (Exception e) {

			System.out.println("An exception has occurred" + e.getMessage());
		}

		// PHASE 1 point 4
		// Ask the brand and the diameter of the back tyres.
		// Create a List of Wheel with the values introduced.

		String car_brand_front_tyres_value = entrada.askString("input the brand of the front tyres: ");
		Double car_diameter_front_tyres_value = entrada
				.askDoubleValidate("input the diameter of the back tyres (a number between 0,4 & 4):");

		Wheel front_tyres = new Wheel(car_brand_front_tyres_value, car_diameter_front_tyres_value);
		List<Wheel> llista_front = new ArrayList<Wheel>();
		try {
			if (option == 1) {
				llista_front.add(front_tyres);
				bike.addFrontWheel(llista_front);
			} else {
				llista_front.add(front_tyres);
				llista_front.add(front_tyres);
				car.addTwoWheels(llista_front);
			}

		} catch (Exception e) {

			System.out.println("An exception has occurred" + e);
		}

		car_registration.close();
		System.out.println("Execution finished");

	}
}