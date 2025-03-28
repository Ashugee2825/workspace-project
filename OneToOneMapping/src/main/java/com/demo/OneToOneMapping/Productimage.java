package com.demo.OneToOneMapping;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table
public class Productimage {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int pimageid;
	
	String imageurl;
	
	public Productimage() {
	}


	public Productimage(int pimageid, String imageurl) {
		super();
		this.pimageid = pimageid;
		this.imageurl = imageurl;
	}


	public Productimage(String imageurl) {
		super();
		this.imageurl = imageurl;
	}


	public int getPimageid() {
		return pimageid;
	}


	public void setPimageid(int pimageid) {
		this.pimageid = pimageid;
	}


	public String getImageurl() {
		return imageurl;
	}


	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}
	
	
	



}
