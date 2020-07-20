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
	
	public void listVideo() {
		
		for (int i = 0; i < Users.videoList.length; i++) {
			
		}
		users.listVideo()
		
		
	}
	public String endProgram() {
		String output = "";
		output += "------------------------------------- \n";
		output += "      	   EFI DEL PROGRAMA           \n";
		output += "------------------------------------- \n";
		return output;
		
	}
}
