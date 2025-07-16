package com.springcore;


import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        
        //Instantiating an IOC container
        ApplicationContext context =
        		 new ClassPathXmlApplicationContext("Config.xml");
        //return Student object
        Student s1=(Student) context.getBean("Student1");
        Student s2=(Student) context.getBean("Student2");
        Student s3=(Student) context.getBean("Student3");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        
        
    }
}
