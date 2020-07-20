package com.video.view;
import com.video.domain.*;

public class VideosView {
	
	public String showMainMenu() {
	String output="";
		
	System.out.println("Select option");
	System.out.println("1- Create a new User");
	System.out.println("2- Create a new Video");
	System.out.println("3- List your Videos");
	System.out.println("0- to Exit" );
	return output;
	}

	public void createUser() {
	}
	public void createVideo() {
	}
	public String listVideo(Users user) {
		String output="";
		int cont=0;
		System.out.println(" User Name: "+ user.getName());
		System.out.println(" User Surname: "+ user.getSurname());
		System.out.println(" List videos : "+ user.getVideoList());
		
		for (Video video: user.listVideo()) {
			cont++;
			System.out.println(" El video nº :" + cont);
			System.out.println(" URL : "+ video.getURL());
			System.out.println(" Title : "+ video.getTitle());
			System.out.println(" Tags : "+ video.getTags());
		}
		
		if(cont==0) output +="Todavia no has creado ningun video.";
		return output;
	}
	public String endProgram() {
		String output = "";
		output += "------------------------------------- \n";
		output += "      	   FIN DEL PROGRAMA           \n";
		output += "------------------------------------- \n";
		return output;
		
	}
}
