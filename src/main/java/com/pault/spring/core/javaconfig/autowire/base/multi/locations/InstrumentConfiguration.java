package com.pault.spring.core.javaconfig.autowire.base.multi.locations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Data
@Configuration
public class InstrumentConfiguration {
	
	@Bean
	public Instrument instrument() {
		return new Instrument("Piano");
	}

}
