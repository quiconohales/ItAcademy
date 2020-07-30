package com.rocket.domain;
import java.util.List;
import java.util.Scanner;
import com.rocket.view.*;

public class Rocket extends Thread {
	
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

	boolean sortir = false;
	String code;
	List<Propeller> propeller;
	
	public Rocket(String code, List<Propeller> propeller) {
		this.code = code;
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
	public void frenar(int propulsor, int Value) {
		try {
			
		
		int valor = propeller.get(propulsor).getPower() - Value;
		if (valor >= 0) {
			propeller.set(propulsor, new Propeller((propeller.get(propulsor).getPower() + Value),
					propeller.get(propulsor).getmaxPower()));
			System.out.println("holding back:");
		} else {
			System.out.println(
					"It is not possible to reduce the minimum value of the propeller:" + (propeller.get(propulsor).getPower() - Value));
		}
		mostrar();
		} catch (Exception e) {
			System.out.println("An exception occurred");
		}
	}

	public void acelerar(int propulsor, int Value) {
		try {
			
		
		int valor = propeller.get(propulsor).getPower() + Value;
		if (propeller.get(propulsor).getmaxPower() >= valor) {
			propeller.set(propulsor, new Propeller((propeller.get(propulsor).getPower() + Value),
					propeller.get(propulsor).getmaxPower()));
			System.out.println("speeding up");
		} else {
			System.out.println("The propeller maxim value cannot be exceeded:" + (propeller.get(propulsor).getPower() + Value));
		}
		mostrar();
		} catch (Exception e) {
			System.out.println("An exception occurred");
		}
	}

	public void mostrar() {
		try {
			System.out.flush();
			System.out.println("Rocket.............................. :" + code);
			System.out.println("Number of Propellers :" + propeller.size());
			for (int i = 0; i < propeller.size(); i++) {
				System.out.println("Propeller " + (i + 1));
				System.out.println("Power:" + propeller.get(i).getPower());
				System.out.println("Max Power:" + propeller.get(i).getmaxPower());
			}
		} catch (Exception e) {
			System.out.println("An exception occurred");
		}
	}

}
