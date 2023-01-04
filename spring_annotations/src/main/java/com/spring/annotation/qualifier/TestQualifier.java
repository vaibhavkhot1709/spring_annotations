package com.spring.annotation.qualifier;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestQualifier {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(MyVillageConfig.class);

		ctx.refresh();

		MyVillage mv = ctx.getBean(MyVillage.class);
		mv.getAddress();

		System.out.println(mv);
		

	}
}
