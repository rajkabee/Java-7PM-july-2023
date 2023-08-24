package com.endPointTech.springContext.xmlConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("/com/endPointTech/springContext/xmlConfig/applicationContext.xml");
    	//Student st = new Student();
        Student st = (Student)context.getBean("student");
        Student std = context.getBean("pupil", Student.class);
        System.out.println(st);
        System.out.println(std);
        System.out.println( "Hello World!" );
    }
}
