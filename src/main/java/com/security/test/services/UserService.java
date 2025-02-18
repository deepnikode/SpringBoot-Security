package com.security.test.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.security.test.models.User;

@Service
public class UserService {
	List<User> list=new ArrayList<>();

	public UserService() 
	{
//		list.add(new User("abc","passwordabc","abc@gmail.com","Normal"));
//		list.add(new User("xyz","passwordxyz","xyz@gmail.com","Admin"));
	}
	
	
	// get all users
	
	public List<User> getAllUsers()
	{
		return this.list;
	}
	
	
	// get single users
	
	public User getUser(String username)
	{
		return this.list.stream().filter(
											(user)->user.getUsername().equals(username)
										).findAny().orElse(null);
	}
	
	
	// add new user
	
	public User addUser(User user)
	{	
		this.list.add(user);
		return user;
	}
}
