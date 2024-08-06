package com.security.test.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.security.test.models.User;

public interface UserRepository extends JpaRepository<User, String> 
{

	public User findByUsername(String username);
	
}
