package com.impds.security;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.impds.security.model.User;
import com.impds.security.repository.UserRepository;

@SpringBootApplication
public class JwtAthentication020923Application {

//	@Autowired
//	private UserRepository userRepository;
//	
//	Random random = new Random();
//	
//	public void createUsers() {
//		User user = new User();
//		Long id = new Long(random.nextInt(100));
//		user.setUserId(id);
//		user.setUsername("user"+id);
//		user.setPassword("user"+id);
//		user.setEmail("user"+id+"@gmail.com");
//		user.setRole("ADMIN");
//		user.setEnabled(true);
//		
//		User save = userRepository.save(user);
//		
//		System.out.println(save);
//	}
	
	public static void main(String[] args) {
		SpringApplication.run(JwtAthentication020923Application.class, args);
		
	}

//	@Override
//	public void run(String... args) throws Exception {
//		createUsers();
//	}
}
