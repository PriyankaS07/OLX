package com.java.AdvertisementApp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Posted_Ad")
public class Ad {

	@GeneratedValue
	@Id
	@Column(name="id")
	long id;
	
	@Column(name="title")
	String title;
	
	@Column(name="name")
	String name;
	
	@Column(name="category")
	String category;
	
	@Column(name="description")
	String description;

	public Ad() {
		super();
	}

	public Ad(String title, String name, String category, String description) {
		super();
		this.title = title;
		this.name = name;
		this.category = category;
		this.description = description;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
		return "Ad [id=" + id + ", title=" + title + ", name=" + name + ", category=" + category + ", description="
				+ description + "]";
	}

	
}
