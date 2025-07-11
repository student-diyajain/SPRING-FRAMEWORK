package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	   
    //Instantiating an IOC container
    ApplicationContext context =
    		 new ClassPathXmlApplicationContext("com/springcore/ref/refConfig.xml");
    //return Student object
     B b=(B)context.getBean("bref");
     A a=(A)context.getBean("aref");
    System.out.println(a.getX());
    System.out.println(a.getObj().getY());
}
}
