/*package com.java.AdvertisementApp.dao;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.java.AdvertisementApp.collections.ActionCollection;
import com.java.AdvertisementApp.collections.AdCollection;
import com.java.AdvertisementApp.collections.ItemCollection;
import com.java.AdvertisementApp.collections.UserCollection;
import com.java.AdvertisementApp.collections.UserSessionCollection;
import com.java.AdvertisementApp.controller.Item;
import com.java.AdvertisementApp.entity.Ad;
import com.java.AdvertisementApp.entity.User;
import com.java.AdvertisementApp.repository.ActionRepository;
import com.java.AdvertisementApp.repository.AdRepository;
import com.java.AdvertisementApp.repository.ItemRepository;
import com.java.AdvertisementApp.repository.UserRepository;
import com.java.AdvertisementApp.repository.UserSessionRepository;

public class UserDAOImp implements UserDAO{
	
	@Autowired
	UserRepository userRepo;
	
	@Autowired
	ItemRepository itemRepo;
	
	@Autowired
	UserSessionRepository userSessionRepo;
	
	@Autowired
	ActionRepository actionRepo;
	
	@Autowired
	AdRepository adRepo;
	
	public User createUser(User user){
		UserCollection userCollection = new UserCollection();
		userCollection.setId(user.getId());
		userCollection.setUname(user.getUname());
		userCollection.setPwd(user.getPwd());
		userCollection.setFname(user.getFname());
		userCollection.setLname(user.getLname());
		
		userRepo.save(userCollection);
		return user;
	}
	public List<ItemCollection> getCategories() {
		List<ItemCollection> categories = itemRepo.findAll();
		return categories;
	}
	public String loginUser(User user) {
		UserSessionCollection userSessionCollection = new UserSessionCollection();
		List list = userRepo.getUsers(user.getUname(), user.getPwd());
		if(list.size()>0){
		userSessionCollection.setId(user.getId());
		userSessionCollection.setUname(user.getUname());
		userSessionCollection.setLastUpdatedDate(new Date());
		
		userSessionRepo.save(userSessionCollection);
		}
		return userSessionCollection.getId();
	}
	public void logoutUser(String authToken) {
		
		userSessionRepo.delete(authToken);
	
	}
	public List<ActionCollection> getActions() {
		List<ActionCollection> actions = actionRepo.findAll();
		return actions;
	}
	
	public Ad postAd(Ad ad){
		AdCollection adCollection = new AdCollection();
		adCollection.setTitle(ad.getTitle());
		adCollection.setFname(ad.getFname());
		adCollection.setCategory(ad.getCategory());
		adCollection.setDescription(ad.getDescription());
		
		adRepo.save(adCollection);
		return ad;
	}
}
*/