package com.java.AdvertisementApp.collections;

import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.mapping.Document;

//@Document(collection="user_profile")

public class UserCollection {
	@Id
	String id;
	String uname;
	String pwd;
	String fname;
	String lname;
	public UserCollection() {
		super();
	}
	public UserCollection(String id, String uname, String pwd, String fname, String lname) {
		super();
		this.id = id;
		this.uname = uname;
		this.pwd = pwd;
		this.fname = fname;
		this.lname = lname;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", uname=" + uname + ", pwd=" + pwd + ", fname=" + fname + ", lname=" + lname + "]";
	}
	
	
}
