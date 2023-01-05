package com.spring.annotation.depends_on;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(basePackages = "com.spring.annotation.depends_on",
includeFilters  = @ComponentScan.Filter(type = FilterType.ASPECTJ, pattern ="com.spring.annotation.exclude.*")
		
		
		)

public class DependsOnTest {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(DependsOnTest.class);
		ctx.refresh();

	}

}
