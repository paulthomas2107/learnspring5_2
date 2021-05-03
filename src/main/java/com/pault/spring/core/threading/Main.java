package com.pault.spring.core.threading;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		
		ApplicationContext appContext =  new AnnotationConfigApplicationContext(TaskExecutorConfiguration.class);
		
		appContext.getBean(SpringTaskExecutor.class).doExecute(new MyRunnable());
		
		((AbstractApplicationContext)appContext).close(); // destroy method is called
		

	}
	
	static class MyRunnable implements Runnable {

		@Override
		public void run() {
			
			System.out.println(Thread.currentThread().getName());
			
			for (int i = 0; i < 5; i++) {
				System.out.println(i);
				try {
					Thread.sleep(1000); 
				} catch (InterruptedException e) {
					System.out.println(e.getLocalizedMessage());
				}	
			}	
		}
		
	}

}
