package com.java.AdvertisementApp.controller;

import java.util.List;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.java.AdvertisementApp.Tables.Categories;
import com.java.AdvertisementApp.collections.ActionCollection;
import com.java.AdvertisementApp.collections.ItemCollection;
import com.java.AdvertisementApp.entity.Ad;
import com.java.AdvertisementApp.entity.User;
import com.java.AdvertisementApp.service.UserService;

@RestController
@RequestMapping("/xornet")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@CrossOrigin(origins="*")
	@RequestMapping(value="/user", method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody User createUser(@RequestBody User user){
		System.out.println("User =" +user);
		return userService.createUser(user);
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String loginUser(@RequestBody User user){
		System.out.println("User =" +user);
		JSONObject jobj=new JSONObject();
		jobj.put("auth-token",userService.loginUser(user));
		return jobj.toString();
	}
	@RequestMapping(value="/categories", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Categories> getCategories(){
		System.out.println("Categories =" +userService.getCategories() );
		return userService.getCategories();
	}
	@RequestMapping(value="/postAd", method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Ad postAd(@RequestBody Ad ad){
		System.out.println("User =" +ad);
		return userService.postAd(ad);
	}

	/*
	@RequestMapping(value="/logout", method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody void logoutUser(@RequestHeader (value="auth-token") String authToken){
		userService.logoutUser(authToken);
	}
	
	@RequestMapping(value="/actions", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<ActionCollection> getActions(){
		System.out.println("Actions =" +userService.getActions() );
		return userService.getActions();
	}
	
	*/
}
