package com.rockets.domain;

import java.io.Console;
import java.util.List;
import com.rockets.main.*;

public class Rocket implements Runnable {
	
	public Rocket (String code, List <Propeller> propeller) {
		this.code=code;
		this.propeller=propeller;
	}
	private String code;
	private List<Propeller> propeller;
	public void run() {
		
		
		
		while (true) {
			 
		     
			 try {
				 int u=0;
		            
		            //for (int i = 0; i < propeller.size(); i++) {
				 		//System.out.print('\u000C');
				 		System.out.flush();
				 		System.out.println("Coete :"+code);
		            	System.out.println("Nº de propulsors :"+propeller.size());
						System.out.println("Propeller " + (u + 1));
						System.out.println("Power:" + propeller.get(u).getPower());
						System.out.println("Max Power:" + propeller.get(u).getmaxPower());
						
					//	new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
						
					//}

		        } catch (Exception e) {

		            /*No hacer nada*/

		        }
					
			
		}	
		
		 
	}
	public void frenar(){
		
	}
	public void acelerar(){
		
	}


}

