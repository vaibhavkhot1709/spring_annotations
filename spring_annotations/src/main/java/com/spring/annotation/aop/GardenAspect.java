package com.spring.annotation.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class GardenAspect {
	
//	before this method get executed
	@Before("execution(* GardenManagement.getGardenInfo*(..))")
	public void callgarden1() {
		System.out.println("garden  aspect get invoked >>>>>> before ");
	}
	
// after this method executed no matters method throws any exception or not
	@After("execution(* GardenManagement.getGardenInfo*(..))")
	public void callgarden2() {
		System.out.println("garden  aspect get invoked >>>>>> after ");
	}
	
//	after execution but if exception occur then it not works
	@AfterReturning("execution(* GardenManagement.getGardenInfo*(..))")
	public void callgarden3() {
		System.out.println("garden  aspect get invoked >>>>>> after Returning ");
	}
	
	
//	 after method throws exception only in that case execute  
	@AfterThrowing("execution(* GardenManagement.getGardenInfo*(..))")
	public void callgarden4() {
		System.out.println("garden  aspect get invoked >>>>>> after throwoing exception ");
	}
	
//	 very strong advice in spring execute before or after this method execution
//	we can access any data from that class given in (* .....)
	@Around("execution(* GardenManagement.getGardenInfo*(..))")
	public void callgarden5(ProceedingJoinPoint pj) {
		System.out.println("garden  aspect get invoked >>>>>> around ");
	Integer i=(Integer) pj.getArgs()[0];
		System.out.println(" method invoked by using variable : "+i);
		
	}
	
}