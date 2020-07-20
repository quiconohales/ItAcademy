package com.video.domain;

import com.video.exceptions.EmptyFieldException;
import java.util.ArrayList;
import java.util.List;

public class Users {

	protected String name; 
	protected String surname;
	protected String password;
	protected String dateRegister;
	protected List<Video> videoList;

	public Users(String name, String surname,String password, String dateRegister) throws Exception{
		
		if(name.contentEquals("")) throw new EmptyFieldException("The field name can't empty");
		if(surname.contentEquals("")) throw new EmptyFieldException("The field name can't empty!");
		if(password.contentEquals("")) throw new EmptyFieldException("The field name can't empty!");
		if(dateRegister.contentEquals("")) throw new EmptyFieldException("The field name can't empty!");
		this.name = name;
		this.surname = surname;
		this.password = password;
		this.dateRegister=dateRegister;
		this.videoList = new ArrayList<Video>() ;
	}
	public void addVideo (Video video) {
		this.videoList.add(video);
	
}
	public List <Video> listVideo(){
		return this.videoList;
	}
	public String getName() {
		return this.name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDateRegister() {
		return dateRegister;
	}
	public void setDateRegister(String dateRegister) {
		this.dateRegister = dateRegister;
	}
	public List<Video> getVideoList() {
		return videoList;
	}
	public void setVideoList(List<Video> videoList) {
		this.videoList = videoList;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}