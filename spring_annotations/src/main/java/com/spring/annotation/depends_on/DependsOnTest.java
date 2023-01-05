package com.spring.annotation.depends_on;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DependsOnTest {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext();
		ctx.register(A.class);
		ctx.refresh();
		
		A a1=ctx.getBean(A.class);
		System.out.println(a1);
		
	}

}
