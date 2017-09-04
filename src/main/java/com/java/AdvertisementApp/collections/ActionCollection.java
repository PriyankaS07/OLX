package com.java.AdvertisementApp.collections;

import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.mapping.Document;

//@Document(collection="Actions")
public class ActionCollection {
	@Id
	String id;
	String name;
	public ActionCollection() {}
	public ActionCollection(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Item [name=" + name + "]";
	}
	
}

