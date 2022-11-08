package com.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.entity.User;

@Service
public class UserServiceImpl implements userService {
	
	List<User> list=List.of(
			
			new User (101L,"Rajasekhar","993726729"),
			new User (102L,"ramchandu","837389299"),
			new User (103L,"rohan","56883676")
			
			);

	@Override
	public User getUser(Long id) {
		return list.stream()
					.filter(user ->
					user.getUserId()
					.equals(id))
					.findAny()
					.orElse(null);
		}
			

}
