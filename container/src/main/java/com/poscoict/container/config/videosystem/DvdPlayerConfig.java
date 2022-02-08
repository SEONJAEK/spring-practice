package com.poscoict.container.config.videosystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.poscoict.container.videosystem.DVDPlayer;
import com.poscoict.container.videosystem.DigitalVideoDisc;

@Configuration
public class DvdPlayerConfig {
	
	@Bean
	public DigitalVideoDisc avengers() {
		return new Avengers();
	}
	
	@Bean
	public DVDPlayer dvdPlayer() {
		return new DVDPlayer();
	}
	
	// 주입(Injection) 하기1
	// 
	
}
