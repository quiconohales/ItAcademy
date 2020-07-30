package com.rocket.view;


import java.util.InputMismatchException;
import java.util.Scanner;

public class InputCommons {

	private Scanner input;
	
	public InputCommons(Scanner input){
		this.input = input;
	}
	
	
	public String askString(String questionMessage) {
		
		System.out.println(questionMessage);
		String answer = this.input.nextLine();
		
		return answer;
	}
	
	public int askOption(int minInt, int maxInt) {
		
		return askInt("",minInt,maxInt);
		
	}
	public int askInt(String questionMessage,int minInt, int maxInt) {
		
		int option= 0;
		boolean numberFormat = false;
		
		System.out.println(questionMessage);
		
		while(numberFormat==false) {
			try {
				
				option = this.input.nextInt();
				if(option>=minInt && option<=maxInt) {
					numberFormat=true;
				}else {
					System.out.println("Tria una opció introduint un número entre "+minInt+ " i "+maxInt);
				}
				
			}catch(InputMismatchException e) {
				
				System.out.println("Tria una opció introduint un número entre "+minInt+ " i "+maxInt);
				
			}
			this.input.nextLine();
		}
		
		return option;
	}
	
	public double askDouble(String questionMessage) {
		
		double number = 0;
		boolean numberFormat = false;
		
		System.out.println(questionMessage);
		
		while(numberFormat==false) {
			try {
				
				number = this.input.nextDouble();
				numberFormat=true;
				
			}catch(InputMismatchException e) {
				
				System.out.println("El valor introduït no és un número vàlid.");
				
			}
			this.input.nextLine();
		}
		
		return number;
	}	
	
	
	public void pause() {
		System.out.println("Prem la tecla ENTER/INTRO per a tornar al menu...");
		this.input.nextLine();
	}
	
	
}
