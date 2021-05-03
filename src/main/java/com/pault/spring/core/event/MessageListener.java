package com.pault.spring.core.event;

import java.util.concurrent.TimeUnit;

import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {//implements ApplicationListener<MessageEvent> {

	@EventListener
	public void onApplicationEvent(MessageEvent event) {
		System.out.println(event.getMessage());
		try {
			TimeUnit.SECONDS.sleep(2000);
			
		} catch (Exception e) {
			
		}
	}

	@EventListener
	public void onApplicationEvent(DateTimeEvent dateTimeEvent) {
		System.out.println(dateTimeEvent.getDateTime());
		
	}
	
	
	@EventListener
	public void onApplicationEvent(ContextStartedEvent contextStartedEvent) {
		System.out.println(" ContextStartedEvent started...");
		
	}
	
	@EventListener
	public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
		System.out.println(" ContextRefreshedEvent refreshed...");
		
	}
	
	@EventListener
	public void onApplicationEvent(ContextStoppedEvent contextStoppedEvent) {
		System.out.println(" ContextStoppedEvent stopped...");
		
	}
	
	@EventListener
	public void onApplicationEvent(ContextClosedEvent contextClosedEvent) {
		System.out.println(" ContextCloswedEvent closed...");
		
	}
	
	
}



