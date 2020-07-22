package com.rockets.view;
import java.util.List;
import java.util.Scanner;



import com.rockets.domain.*;


import com.rockets.view.*;


public class InputManager {

	private Scanner scanner;
	private InputCommons commons;
	//private VideosController controller;
	private RocketsView view;
	
	public InputManager() {
		this.scanner = new Scanner(System.in);
		this.commons = new InputCommons(this.scanner); //encapsula operacions bàsiques de entrada de dades per consola
		//this.controller = new VideosController(); //encapsula operacions sobre objectes del domini
		this.view = new RocketsView(); //encapsula les vistes a mostrar per consola
	}
	
	public void close() {
		this.scanner.close();
	}
	
	public void showMenu() {
		
		
		boolean exit = false;
		
		while (exit==false) {
			
		//String outputMenu = this.view.showMainMenu();
			
		//	VideosController currentvideos = controller.getCurrentvideos();
			//String outputvideosName = this.view.listVideo(currentvideos);
			//
	//		System.out.println(outputMenu);
	//		System.out.println(outputvideosName);
			
			int option = commons.askOption(1, 5);
			
			switch(option) {
			  case 1:
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
//
//	/**
//	 * OPCIO 1
//	 * ------- 
//	 * Es crea una nova videos a partir de les dades introduïdes per l'usuari
//	 * Si l'usuari introdueix algun camp buit es mostra error per pantalla i es torna a demanar a l'usuari
//	 * que introdueixi les dades de nou
//	 * La nova videos creada es selecciona per defecte com a videos actual
//	 * 
//	 */
//	public void createvideos() {
//		//System.out.println("1 createvideos");
//		boolean correctFormat = false;
//		
//		while(correctFormat==false) {
//			try {
//				String name = commons.askString("Quin es el nom de la nova videos que vols crear?:");
//				this.controller.createvideos(name);
//
//				System.out.println("videos creada correctament.");
//				System.out.println("Selecciona des del menu aquesta videos com actual per a afegir stock.");
//				correctFormat=true;
//				
//			}catch(Exception e) {
//				System.out.println(e.getMessage());
//				System.out.println("Torna a introduir les dades de la videos de nou.");
//			}
//		}
//	}
//	
//	/**
//	 * OPCIO 2
//	 * -------
//	 * 
//	 * Es mostra un menu amb el llistat de totes les floristeries creades
//	 * Es demana a l'usuari que en seleccioni una per a seleccionarla com a videos actual
//	 * Si la llista està buida s'informar de que no s'ha creat encara cap videos
//	 * 
//	 */
//	public void selectCurrentvideos() {
//		
//		//System.out.println("2 selectCurrentvideos");
//		
//		List<videos> list = this.controller.getAllvideoss();
//		int size = list.size();
//		
//		if (size>0) { //Si ja s'ha creat alguna videos
//			
//			String outputMenu2 = view.showMenuvideosNames(list);
//			System.out.println(outputMenu2);
//			
//			int option = commons.askInt("Selecciona una videos actual:",1, size);
//			
//			videos newCurrentvideos = list.get(option-1);
//			controller.selectCurrentvideos(newCurrentvideos);
//			
//		}else { //No hi ha cap videos creada
//			System.out.println("Encara no has creat cap videos.");
//		}
//	}
//	
//	/**
//	 * OPCIO 3
//	 * -------
//	 * Es demana introduir les dades d'un nou producte per a crear-lo i afegir-lo a l'stock de la
//	 * videos actual. 
//	 * Si es produeix algun error en la introducció de dades (camp buit o numero negatiu) es torna a
//	 * demanar les dades per consola de nou.
//	 * 
//	 */
//	public void addProducte_exceptionControl() {
//		
//		boolean correctFormat = false;
//		
//		while (correctFormat==false) {
//			
//			try {
//				
//				addProducte();
//				correctFormat = true;
//				
//			}catch(Exception e) {
//				
//				System.out.println(e.getMessage());
//				System.out.println("Torna a introduir les dades del producte de nou.");
//				
//			}
//		}		
//	}
//	
//	/**
//	 * OPCIO 3
//	 * -------
//	 * Es demana a l'usuari les dades corresponents per a crear un nou producte i afegir-lo a l'stock de
//	 * la videos actual.
//	 * Si encara no s'ha seleccionat cap videos actual es mostra missatge informatiu per pantalla.
//	 * 
//	 * 1. es demana el preu del nou producte
//	 * 2. es demana que indiqui el tipus de producte (arbre, flor o decoracio)
//	 * 2.1. si selecciona arbre, se li demana a l'usuari que introdueixi l'alçada
//	 * 2.2. si selecciona flor, se li demana a l'usuari que introdueixi el color
//	 * 2.3. si selecciona decoracio, se li demana a l'usuari que seleccioni el material
//	 * 
//	 * Finalment es pregunta a l'usuari si vol afegir més productes, i en cas afirmatiu es tornar a iniciar el mètode
//	 * 
//	 * @throws Exception
//	 */
//	public void addProducte() throws Exception{
//		//System.out.println("3 addProducte");
//		
//		videos videosActual = controller.getCurrentvideos();
//		
//		if (videosActual==null) {
//			System.out.println("Encara no has seleccionat cap videos actual");
//			return;
//		}
//		
//		double price = commons.askDouble("Introdueix el preu del nou producte:");
//		
//		int option = commons.askInt("Quin tipus de producte vols afegir? "+
//				"(1:Arbre / 2:Flor / 3:Decoracio):",1,3);
//		
//		if (option==1) {
//			
//			System.out.println("Has seleccionat ARBRE.");
//			double height = commons.askDouble("Introdueix l'alçada de l'arbre:");
//			this.controller.addProducteArbre(videosActual, price, height);
//			
//		}else if (option==2) {
//			
//			System.out.println("Has seleccionat FLOR.");
//			String color = commons.askString("Introdueix el color de la flor:");
//			this.controller.addProducteFlor(videosActual, price, color);
//			
//		}else if (option==3) {
//			
//			System.out.println("Has seleccionat DECORACIO.");
//			int tipusMaterial = commons.askInt("De quin tipus de material vols la decoració ?:"+
//					"(1:Fusta / 2:Plastic):",1,2);
//			if (tipusMaterial==1) {
//				this.controller.addProducteDecoracio(videosActual, price, new Fusta());
//			}else {
//				this.controller.addProducteDecoracio(videosActual, price, new Plastic());
//			}
//		}
//		
//		int repeat = commons.askInt("Vols afegir un altre producte? ( 1:Si / 0:No )",0, 1);
//		if (repeat==1) this.addProducte();
//		
//	}
//	
//	/**
//	 * OPCIO 4
//	 * -------
//	 * 
//	 * S'obté de la vista un String amb format que conté tot el llistat de productes de l'stock de la
//	 * videos i es mostra per pantalla.
//	 * Si encara no s'havia seleccionat cap videos actual, s'informa per pantalla.
//	 * 
//	 */
//	public void showCurrentStockvideos() {
//		
//		if(controller.getCurrentvideos()==null) {
//			System.out.println("Encara no has seleccionat una videos actual.");
//		}else {
//			videos currentvideos = controller.getCurrentvideos();
//			String outputStock = this.view.showvideosDetails(currentvideos);
//			System.out.println(outputStock);
//		}
//		
	}
//	
	

