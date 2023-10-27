package com.example.AOPExample;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@EnableAspectJAutoProxy
@Aspect
@Component
public class Logger {
//	@Before(pointcut)	
//	@Before("execution(public void task1())")
//	@Before("execution(public void com.springAop.Operation.task1())")
//	@Before("execution(public void com.springAop.Operation.task*())")
//	@Before("execution(public void com.springAop.*.task*())")
//	@Before("execution(public * task*())")
//	@Before("execution(* task*())")
//	@Before("execution(* task*(*))")
	@Before("execution(* task*(..))")
	public void startLog() {			//advice
		System.out.println("Task Started!");
	}
	
	
//	@After("execution(public void task1())")
	@After("afterAllTasks()")
	public void endLog() {
		System.out.println("task ended!");
	}
	
	
	//define a pointcut separately for reuse
	@Pointcut("execution(public void task*())")
	void afterAllTasks() {}
}
