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
		this.name = name;
		if(name.contentEquals("")) throw new EmptyFieldException("The field name can't empty");
		if(surname.contentEquals("")) throw new EmptyFieldException("The field name can't empty!");
		if(password.contentEquals("")) throw new EmptyFieldException("The field name can't empty!");
		if(dateRegister.contentEquals("")) throw new EmptyFieldException("The field name can't empty!");
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
}