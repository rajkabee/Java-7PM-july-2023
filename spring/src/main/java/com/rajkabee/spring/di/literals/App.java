package com.rajkabee.spring.di.literals;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("literals.xml");
    	DataAccessObject dao = ctx.getBean("dao",DataAccessObject.class);
    	System.out.println(dao);
    	DataAccessObject dao2 = ctx.getBean("dao2",DataAccessObject.class);
    	System.out.println(dao2);
       
    }
}
