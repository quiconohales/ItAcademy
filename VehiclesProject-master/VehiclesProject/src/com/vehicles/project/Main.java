/**
 * 
 */
package com.vehicles.project;
import java.util.*;


/**
 * @author Francesc Nohales
 *
 */

public class Main {
	String car_registration_value;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner car_registration = new Scanner(System.in);
		System.out.print("input your car registration   ");
		while(!car_registration.hasNextLine()) car_registration.next();
		String car_registration_value = car_registration.nextLine();
		car_registration.close();
		System.out.println("la matricula es"+car_registration_value);
		
		
		Vehicle car_registration_value = new vehicle();
	}
	class input_matricula{
		
		
		
		
		
		
	}
	class input_marca{
		
	}
	class input_color{
		
	}
	
	
}
