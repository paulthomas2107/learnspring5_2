package com.pault.spring.core.postprocessor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("com.pault.spring.core.postprocessor")
public class BeanConfiguration {
	
	@Bean(name="Create")
	public Action action1() {
		return new Action("001", "Create");
	}
	
	@Bean(name="Update")
	public Action action2() {
		return new Action("002", "Update");
	}
}
