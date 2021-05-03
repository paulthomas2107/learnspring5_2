package com.pault.spring.core.event;

import java.util.Calendar;
import java.util.Date;

import org.springframework.context.ApplicationEvent;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class DateTimeEvent extends ApplicationEvent {

	private static final long serialVersionUID = -8284290845368357410L;

	private Date dateTime;
	
	public DateTimeEvent(Object source) {
		super(source);
		this.dateTime = Calendar.getInstance().getTime();
	}

}
