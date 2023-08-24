package com.endPointTech.springContext.property;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("/com/endPointTech/springContext/property/applicationContext.xml");
    	Student student = context.getBean("std", Student.class);
        System.out.println(student);
        
        Laptop lp = context.getBean("lp", Laptop.class);
        System.out.println(lp);
        
        System.out.println( "Hello World!" );
    }
}
