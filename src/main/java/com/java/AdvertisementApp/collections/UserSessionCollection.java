package com.java.AdvertisementApp.collections;

import java.util.Date;

import org.springframework.data.annotation.Id;

public class UserSessionCollection {
	
	@Id
	String id;
	String uname;
	Date lastUpdatedDate;
	public UserSessionCollection() {}
	public UserSessionCollection(String id, String uname, Date lastUpdatedDate) {
		super();
		this.id = id;
		this.uname = uname;
		this.lastUpdatedDate = lastUpdatedDate;
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
	public Date getLastUpdatedDate() {
		return lastUpdatedDate;
	}
	public void setLastUpdatedDate(Date date) {
		this.lastUpdatedDate = date;
	}
	@Override
	public String toString() {
		return "UserSessionCollection [id=" + id + ", uname=" + uname + ", lastUpdatedDate=" + lastUpdatedDate + "]";
	}

}
