package com.java.AdvertisementApp.service;

import java.util.Collection;
import java.util.List;

import com.java.AdvertisementApp.Tables.Categories;
import com.java.AdvertisementApp.collections.ActionCollection;
import com.java.AdvertisementApp.collections.ItemCollection;
import com.java.AdvertisementApp.controller.Item;
import com.java.AdvertisementApp.entity.Ad;
import com.java.AdvertisementApp.entity.User;

public interface UserService {
	public User createUser(User user);

	public List<Categories> getCategories();

	public String loginUser(User user);

	public void logoutUser(String authToken);

	public List<ActionCollection> getActions();

	public Ad postAd(Ad ad);
}
