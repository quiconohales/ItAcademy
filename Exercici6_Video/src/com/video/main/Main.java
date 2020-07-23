package com.video.main;

import com.video.view.InputManager;
/** 
 *  
 * @author Francesc Nohales
 * Exercici 6 Video Backend - Barcelona Activa - It Academy
 * Es crean varis paquets per implementar model MVC
 */
public class Main {

	public static void main(String[] args) {
		InputManager ui = new InputManager();
		ui.showMenu();
		ui.close();
	}

}
