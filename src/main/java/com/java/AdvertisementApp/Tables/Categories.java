package com.java.AdvertisementApp.Tables;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="categories")
public class Categories {


	@GeneratedValue
	@Id
	@Column(name="id")
	long id;
	
	@Column(name="category")
	String categories;

	public Categories() {
		super();
	}

	public Categories(String categories) {
		super();
		this.categories = categories;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCategories() {
		return categories;
	}

	public void setCategories(String categories) {
		this.categories = categories;
	}

	@Override
	public String toString() {
		return "Categories [id=" + id + ", categories=" + categories + "]";
	}
	
	
}
