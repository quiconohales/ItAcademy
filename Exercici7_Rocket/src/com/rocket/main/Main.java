package com.rocket.main;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import com.rocket.domain.*;
import com.rocket.view.*;
/** 
 *  
 * @author Francesc Nohales
 * Exercici 7 Rockets Backend - Barcelona Activa - It Academy
 * Es fan servir dos fils independents, un per cada coet.
 */
public class Main {

	public static void main(String[] args) {
		Scanner input;
		input = new Scanner(System.in);
		
		RocketsView vista = new RocketsView();
		InputCommons ic = new InputCommons(input);
		
		//Inicialitzem coets segons parametres del  enunciat
		
		//****************** coet 1 *******************
		List <Propeller> propeller1= new ArrayList<Propeller>();
		propeller1.add(new Propeller(11,15));
		propeller1.add(new Propeller(21,29));
		propeller1.add(new Propeller(31,91));
		Rocket r1 = new Rocket(" 1 ",propeller1);
		r1.start();
		r1.mostrar();
		//****************** coet 2 *******************
		List <Propeller> propeller2= new ArrayList<Propeller>();
		propeller2.add(new Propeller(10,60));
		propeller2.add(new Propeller(20,60));
		propeller2.add(new Propeller(30,90));
		Rocket r2 = new Rocket(" 2 ",propeller2);
		r2.start();
		r2.mostrar();
		//Fi inicialitzacio coets

		System.out.println(r1.getState());
		boolean sortir=false;
		while (sortir == false) {
			vista.showCoetMenu();
			int SelectCohet = ic.askOption(1,3);
			if (SelectCohet==3) {
				sortir=true;
				try {
					System.out.println("Stopping Rocket 1");
					r1.stop();// 
					System.out.println("Stopping Rocket 2");
					r2.stop();
					vista.endProgram();
				} catch (Exception e) {
					System.out.println("An exception occurred");;
				}
				break;
			}
			vista.showPropulsorMenu();
			int SelectPropulsor= ic.askInt("", 1, 9);
			vista.showOperationMenu();
			int SelectOperation = ic.askOption(1,2);
			vista.showOperationValue();
			int SelectOperationValue = ic.askOption(1,9);
			
			switch(SelectOperation) {
			 case 1 :
				 	if (SelectCohet==1) {
				 		r1.acelerar((SelectPropulsor-1),SelectOperationValue);
				 	}else {
				 		r2.acelerar((SelectPropulsor-1),SelectOperationValue);
				 	}
				 	break; 
			   
			   case 2 :
				   if (SelectCohet==1) {
				 		r1.frenar((SelectPropulsor-1),SelectOperationValue);
				 	}else {
				 		r2.frenar((SelectPropulsor-1),SelectOperationValue);
				 	}
				 	break; 
			   
			   default : 
				  
			}
				r1.mostrar();
				   r2.mostrar();
			     
		}
		input.close();
	}

}