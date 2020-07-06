package exercici4_Restaurant;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fases {

		int b5=5;int b10=10;int b20=20;int b50=500;int b100=100;int b200=200;int b500=500;
	int total;
	String[] menu=new String[5];
	int[] preus=new int[5];
	List <Integer> comanda= new ArrayList<>();
	
	//we create scanners to read info
	Scanner scan_plat = new Scanner(System.in);
	Scanner scan_preu = new Scanner(System.in);
	Scanner scan_plat_desitjat = new Scanner(System.in);
	
public void Fase1() {
	// FASE 1-------------------------------------------
	// We initialize variables at the class level to make them accessible from the whole class
	
		}
public void Fase2() {
	
	// FASE 2-------------------------------------------
	// we go through the array request plate name and price.
	for (int i = 0; i < menu.length; i++) {
		
		System.out.print("Introdueix el nom del plat nº " + (i+1) + ": ");
		while(!scan_plat.hasNextLine()) scan_plat.next();
		String plat = scan_plat.nextLine();
		menu[i]=plat;
				
		
		System.out.print("Introdueix el preu del plat nº " + (i+1) + ": ");
		while(!scan_preu.hasNextInt()) scan_preu.next();
		int preu_plat = scan_preu.nextInt();
		preus[i]=preu_plat;
		 
	}
	System.out.println("");
	
	//we create a list where we will save the chosen dishes
	// we will ask for dishes as long as you do not enter 0 to exit
	
	int plats_desitjat=99;
	while(plats_desitjat !=0) {
		for (int i = 0; i < menu.length; i++) {
			System.out.println("El plat nº " + (i+1) + " es "+ menu[i]+ " i el seu preu es "+ preus[i]);
			}
		System.out.println();
		System.out.println("Introdueix el nº del plat desitjat o pulse-ho 0 per sortir :");
		plats_desitjat =scan_plat_desitjat.nextInt();
		if (plats_desitjat != 0) {
			comanda.add(plats_desitjat-1);
			}
		}
	// We list the list of dishes on the menu
	for (int i = 0; i < menu.length; i++) {
		System.out.println("El plat nº " + (i+1) + " es "+ menu[i]+ " i el seu preu es "+ preus[i]);
		}
	
	total=0;
	System.out.println();
	System.out.println();
	
	}
public void Fase3() {
	//we go through the whole command list and in case the introduced dish is not inside the menu array we show error 
	// otherwise we add the price to the total
	for (int i = 0; i < comanda.size();i++) {
		
			if (comanda.get(i) > menu.length) {
				System.out.println("Error el producte "+ (comanda.get(i)+1) + " no existeix");
				
			}else {
					total=total+preus[comanda.get(i)];
			} 
		}
	// close the scanners and print the total to pay
	scan_plat_desitjat.close();
	scan_plat.close();
	scan_preu.close();
	System.out.println(" El Total a pagar és :"+ total);
	}
		
}
