package com.pault.spring.core.javaconfig.autowire.base.primary;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import lombok.Data;

@Data
@Configuration
public class VehicleConfiguration {
	
	@Bean
	@Primary
	public Vehicle bike() {
		return new Bike();
	}

	@Bean
	public Vehicle car() {
		return new Car();
	}
	
	@Bean
	public Person person() {
		return new Person();
	}

}
