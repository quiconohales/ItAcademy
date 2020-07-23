package com.rockets.main;

import com.rockets.view.InputManager;

import java.util.ArrayList;
import java.util.List;

import com.rockets.domain.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InputManager ui = new InputManager();
		//ui.showMenu();
		//Rocket cohete1= new Rocket("coete1",3);
		//cohete1.run();
		//


       

		
		
		//****************** coet 1 *******************
		List <Propeller> propeller1= new ArrayList<Propeller>();
		propeller1.add(new Propeller(11,61));
		propeller1.add(new Propeller(21,61));
		propeller1.add(new Propeller(31,91));
		Runnable r1=new Rocket(" 1 ",propeller1);
		Thread t1=new Thread(r1);
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//****************** coet 2 *******************
		List <Propeller> propeller2= new ArrayList<Propeller>();
		propeller2.add(new Propeller(10,60));
		propeller2.add(new Propeller(20,60));
		propeller2.add(new Propeller(30,90));
		Runnable r2=new Rocket(" 2 ",propeller2);
		Thread t2=new Thread(r2);
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//System.out.println("eeeeeeeeeeee "+propeller1.get(0).getPoder());
		
		
		
		
		
		
		
		
		
		
		
		ui.close();
		
	}

}
