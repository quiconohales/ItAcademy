package com.rocket.domain;

import java.util.List;

//import java.util.Scanner;
//import com.rocket.view.*;

/**
 * 
 * @author Francesc Nohales 
 * Aquesta clase defineix els coets
 * Disposa dels metodes per accelerar, frenar, mostrar i run, que sobrescribim
 *
 */

public class Rocket extends Thread {
	boolean sortir = false;
	String code;
	List<Propeller> propeller;

	/*
	 * Constructor per als coets
	 * @param code codic del coet
	 * @param propeler Llista de objectes Propeller
	 */

	public Rocket(String code, List<Propeller> propeller) {
		this.code = code;
		this.propeller = propeller;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public List<Propeller> getPropeller() {
		return propeller;
	}

	public void setPropeller(List<Propeller> propeller) {
		this.propeller = propeller;
	}

	@Override
	public void run() {
		System.out.println("Running");
		try {
			while (sortir == false) {
			}
		} catch (Exception e) {
			System.out.println("An exception occurred");
		}
	}

	public void speedDown(int propulsor, int Value) {
		try {

			int valor = propeller.get(propulsor).getPower() - Value;
			if (valor >= 0) {
				propeller.set(propulsor, new Propeller((propeller.get(propulsor).getPower() - Value),
						propeller.get(propulsor).getmaxPower()));
				System.out.println("holding back:");
			} else {
				System.out.println(	" ¡¡¡¡¡  A t t e n t i o n  ¡¡¡¡¡");
				System.out.println("It´s not possible to reduce the minimum value of the propeller:"
						+ (propeller.get(propulsor).getPower() - Value));
			}

		} catch (Exception e) {
			System.out.println("An exception occurred");
		}
	}

	public void speedUp(int propulsor, int Value) {
		try {

			int valor = propeller.get(propulsor).getPower() + Value;
			if (propeller.get(propulsor).getmaxPower() >= valor) {
				propeller.set(propulsor, new Propeller((propeller.get(propulsor).getPower() + Value),
						propeller.get(propulsor).getmaxPower()));
				System.out.println("speeding up");
			} else {
				System.out.println(	" ¡¡¡¡¡  A t t e n t i o n  ¡¡¡¡¡");
				System.out.println(
						"The propeller maxim value cannot be exceeded:" + (propeller.get(propulsor).getmaxPower()));
			}

		} catch (Exception e) {
			System.out.println("An exception occurred");
		}
	}

	public void viewRockets() {
		try {
			System.out.flush();
			System.out.println("Rocket.............................. :" + code);
			System.out.println("Number of Propellers:" + propeller.size());
			for (int i = 0; i < propeller.size(); i++) {
				System.out.println("Propeller:" + (i + 1) + " " + " Power:" + propeller.get(i).getPower() + " "
						+ " Max Power:" + propeller.get(i).getmaxPower());
			}
			System.out.println(	"__________________________________________");
		} catch (Exception e) {
			System.out.println("An exception occurredccccccccccc");
		}
	}

}
