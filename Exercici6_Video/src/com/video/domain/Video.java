package com.video.domain;
import com.video.exceptions.EmptyFieldException;

public class Video{
	protected String URL;
	protected String title;
	protected String[] tags;

	public Video (String URL, String title,String[]tags) throws Exception{
//		this.name = name;
		if(URL.contentEquals("")) throw new EmptyFieldException("The field URL can't empty");
		if(title.contentEquals("")) throw new EmptyFieldException("The field title name can't empty!");
		if(tags.length==0) throw new EmptyFieldException("The field tags can't empty!");
		this.URL = URL;
		this.title = title;
		this.tags = tags;
}
	public String getURL() {
		return URL;
	}
	public void setURL(String uRL) {
		URL = uRL;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}


	public String[] getTags() {
		String[] lostags=this.tags;
		for (int i = 0; i < tags.length; i++) {
			lostags[i]=tags[i];
			System.out.println("Tag+"+(i+1)+" :"+ tags[i]);
		}
		
		return lostags;
	}


	public void setTags(String[] tags) {
		this.tags = tags;
	}	
	
}