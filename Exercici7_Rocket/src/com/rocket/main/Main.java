package com.rocket.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.rocket.domain.*;
import com.rocket.view.*;

/**
 * 
 * @author Francesc Nohales Exercici 7 Rockets Backend - Barcelona Activa - It
 *         Academy Es fan servir dos fils independents, un per cada coet. Aquest
 *         programa permet accelerar i/o frenar dos cohets, en fils independents
 *         Es controla que la velocitat no excedeixi del valors màxims ni
 *         mínims. Al sortir s'aturan els 2 fils.
 */
public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Scanner input;
		input = new Scanner(System.in);
		int selectCoet;

		RocketsView viewRockets = new RocketsView();
		InputCommons ic = new InputCommons(input);

		// Inicialitzem coets segons parametres del enunciat
		// FASE I y FASE II es consideran implementadas al mostrar els cohets i els
		// propulsors

		// ****************** coet 1 *******************
		List<Propeller> propeller1 = new ArrayList<Propeller>();
		propeller1.add(new Propeller(10, 20));
		propeller1.add(new Propeller(30, 60));
		propeller1.add(new Propeller(80, 160));
		Rocket r1 = new Rocket(" 1 ", propeller1);
		r1.start();
		r1.viewRockets();
		// ****************** coet 2 *******************
		List<Propeller> propeller2 = new ArrayList<Propeller>();
		propeller2.add(new Propeller(30, 60));
		propeller2.add(new Propeller(40, 80));
		propeller2.add(new Propeller(50, 100));
		propeller2.add(new Propeller(50, 100));
		propeller2.add(new Propeller(30, 60));
		propeller2.add(new Propeller(10, 20));
		Rocket r2 = new Rocket(" 2 ", propeller2);
		r2.start();
		r2.viewRockets();
		// Fi inicialitzacio coets

		/**
		 * Mostrem els valors actuals dels coets, es demana el coet que es vol
		 * modificar, el propulsor, l'acció a realitza  i per últim el valor.
		 **/
		boolean sortir = false;
		while (sortir == false) {
			viewRockets.showCoetMenu();
			selectCoet = ic.askOption(1, 3);
			if (selectCoet == 3) {
				sortir = true;
				try {
					System.out.println("Stopping Rocket 1");
					r1.stop();//
					System.out.println("Stopping Rocket 2");
					r2.stop();
					viewRockets.endProgram();
				} catch (Exception e) {
					System.out.println("An exception occurred");
					;
				}
				break;
			}
			viewRockets.showPropellerMenu();
			int SelectPropulsor = ic.askInt("", 1, 9);
			viewRockets.showOperationMenu();
			int SelectOperation = ic.askOption(1, 2);
			viewRockets.showOperationValue();
			int SelectOperationValue = ic.askOption(1, 9);
			// Es demanan les opcions, per cada coet es comproba que el
			// coet tingui el nº de propulsor introduit, en cas afirmatiu es realitza 
			// crida el metode speedUp o speedDown
			switch (selectCoet) {
			case 1:
				if (r1.getPropeller().size() > SelectPropulsor - 1) {

					switch (SelectOperation) {
					case 1:
						r1.speedUp((SelectPropulsor - 1), SelectOperationValue);
						break;
					case 2:
						r1.speedDown((SelectPropulsor - 1), SelectOperationValue);
						break;
					}
				} else {
					System.out.println("the rocket doesn't have this propeler");
				}
				break;
			case 2:
				if (r2.getPropeller().size() > SelectPropulsor - 1) {
					switch (SelectOperation) {
					case 1:
						r2.speedUp((SelectPropulsor - 1), SelectOperationValue);
						break;
					case 2:
						r2.speedDown((SelectPropulsor - 1), SelectOperationValue);
						break;
					}
				} else {
					System.out.println("the rocket doesn't have this propeler");
				}
				break;

			}
			r1.viewRockets();
			r2.viewRockets();
		}
		input.close();
	}
}