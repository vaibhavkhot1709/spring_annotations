package com.spring.annotation.depends_on;

import org.springframework.stereotype.Component;

@Component
public class B {

	public B() {
		super();
		System.out.println("no-arg of B invoked");
	}

	
	
}
