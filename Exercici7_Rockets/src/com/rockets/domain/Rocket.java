package com.rockets.domain;
import java.util.List;
import java.util.Scanner;
import com.rockets.view.*;

public class Rocket implements Runnable {
	
	boolean sortir = false;
	private Scanner entrada;
	InputManager im = new InputManager();
	InputCommons ic= new InputCommons(entrada);
	
	public Rocket(String code, List<Propeller> propeller) {
		this.code = code;
		this.propeller = propeller;
	}
	private String code;
	private List<Propeller> propeller;
	public void run() {
		this.entrada = new Scanner(System.in);
		while (sortir== false) {
			try {
				mostrar();
				String lectura = entrada.nextLine();
				//im.showMenu();
				//int opcion=ic.askOption(1,2);
				ic.pause();
				int opcion=ic.askInt("   ",1,2);
				if (opcion==1) {
					
					//propeller1.set(2,new Propeller(99,99));
					
				} else {

				}
				System.out.println("introduce coete (1/2)");
//				
			} catch (Exception e) {

			}
		}

	}

	public void mostrar() {
		try {

			System.out.flush();
			// System.out.println("Coete :"+code+" Nº de propulsors :"+propeller.size()+"
			// Propeller " + (u + 1)+" Power:" + propeller.get(u).getPower()+" Max Power:" +
			// propeller.get(u).getmaxPower());
			System.out.println("Coete :" + code);
			System.out.println("Nº de propulsors :" + propeller.size());
			for (int i = 0; i < propeller.size(); i++) {
				System.out.println("Propeller " + (i + 1));
				System.out.println("Power:" + propeller.get(i).getPower());
				System.out.println("Max Power:" + propeller.get(i).getmaxPower());
			}
			// new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

			// }

		} catch (Exception e) {

		}
	}

	public void frenar() {

	}

	public void acelerar() {

	}

}
