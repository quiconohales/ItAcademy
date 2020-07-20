package com.video.domain;
import com.video.exceptions.EmptyFieldException;

public class Video{
	protected String URL;
	protected String title;
	protected String[] tags;
	
	
	public Video (String URL, String title,String[] tags ) throws Exception{
//		this.name = name;
		if(URL.contentEquals("")) throw new EmptyFieldException("The field URL can't empty");
		if(title.contentEquals("")) throw new EmptyFieldException("The field title name can't empty!");
		if(tags.length==0) throw new EmptyFieldException("The field tags can't empty!");
	
}
	
}