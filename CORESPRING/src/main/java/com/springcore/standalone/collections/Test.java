package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.Student;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.out.println( "Hello World!" );
	        
	        
	        //Instantiating an IOC container
	        ApplicationContext context =
	        		 new ClassPathXmlApplicationContext("com/springcore/standalone/collections/aloneCollectionsConfig.xml");
	        //return Person object
	        Person e1=(Person) context.getBean("Person1");
	     
	        System.out.println(e1);
	        System.out.println(e1.getAddress().getClass().getName());
	        System.out.println(e1.getCourses().getClass().getName());
	        System.out.println(e1.getPhones().getClass().getName());
	        System.out.println(e1.getProps().getClass().getName());

	       
	}

}
