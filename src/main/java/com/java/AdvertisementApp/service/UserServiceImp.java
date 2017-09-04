package com.java.AdvertisementApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.java.AdvertisementApp.Tables.Categories;
import com.java.AdvertisementApp.collections.ActionCollection;
import com.java.AdvertisementApp.collections.ItemCollection;
import com.java.AdvertisementApp.controller.Item;
import com.java.AdvertisementApp.dao.UserDAO;
import com.java.AdvertisementApp.entity.Ad;
import com.java.AdvertisementApp.entity.User;

public class UserServiceImp implements UserService{
	
	@Autowired 
	UserDAO userDao;
	
	public User createUser(User user) {
		return userDao.createUser(user);
	}
	public List<Categories> getCategories() {
		return userDao.getCategories();
	}
	public String loginUser(User user) {
		return userDao.loginUser(user);
	}
	public void logoutUser(String authToken) {
		userDao.logoutUser(authToken);
	}
	public List<ActionCollection> getActions() {
		return userDao.getActions();
	}
	public Ad postAd(Ad ad) {
		return userDao.postAd(ad);
	}
	
}
