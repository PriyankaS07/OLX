/*package com.java.AdvertisementApp.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.java.AdvertisementApp.collections.UserCollection;

public interface UserRepository extends MongoRepository<UserCollection, String>{
	@Query(value="{uname: ?0}, {pwd: ?1}")
	public List<UserCollection> getUsers(String uname, String pwd);
}*/
