package com.rocket.view;
import java.util.List;
import java.util.Scanner;

import com.rocket.view.*;
import com.rocket.domain.*;
import com.rocket.main.*;
public class InputManager {

	private Scanner scanner;
	private InputCommons commons;
	//private VideosController controller;
	private RocketsView view;
	
	public InputManager() {
		this.scanner = new Scanner(System.in);
		this.commons = new InputCommons(this.scanner); 
		
		this.view = new RocketsView(); 
	}
	
	public void close() {
		this.scanner.close();
	}
	
	public void showMenu() {
		
		
		boolean exit = false;
		
		while (exit==false) {
			

			
			int option = commons.askOption(1, 5);
			
			switch(option) {
			  case 1:
				 // propeller1.set(2,new Propeller(99,99));
				  //this.createvideos();
				  break;
			  case 2:
				  //this.selectCurrentvideos();
				  break;
			  case 3:
				  //this.addProducte_exceptionControl();
				  break;
			  case 4:
				  //this.showCurrentStockvideos();
				  break;
			  case 5:
				  exit = true;
				  break;
			  default:
			    break;
			}
			
			if(exit==false) { 
				commons.pause();
			}else {
				//System.out.println(view.endProgram());
			}
		}

	
	}
}


