package com.poscoict.container.config.user;

import org.springframework.context.annotation.Bean;

import com.poscoict.container.user.User;

public class AppConfig01 {
	
	@Bean
	public User user() {
		return new User("둘리");
	}
}
