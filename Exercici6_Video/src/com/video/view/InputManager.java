package com.video.view;

import java.util.Scanner;

import com.video.application.VideoController;
import com.video.domain.Users;
/**
 * 
 * Aquesta classe s'encarrega d'interactuar amb l'usuari.
 * Tè varis metodes per crear usuaris, videos, llista videos,
 * mostrar el menu 
 *
 */


public class InputManager {

	private Scanner scanner;
	private InputCommons commons;
	private VideoController controller;
	private VideosView view;
	
	public InputManager() {
		this.scanner = new Scanner(System.in);
		this.commons = new InputCommons(this.scanner); 
		this.controller = new VideoController(); 
		this.view = new VideosView(); 
	}
	
	public void close() {
		this.scanner.close();
	}
	

	public void showMenu() {
				
		boolean exit = false;
		while (exit==false) {
			view.showMainMenu();
			int option = commons.askOption(1,4);
			switch(option) {
			  case 1:
				  this.createUser();
				  break;
			  case 2:
				  this.createvideos();
				  break;
			  case 3:
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
				view.endProgram();
			}
		}

	}


	public void createvideos() {
		boolean correctFormat = false;
		while(correctFormat==false) {
			try {
				String URL = commons.askString("Quin es el nom de la URL del video que vols crear?:");
				String title = commons.askString("Quin es el titol del video que vols crear?:");
				String[]tags = commons.askList("Quin es la llista de tags que vols crear?:");
				Users user = controller.getCurrentuser();
				if (user==null) {
					System.out.println(" Encara no has creat cap usuari");
					return;
				}
				System.out.println("video creat correctamente");
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
				correctFormat=true;
				this.controller.createUser(name, surname,password, dateRegister);
			}catch(Exception e) {
				System.out.println(e.getMessage());
				System.out.println("Torna a introduir les dades del usuari de nou.");
			}
		}
	}
	
	public void showvideo() {
		if(controller.getCurrentuser()==null) {
			System.out.println("Encara no has creat cap usuari ");
		}else {
			Users currentUser = controller.getCurrentuser();
			this.view.listVideo(currentUser);
		}
	}
}
