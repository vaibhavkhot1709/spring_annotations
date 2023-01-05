package com.spring.annotation.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GardenAOPTest {

	public static void main(String[] args) {
//		System.out.println("main starts");

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

		ctx.register(GardenConfigure.class);
		ctx.refresh();

		GardenManagement g1 = ctx.getBean(GardenManagement.class);
//		System.out.println(g1);
		
		g1.getGardenInfo(10);
		
//		System.out.println("main ends");

	}
}
