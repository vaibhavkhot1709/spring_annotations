package com.spring.annotation.first;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPersonAnnotation {
	
	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx=new ClassPathXmlApplicationContext("person_annotation.xml");
		
		Person p1=ctx.getBean("person", Person.class);
		System.out.println(p1);
				
				
		ctx.close();
		
	}

}
