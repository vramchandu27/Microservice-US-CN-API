package com.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.User;
import com.user.UserServiceApplication;

@RestController
@RequestMapping("/user")
public class Usercontroller {
	
	@Autowired
	private UserServiceApplication userService;
	
	@GetMapping("/{userId}")
	public User getUser(@PathVariable("userId") Long userId)
	{
		return this.userService.getUser(userId);
	}

}
