package com.java.AdvertisementApp.dao;

import java.util.Date;
import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import com.java.AdvertisementApp.Tables.Categories;
import com.java.AdvertisementApp.Tables.Login;
import com.java.AdvertisementApp.collections.ActionCollection;
import com.java.AdvertisementApp.collections.ItemCollection;
import com.java.AdvertisementApp.entity.Ad;
import com.java.AdvertisementApp.entity.User;

public class UserHibernateDaoSupportImpl extends HibernateDaoSupport implements UserDAO {

	@Transactional
	public User createUser(User user) {
		System.out.println("in dao"+(user));
		getHibernateTemplate().save(user);	
		return user;
	}
	
	@Transactional
	public List<Categories> getCategories() {
		List<Categories> categories=(List<Categories>)getHibernateTemplate().find("from Categories");
		return categories;
	}

	@Transactional
	public String loginUser(User user) {
		List loggedInUSers=getHibernateTemplate().find("from User where userName=? and password=?", user.getUserName(),user.getPassword());
		if(loggedInUSers.isEmpty()) {
			return("Login failed");
		}
		else {
			Login loggedInUsers=new Login(user.getUserName(),new Date());
			getHibernateTemplate().save(loggedInUsers);
			return ""+loggedInUsers.getId();
		}
	}
	

	public void logoutUser(String authToken) {
		// TODO Auto-generated method stub
		
	}

	public List<ActionCollection> getActions() {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional
	public Ad postAd(Ad ad) {
		getHibernateTemplate().save(ad);	
		return ad;
	}

}
