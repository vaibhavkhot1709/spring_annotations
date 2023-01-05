package com.spring.annotation.aop;

import org.springframework.stereotype.Component;

@Component
public class GardenManagement {

	public Garden getGardenInfo(int i) {
		System.out.println("getGardenInfo() of GardenManagement invoked");
		
		return new Garden(99,"Wing Garden","Mumbai");
	}
	
}
