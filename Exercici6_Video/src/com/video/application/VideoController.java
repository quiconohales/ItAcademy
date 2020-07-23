package com.video.application;
import com.video.domain.Users;
import com.video.domain.Video;

import com.video.persistence.*;

/**
 * 
 * Aquesta classe s'encarrega d'enlla�a amb la capa de model/persistencia
 * T� varis metodes per crear usuaris, videos, obtenir usuari actual
 * 
 */

public class VideoController {
	private VideoClubRepository videoRepository;
	private Users currentSelectedUser = null; 
	
	public VideoController(){
		this.videoRepository = new VideoClubRepository(); 
	}
	public void createUser(String name, String surname,String password, String dateRegister) throws Exception{
		Users user = new Users(name,surname,password,dateRegister);
		this.videoRepository.addUser(user);
		this.currentSelectedUser = user; 
	}	
	public void createvideos(Users user,String URL, String title,String[] tags) throws Exception{
		Video video = new Video(URL,title,tags);
		user.addVideo(video);
	}
	public void selectCurrentuser(Users currentSelectedUser) {
		this.currentSelectedUser = currentSelectedUser;
	}
	public Users getCurrentuser() {
		return this.currentSelectedUser;
	}
}
