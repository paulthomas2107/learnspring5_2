package com.pault.spring.core.bean.collaboration;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {

	private String unitName;
	private String street;
	private String area;
	private String pin;
	
}
