package com.video.application;

import java.util.Date;
import java.util.List;



//import com.video.domain.Floristeria;
import com.video.domain.Users;
import com.video.domain.Video;
import com.video.domain.*;
import com.video.persistence.*;



public class VideoController {
	private VideoClubRepository videoRepository;
	private Users currentSelectedUser = null; 
	
	public VideoController(){
		this.videoRepository = new VideoClubRepository(); 
	}

	public void createUser(String name, String surname,String password, String dateRegister) throws Exception{
		//Floristeria floristeria = new Floristeria(name);
		Users user = new Users(name,surname,password,dateRegister);
		this.videoRepository.addUser(user);
		this.currentSelectedUser = user; 
	}	
	public void createvideos(Users user,String URL, String title,String[] tags) throws Exception{
		Video video = new Video(URL,title,tags);
		user.addVideo(video);
		
		
		//this.videorepository.addVideo(video);
		//this.currentSelectedvideos = videos; 
	}
	
	
	
	public void selectCurrentuser(Users currentSelectedUser) {
		this.currentSelectedUser = currentSelectedUser;
	}
	
	
	public Users getCurrentuser() {
		return this.currentSelectedUser;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public void addProducteFlor(videos videos, double preu, String color) throws Exception{
		Flor flor = new Flor(preu,color);
		videos.addProducte(flor);
	}
	
	
	public void addProducteArbre(videos videos, double preu, double height) throws Exception{
		Arbre arbre = new Arbre (preu, height);
		videos.addProducte(arbre);
	}
	
	
	public void addProducteDecoracio(videos videos, double preu, Material tipusMaterial ) throws Exception{
		Decoracio decoracio = new Decoracio (preu, tipusMaterial);
		videos.addProducte(decoracio);
		
	}
	
	
	public List<videos> getAllvideoss(){
		return this.repository.getAllvideossList();
	}
	
	

	

}
