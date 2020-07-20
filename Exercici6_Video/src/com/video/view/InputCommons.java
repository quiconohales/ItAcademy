package com.video.view;


import java.text.SimpleDateFormat;
import java.util.InputMismatchException;
import java.util.List;
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
	public String[] askList (String questionMessage) {
		
		System.out.println(questionMessage);
		
		String answer = this.input.nextLine();
		
		String[] tags= answer.split(",");
		
//		for (int i = 0; i < tags.length; i++) {
//			System.out.println("los valores son " + tags[i]);
//		}
		return tags ;
	}
	public String askDate(String questionMessage) {
		
		String answer="";
		boolean correctFormat = false;
		while(correctFormat==false) {
		
        try {
        	System.out.println(questionMessage);
			answer = this.input.nextLine();
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");

            formatoFecha.setLenient(false);

            formatoFecha.parse(answer);
            correctFormat=true;
            
        } catch (Exception e) {

         System.out.println("Se ha producido una excepción");
        }
	
	}
		return answer;
	}

															/**
															 * Es demana un número de tipus enter per consola
															 * Si no té un format de tipus enter vàlid o el número no es troba dins del rang dels 
															 * parametres "minInt" i "maxInt" s'informa de l'error per pantalla i es torna a demanar
															 * un número a l'usuari
															 * Retorna el número introduït per consola
															 */
	public int askOption(int minInt, int maxInt) {
		
		return askInt("Selecciona una opció:",minInt,maxInt);
		
	}
	
															/**
															 	
															 * Previament es mostra el missatge passat per parametre "questionMessage"
															 * Si no té un format de tipus enter vàlid o el número no es troba dins del rang dels 
															 * parametres "minInt" i "maxInt" s'informa de l'error per pantalla i es torna a demanar
															 * un número a l'usuari
															 * Retorna el número introduït per consola
															 * 
															 * @param questionMessage
															 * @param minInt
															 * @param maxInt
															 * @return
															 */
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
	
															/**
															 * Es demana a l'usuari que introdueixi un número amb o sense decimals per consola
															 * Mentre el valor introduït per l'usuari no tingui un format numèric correcte es continua demanant
															 * que introduiexi el número de nou per consola
															 * 
															 * @param questionMessage : missage a mostrar per consola previament a la introducció del número
															 * @return retorna - número introduït per consola
															 */
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
	
																/**
																 *  Es fa una pausa per consola per a poder veure els últims missatges fins que l'usuari
																 *  premi la tecla ENTER per consola
																 *  
																 */
	
	public void pause() {
		System.out.println("Prem la tecla ENTER/INTRO per a tornar al menu...");
		this.input.nextLine();
	}
	
	
}
