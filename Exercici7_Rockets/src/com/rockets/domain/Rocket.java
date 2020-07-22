package com.rockets.domain;

import java.util.List;

public class Rocket implements Runnable {
	
	public Rocket (String code, List <Propeller> propeller) {
		this.code=code;
		this.propeller=propeller;
	}
	private String code;
	private List<Propeller> propeller;
	public void run() {
		System.out.println("");
		System.out.println("Coete :"+code+" nº de propulsors :"+propeller.size());
		
		
		
		for (int i = 0; i<propeller.size() ; i++) {
			System.out.println("Propeller "+(i+1));
			System.out.println("Power:"+propeller.get(i).getPower());
			System.out.println("Max Power:"+propeller.get(i).getmaxPower());
				//System.out.println("propulsor :"+propeller.size());
				//get(0)+" "+propeller.get(1)+" "+propeller.get(2));
				//System.out.print(" HILO "+ code..);
			}
			
		
		 
	}
	public void frenar(){
		
	}
	public void acelerar(){
		
	}


}

