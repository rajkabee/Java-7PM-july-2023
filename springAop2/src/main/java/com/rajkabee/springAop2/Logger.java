package com.rajkabee.springAop2;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;


@EnableAspectJAutoProxy
@Component
@Aspect
public class Logger {
	//@Before("execution(public void task1())")
	//@Before("execution(public void task*())")
	//@Before("execution(public void com.rajkabee.springAop2.Operation.task*())")
	//@Before("execution(public void com.rajkabee.springAop2.Operation.task*(*))")
	@Before("execution(public void com.rajkabee.springAop2.*.task*(..))")
	public void beforeTask() {
		System.out.println("before task started...");
	}
	
	
	
}
