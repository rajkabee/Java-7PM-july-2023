package com.endPointTech.springContext.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@EnableAspectJAutoProxy
@Component
public class Logger {
	//@Before("execution(public void task1())")
	//@Before("execution(public void task*())")
	//@Before("execution(public void task*(*))")
	//@Before("execution(public void task*(*,*))")
	//@Before("execution(public void task*(..))")
	@Before("execution(public void com.endPointTech.springContext.aop.Operations.task*(..))")
	public void logBeforeTask() {
		System.out.println("\n@Before some task done...");
	}
	
	
	@After("execution(public void task1())")
	public void logAfterTask() {
		System.out.println("@After some task done...\n");
	}
	
}
