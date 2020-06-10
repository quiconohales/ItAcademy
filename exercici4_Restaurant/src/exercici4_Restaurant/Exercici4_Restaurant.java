/**
 * 
 */
package exercici4_Restaurant;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
   
/**
 * @author  Francesc Nohales
 *
 */
public class Exercici4_Restaurant {

	public static void main(String[] args) {
		
		// FASE 1-------------------------------------------
		// Inicialitzem variables
		int b5=5;int b10=10;int b20=20;int b50=500;int b100=100;int b200=200;int b500=500;int total;
		String[] menu=new String[5];
		int[] preus=new int[5];
		
		// FASE 2-------------------------------------------
		//creem els scanner per llegir info
		Scanner scan_plat = new Scanner(System.in);
		Scanner scan_preu = new Scanner(System.in);
		Scanner scan_plat_desitjat = new Scanner(System.in);
		
		// recorrem l'array solicitan nom plat i preu. 
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
		// creem una llista on guardarem els plats escollits
		List <Integer> comanda= new ArrayList<>();
		
		
		// anirem demanan plats mentres no introdueixi 0 per sortir
		// 
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
		// Llistem la llista del plats del menu
		for (int i = 0; i < menu.length; i++) {
			System.out.println("El plat nº " + (i+1) + " es "+ menu[i]+ " i el seu preu es "+ preus[i]);
			}
		
		total=0;
		System.out.println();
		System.out.println();
		
		// recorrem tota la llsta comanda  i en el cas que el plat introduit no estigui dintre del array de menu mostrem error
		// en el cas contrari sumem el preu al total  
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
			
