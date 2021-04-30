package com.pault.spring.core.javaconfig.autowire.base.primary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


public class Main {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(VehicleConfiguration.class);
		
		appContext.getBean(Person.class).driveVehicle();
		
		((AbstractApplicationContext)appContext).close();

	}

}
