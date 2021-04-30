package com.pault.spring.core.javaconfig.autowire.base;

import org.springframework.beans.factory.annotation.Autowired;

public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public void save() {
		userRepository.save();
	}


}
		