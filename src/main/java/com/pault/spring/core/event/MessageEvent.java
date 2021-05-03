package com.pault.spring.core.event;

import java.util.Calendar;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.context.ApplicationEvent;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class MessageEvent extends ApplicationEvent {
	
	private static final long serialVersionUID = 8303776088280361490L;

	private String message;
	
	private static AtomicInteger messageCounter = new AtomicInteger();
	
	public MessageEvent(String source) {
		super(source);
		this.message = generateMessage(source);
	}
	
	private String generateMessage(String message) {
		
		StringBuilder builder = new StringBuilder();
		builder.append("| Info | ")
			.append(Calendar.getInstance().getTime())
			.append(" | ")
			.append(" Message Sequence | ")
			.append(messageCounter.getAndIncrement())
			.append(" | ")
			.append(message);
	
		return builder.toString();
	}

}
