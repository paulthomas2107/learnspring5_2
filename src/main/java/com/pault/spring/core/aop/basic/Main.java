package com.pault.spring.core.aop.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(CalculatorConfiguration.class);
		
		applicationContext.getBean("arithmeticCalculator", BasicCalculator.class).multiplication(2, 5);
		applicationContext.getBean("arithmeticCalculator", BasicCalculator.class).addition(2, 5);
		applicationContext.getBean("arithmeticCalculator", BasicCalculator.class).addition(5, 12);
		applicationContext.getBean("arithmeticCalculator", BasicCalculator.class).division(12, 2);
		applicationContext.getBean("arithmeticCalculator", BasicCalculator.class).division(12, 0);
		
		((AbstractApplicationContext)applicationContext).close();

	}

}
