package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.Student;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.out.println( "Hello World!" );
	        
	        
	        //Instantiating an IOC container
	        ApplicationContext context =
	        		 new ClassPathXmlApplicationContext("com/springcore/collections/collectionsConfig.xml");
	        //return Student object
	        Emp e1=(Emp) context.getBean("Employee1");
	        System.out.println(e1);
	        //since there is no standalone collection so there class is implicitly defined--
	        System.out.println(e1.getAddress().getClass().getName());
	        System.out.println(e1.getCourses().getClass().getName());
	        System.out.println(e1.getPhones().getClass().getName());
	        System.out.println(e1.getProps().getClass().getName());

	       
	}

}
