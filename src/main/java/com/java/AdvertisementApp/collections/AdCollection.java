package com.java.AdvertisementApp.collections;

import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.mapping.Document;

//@Document(collection = "post_ad")
public class AdCollection {
	
	@Id
	String id;
	String title;
	String fname;
	String category;
	String description;
	public AdCollection() {}
	public AdCollection(String id, String title, String fname, String category, String description) {
		super();
		this.id = id;
		this.title = title;
		this.fname = fname;
		this.category = category;
		this.description = description;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "AdCollection [id=" + id + ", title=" + title + ", fname=" + fname + ", category=" + category
				+ ", description=" + description + "]";
	}

}
