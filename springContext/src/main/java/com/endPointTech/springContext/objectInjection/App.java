package com.endPointTech.springContext.objectInjection;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("/com/endPointTech/springContext/objectInjection/applicationContext.xml");
    	//Student st = new Student();
        Student st = (Student)context.getBean("student");
        //Student std = context.getBean("pupil", Student.class);
        System.out.println(st);
        //System.out.println(std);
        //Laptop lp = context.getBean("laptop", Laptop.class);
        //System.out.println(lp);
        Student prajwol1 = context.getBean("prajwol", Student.class);
        Student prajwol2 = context.getBean("prajwol", Student.class);
        prajwol2.setName("Prajwol Chitrakar");
        System.out.println(prajwol1);
        System.out.println(prajwol2);
        System.out.println( "Hello World!" );
        //context.registerShutdownHook();
        context.close();
    }
}
