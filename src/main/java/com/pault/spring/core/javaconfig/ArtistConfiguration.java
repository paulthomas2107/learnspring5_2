package com.pault.spring.core.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ArtistConfiguration {
	
	 @Bean(name = "MyArtist")
	 public Artist artist() {
		 return new Artist("Paul", "Thomas");
	 }
	
}
