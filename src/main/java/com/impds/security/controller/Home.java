package com.impds.security.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

	@RequestMapping("/welcome")
	public String welcome() {
		String text = "This is the private page ";
		text += "this page is not allowed to authanticated users";
		return text;
	}

	@RequestMapping("/getUsers")
	public String getUsers() {
		return "{\"name\":\"Awadhesh\"}";
	}
	
}
