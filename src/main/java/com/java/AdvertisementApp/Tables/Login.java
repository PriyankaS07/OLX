package com.java.AdvertisementApp.Tables;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Login_users")
public class Login {
	@GeneratedValue
	@Id
	@Column(name="id")
	long id;
	
	@Column(name="name")
	String userName;

	@Column(name="lastUpdatedDate")
	Date date;

	public Login() {
		super();
	}

	

	public Login( String userName, Date date) {
		this.userName = userName;
		this.date = date;
	}



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}



	public Date getDate() {
		return date;
	}



	public void setDate(Date date) {
		this.date = date;
	}



	@Override
	public String toString() {
		return "Login [id=" + id + ", userName=" + userName + ", date=" + date + "]";
	}



	
}
