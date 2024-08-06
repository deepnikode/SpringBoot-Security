package com.security.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.security.test.models.User;
import com.security.test.repo.UserRepository;

@SpringBootApplication
public class SpringSecurityCheatcodeApplication implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	public static void main(String[] args) 
	{
		SpringApplication.run(SpringSecurityCheatcodeApplication.class, args);
		
		
	}

	@Override
	public void run(String... args) throws Exception 
	{
		User user1=new User();
		user1.setEmail("deepnikode@gmail.com");
		user1.setUsername("Deep");
		user1.setPassword(this.bCryptPasswordEncoder.encode("Sangita"));
		user1.setRole("ROLE_USER");
		this.userRepository.save(user1);
		
		
		User user2=new User();
		user2.setEmail("artinikode@gmail.com");
		user2.setUsername("Arti");
		user2.setPassword(this.bCryptPasswordEncoder.encode("Sangita"));
		user2.setRole("ROLE_ADMIN");
		this.userRepository.save(user2);
		
		
		User user3=new User();
		user3.setEmail("anjalinikode@gmail.com");
		user3.setUsername("Anjali");
		user3.setPassword(this.bCryptPasswordEncoder.encode("Bharti"));
		user3.setRole("ROLE_ADMIN");
		this.userRepository.save(user3);
	}

}
