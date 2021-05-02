package com.pault.spring.core.aware;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.core.env.MapPropertySource;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.StandardEnvironment;


public class Main {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
		
		StandardEnvironment standardEnvironment = new StandardEnvironment();
		MutablePropertySources mutablePropertySources = standardEnvironment.getPropertySources();
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", "Paul T...");
		
		mutablePropertySources.addFirst(new MapPropertySource("custom", map));
		
		appContext.setEnvironment(standardEnvironment);
		appContext.scan("com.pault.spring.core.aware");
		appContext.refresh();
		
		((AbstractApplicationContext)appContext).close(); // destroy method is called

	}

}
