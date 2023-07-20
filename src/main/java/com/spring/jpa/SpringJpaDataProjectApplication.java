package com.spring.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import org.springframework.context.ApplicationContext;

import com.spring.jpa.dao.UserRepository;
import com.spring.jpa.model.User;

@SpringBootApplication
public class SpringJpaDataProjectApplication {

	public static void main(String[] args) {
		
		ApplicationContext context= SpringApplication.run(SpringJpaDataProjectApplication.class, args);
		UserRepository  userRepository  = (UserRepository)context.getBean(UserRepository.class);
		
		
		User user = new User();
		
		user.setName("fhg");
		user.setCity("fhg");
		user.setStatus("fhg");
		User returnUser = userRepository.save(user);
		System.out.println(returnUser);
		
		
		
		
	}

}
