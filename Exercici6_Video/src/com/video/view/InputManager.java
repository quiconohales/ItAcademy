package com.video.view;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.video.application.VideoController;
import com.video.domain.Users;
import com.video.domain.Video;
import com.video.view.*;


public class InputManager {

	private Scanner scanner;
	private InputCommons commons;
	private VideoController controller;
	private VideosView view;
	
	public InputManager() {
		this.scanner = new Scanner(System.in);
		this.commons = new InputCommons(this.scanner); //encapsula operacions bàsiques de entrada de dades per consola
		this.controller = new VideoController(); //encapsula operacions sobre objectes del domini
		this.view = new VideosView(); //encapsula les vistes a mostrar per consola
	}
	
	public void close() {
		this.scanner.close();
	}
	

	public void showMenu() {
				
		boolean exit = false;
		while (exit==false) {
			
			String outputMenu = this.view.showMainMenu();
			
	//		VideosController currentvideos = controller.getCurrentvideos();
//			String outputvideosName = this.view.listVideo(currentvideos);
			
			System.out.println(outputMenu);
	//		System.out.println(outputvideosName);
			
			int option = commons.askOption(1,4);
			
			switch(option) {
			  case 1:
				 // this.createvideos();
				  this.createUser();
				  
				  break;
			  case 2:
				  this.createvideos();
				  //this.selectCurrentvideos();
				  break;
			  case 3:
				  //this.addProducte_exceptionControl();
				  this.showvideo();
				   break;
			  case 4:
				  exit = true;
				  break;
			  default:
			    break;
			}
			
			if(exit==false) { 
				commons.pause();
			}else {
				System.out.println(view.endProgram());
			}
		}

	}


	public void createvideos() {
		//System.out.println("1 createvideos");
		boolean correctFormat = false;
		
		while(correctFormat==false) {
			try {
				String URL = commons.askString("Quin es el nom de la URL del video que vols crear?:");
				String title = commons.askString("Quin es el titol del video que vols crear?:");
				String[]tags = commons.askList("Quin es la llista de tags que vols crear?:");
				Users user = controller.getCurrentuser();
				if (user==null) {
					System.out.println(" Todavia no has creado un usuario");
					return;
				}
				System.out.println("videos creada correctamente");
				correctFormat=true;
				this.controller.createvideos(user,URL,title,tags);				
			}catch(Exception e) {
				System.out.println(e.getMessage());
				System.out.println("Torna a introduir les dades del video de nou.");
			}
		}
	}
	public void createUser() {
		boolean correctFormat = false;
		while(correctFormat==false) {
			try {
				String name = commons.askString("Quin es el nom del usuari que vols crear?:");
				String surname = commons.askString("Quin es el cognom del usuari que vols crear?:");
				String password = commons.askString("Quin es el password del usuari que vols crear?:");
				String dateRegister = commons.askDate("Quin es el data de registre del usuari que vols crear?:");

				//System.out.println("videos creada correctament.");
				//System.out.println("Selecciona des del menu aquesta videos com actual per a afegir stock.");
				correctFormat=true;
				this.controller.createUser(name, surname,password, dateRegister);
			}catch(Exception e) {
				System.out.println(e.getMessage());
				System.out.println("Torna a introduir les dades del usuari de nou.");
			}
		}
	}
	
	public void showvideo() {
		
		//this.view.listVideo();
		

		if(controller.getCurrentuser()==null) {
			System.out.println("Encara no has seleccionat una floristeria actual.");
		}else {
			Users currentUser = controller.getCurrentuser();
			String outputStock = this.view.listVideo(currentUser);
			System.out.println(outputStock);
		}
		//System.out.println("2 selectCurrentvideos");
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
	}

//	public void showvideos() {
//		
//		if(controller.getCurrentvideos()==null) {
//			System.out.println("Encara no has seleccionat una videos actual.");
//		}else {
//			videos currentvideos = controller.getCurrentvideos();
//			String outputStock = this.view.showvideosDetails(currentvideos);
//			System.out.println(outputStock);
//		}
//		
//	}
public void addProducte_exceptionControl() {
		
		boolean correctFormat = false;
		
		while (correctFormat==false) {
			
			try {
				
				addProducte();
				correctFormat = true;
				
			}catch(Exception e) {
				
				System.out.println(e.getMessage());
				System.out.println("Torna a introduir les dades del producte de nou.");
				
			}
		}		
	}
	
	
	public void addProducte() throws Exception{
		//System.out.println("3 addProducte");
		
		videos videosActual = controller.getCurrentvideos();
		
		if (videosActual==null) {
			System.out.println("Encara no has seleccionat cap videos actual");
			return;
		}
		
		double price = commons.askDouble("Introdueix el preu del nou producte:");
		
		int option = commons.askInt("Quin tipus de producte vols afegir? "+
				"(1:Arbre / 2:Flor / 3:Decoracio):",1,3);
		
		if (option==1) {
			
			System.out.println("Has seleccionat ARBRE.");
			double height = commons.askDouble("Introdueix l'alçada de l'arbre:");
			this.controller.addProducteArbre(videosActual, price, height);
			
		}else if (option==2) {
			
			System.out.println("Has seleccionat FLOR.");
			String color = commons.askString("Introdueix el color de la flor:");
			this.controller.addProducteFlor(videosActual, price, color);
			
		}else if (option==3) {
			
			System.out.println("Has seleccionat DECORACIO.");
			int tipusMaterial = commons.askInt("De quin tipus de material vols la decoració ?:"+
					"(1:Fusta / 2:Plastic):",1,2);
			if (tipusMaterial==1) {
				this.controller.addProducteDecoracio(videosActual, price, new Fusta());
			}else {
				this.controller.addProducteDecoracio(videosActual, price, new Plastic());
			}
		}
		
		int repeat = commons.askInt("Vols afegir un altre producte? ( 1:Si / 0:No )",0, 1);
		if (repeat==1) this.addProducte();
		
	}
	
	
}
