package com.rajkabee.springAop2;

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
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        Operation op = ctx.getBean("operation", Operation.class);
        op.task1();
        op.task1(45);
        op.task2();
        op.task3();
    	System.out.println( "Hello World!" );
    }
}
