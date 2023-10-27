package com.example.AOPExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		Operation op = (Operation)context.getBean("operation");
		op.task1();
		op.task2();
		op.task3();

    }
}
