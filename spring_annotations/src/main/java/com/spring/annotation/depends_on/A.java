package com.spring.annotation.depends_on;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
@DependsOn({"b"})
public class A {
	
	int i=10;

	public A() {
		super();
		System.out.println("no-arg of A invoked");
	}

	@Override
	public String toString() {
		return "A [i=" + i + "]";
	}

	
	
}
