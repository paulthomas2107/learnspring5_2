package com.pault.spring.core.property.merge;

import java.util.Properties;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper=false)
@Data
public class EmailDetails extends Details {
	
	private Properties details;

}
