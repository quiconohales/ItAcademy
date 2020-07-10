package com.vehicles.project;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.vehicles.project.InputCommons.*;



public class Main {
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner car_registration = new Scanner(System.in);
		Scanner car_double = new Scanner(System.in);
		
		InputCommons entrada = new InputCommons (car_double);
		
		///////////////////////////////////////////////////////////Se piden datos de matricula,marca y color
		String car_registration_value = entrada.askCarRegistration("input your car registration");
		System.out.println("la matricula es "+car_registration_value); 
				
		String car_trademark_value = entrada.askString("input the trademark: ");
		System.out.println("the trademark is "+car_trademark_value);
		
		String car_color_value = entrada.askString("input the colour: ");
		System.out.println("the color is "+car_color_value);
		
		/////////////////////////////////////////////////////////// Se crea un cotxe con los datos
		
		Car cotxe = new Car(car_registration_value,car_trademark_value,car_color_value);
		System.out.println("Cotxe creat satisfactoriament "+car_registration_value);
		
		//////////////////////////////////////////////////////// Se añaden 2 ruedas traseras con los valores introducidos
		
		
		String car_brand_back_tyres_value = entrada.askString("input the brand of the back tyres: ");
		Double car_diameter_back_tyres_value = entrada.askDoubleValidate("input the diameter of the back tyres: ");

		Wheel back_tyres = new Wheel(car_brand_back_tyres_value, car_diameter_back_tyres_value);
		List<Wheel> llista_back = new ArrayList<Wheel>();
		try {
			llista_back.add(back_tyres);
			llista_back.add(back_tyres);
			System.out.println("se añade las ruedas traseras a la lista"+ llista_back.size());
			cotxe.addTwoWheels(llista_back);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Ha sucedido una excepción"+ e);
		}

		//////////////////////////////////////////// Se añaden 2 ruedas delanteras con los valores introducidos
		

		String car_brand_front_tyres_value = entrada.askString("input the brand of the front tyres: ");
		Double car_diameter_front_tyres_value = entrada.askDoubleValidate("input the diameter of the front tyres: ");

		Wheel front_tyres = new Wheel(car_brand_front_tyres_value, car_diameter_front_tyres_value);
		List<Wheel> llista_front = new ArrayList<Wheel>();
		try {
			llista_front.add(front_tyres);
			llista_front.add(front_tyres);
			System.out.println("se añade las ruedas delanteras a la lista " + llista_front.size());
			cotxe.addTwoWheels(llista_front);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Ha sucedido una excepción"+ e);
		}
		/////////////////////////////////////////////////////////////////////////
			for (int i = 0; i < llista_front.size(); i++) {
				System.out.println("DELANTERAS" + llista_front.toString() +" sss" + llista_front.get(i));
			}
			for (int i = 0; i < llista_back.size(); i++) {
				System.out.println(" TRASERAS" + llista_back.toString()+ " sss" +llista_back.get(i));
			}
			System.out.println("   ruedas " + cotxe.wheels);
			System.out.println("   color " + cotxe.color);
			System.out.println("   Brand " + cotxe.brand);

			car_registration.close();


}
}