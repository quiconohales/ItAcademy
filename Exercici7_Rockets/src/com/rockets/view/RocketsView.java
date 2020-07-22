package com.rockets.view;
import com.rockets.domain.*;

public class RocketsView {


	
	public  showMainMenu() {
	String ok="ok";
	System.out.println("Selecciona una  opció");
	System.out.println("1- Crea un nou usuari");
	System.out.println("2- Crea un nou Video");
	System.out.println("3- Llista els Videos");
	System.out.println("4- Per finalitzar" );
	return ok;
	}


//	public void listVideo(Users user) {
//		int cont=0;
//		System.out.println("Nom del usuari: "+ user.getName());
//		System.out.println("Cognom del usuari"+ user.getSurname());
//		System.out.println("Data registre : "+ user.getDateRegister());
//		System.out.println("");
//		
//		
//		for (Video video: user.listVideo()) {
//			cont++;
//			System.out.println("El video nº :" + cont);
//			System.out.println("URL : "+ video.getURL());
//			System.out.println("Títol : "+ video.getTitle());
//			video.getTags();
//			System.out.println(" ");
//		}
//		if(cont==0) System.out.println("Encara no has creat cap video.");
//	}
//	
	public void endProgram() {
		System.out.println("Programa finalitzat");  
	}
}

