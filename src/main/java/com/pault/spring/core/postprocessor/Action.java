package com.pault.spring.core.postprocessor;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Action {
	
	private String actionId;
	private String actionType;

}
