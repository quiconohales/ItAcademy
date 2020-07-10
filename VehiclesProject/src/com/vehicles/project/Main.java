package com.vehicles.project;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import views.*;
import views.InputCommons.*;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner car_registration = new Scanner(System.in);
		Scanner car_double = new Scanner(System.in);
		
		System.out.println ("input your car registration   ");
		while(!car_registration.hasNextLine()) car_registration.next();
		String car_registration_value = car_registration.nextLine();
		System.out.println("la matricula es"+car_registration_value); 
		
		
		System.out.println ("input the trademark: ");
		while(!car_registration.hasNextLine()) car_registration.next();
		String car_trademark_value = car_registration.nextLine();
		System.out.println("the trademark is "+car_registration_value);
		
		
		System.out.println ("input the colour: ");
		while(!car_registration.hasNextLine()) car_registration.next();
		String car_color_value = car_registration.nextLine();
		System.out.println("the color is "+car_registration_value);
		
		try {
			Car cotxe = new Car(car_registration_value,car_trademark_value,car_color_value);
			System.out.println("Cotxe creat satisfactoriament "+car_registration_value);
			
			System.out.print ("input the brand of the front tyres: ");
			while(!car_registration.hasNextLine()) car_registration.next();
			String car_brand_front_tyres_value = car_registration.nextLine();
			
			System.out.print ("input the diameter of the front tyres: ");
			while(!car_double.hasNextDouble()) car_double.next();
			
		//	Double car_diameter_front_tyres_value = car_double.nextDouble();
			Double car_diameter_front_tyres_value =  views.InputCommons.askDouble ("Introduce un doble");

		
			
			
			
			Wheel front_tyres = new Wheel(car_brand_front_tyres_value,car_diameter_front_tyres_value);
			List <Wheel> llista_front =new ArrayList< Wheel>();
			try {
				llista_front.add(front_tyres);
				System.out.print ("añadido ");
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
			
			
			////////////////////////////////////////////
			System.out.print ("input the brand of the back tyres: ");
			while(!car_registration.hasNextLine()) car_registration.next();
			String car_brand_back_tyres_value = car_registration.nextLine();
			
			System.out.print ("input the diameter of the back tyres: ");
			while(!car_double.hasNextDouble()) car_double.next();
			Double car_diameter_back_tyres_value = car_double.nextDouble();
			
			
			Wheel back_tyres = new Wheel(car_brand_back_tyres_value,car_diameter_back_tyres_value);			
			List <Wheel> llista_back =new ArrayList< Wheel>();
			try {
				llista_front.add(back_tyres);
				System.out.print ("añadido ");
			} catch (Exception e) {
				// TODO: handle exception
			}

			
			for (int i = 0; i < llista_front.size(); i++) {
			      System.out.println(llista_front.get(i));
			    }
			for (int i = 0; i < llista_back.size(); i++) {
			      System.out.println(llista_back.toString());
			    }
			
			
			try {
				
				cotxe.addWheels(llista_front, llista_back);
				
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.print ("ha pasaso algo ");
			}			
			
			
			System.out.println("   coche "+cotxe.wheels);
			System.out.println("   color "+cotxe.color);
			System.out.println("   Brand "+cotxe.brand);
			
			
			car_registration.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
		
		
		
		
		

}
}