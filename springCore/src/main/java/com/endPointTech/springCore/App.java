package com.endPointTech.springCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        //ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		  AbstractApplicationContext context =new AnnotationConfigApplicationContext(SpringConfig.class); 
		  Post post = context.getBean("post", Post.class); System.out.println(post);
		  Post post2 = context.getBean("post2", Post.class); System.out.println(post2); 
		  Post post3 = context.getBean("post3", Post.class); 
		  System.out.println(post3);
		  System.out.println( "Hello World!" ); context.close();
		 
        
       
    }
}
