package com.endPointTech.springJDBC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        Student st = new Student(0, "Anikit Dhital","BIT");
        StudentDao sDao = context.getBean("studentDao",StudentDao.class);
       // sDao.saveStudent(st);
        sDao.deleteStudent(1);
    	System.out.println( "Hello World!" );
    }
}
