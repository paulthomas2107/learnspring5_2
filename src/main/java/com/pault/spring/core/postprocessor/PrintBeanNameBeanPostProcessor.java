package com.pault.spring.core.postprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class PrintBeanNameBeanPostProcessor implements BeanPostProcessor {
	
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("PrintBeanNameBeanPostProcessor - postProcessBeforeInitialization Bean Type : "+bean.getClass());
		System.out.println("PrintBeanNameBeanPostProcessor - postProcessBeforeInitialization Bean Name : "+beanName);
		System.out.println();
		return bean;
	}


	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("PrintBeanNameBeanPostProcessor - postProcessAfterInitialization Bean Type : "+bean.getClass());
		System.out.println("PrintBeanNameBeanPostProcessor - postProcessAfterInitialization Bean Name : "+beanName);
		System.out.println();
		return bean;
	}

	
}
