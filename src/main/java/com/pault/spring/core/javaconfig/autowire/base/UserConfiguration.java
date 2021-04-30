package com.pault.spring.core.javaconfig.autowire.base;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfiguration {
	
	@Bean
	public UserRepository userRepository() {
		return new UserRepository();
	}
	
	@Bean
	public UserService userService() {
		return new UserService();
	}

}
