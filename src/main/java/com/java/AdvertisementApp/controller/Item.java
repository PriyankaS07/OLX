package com.java.AdvertisementApp.controller;

public class Item {

	String itemName;
	public Item() {}
	public Item(String itemName) {
		super();
		this.itemName = itemName;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	@Override
	public String toString() {
		return "Item [itemName=" + itemName + "]";
	}
	
}
