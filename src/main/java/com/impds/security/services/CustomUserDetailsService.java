package com.impds.security.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.impds.security.model.CustomUserDetails;
import com.impds.security.model.User;
import com.impds.security.repository.UserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
	
	    User user = this.userRepository.findByUsername(userName);
		
	    if(user==null) {
	    	throw new UsernameNotFoundException("User Not Found !!..");
	    }else {
			return new CustomUserDetails(user);
		}
	    
	    
	    
//		if(username.equals("Awadhesh")) {
//			return new User("Awadhesh", "Awadhesh@123", new ArrayList<>());
//		}else {
//			throw new UsernameNotFoundException("User Not Found !!..");
//		}
	}

}
