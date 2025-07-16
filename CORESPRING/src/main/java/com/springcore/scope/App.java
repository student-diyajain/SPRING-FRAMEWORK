package com.springcore.scope;


import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        
        //Instantiating an IOC container
        ApplicationContext context =
        		 new ClassPathXmlApplicationContext("com/springcore/scope/scopeConfig.xml");
        
        Student s1=(Student) context.getBean("student"); 
        System.out.println(s1.hashCode());
        Student s2=(Student) context.getBean("student"); 
        System.out.println(s2.hashCode());
        System.out.println("-----------------------------------------------------------");
        Teacher t1=(Teacher) context.getBean("Teacher1"); 
        System.out.println(t1.hashCode());
        Teacher t2=(Teacher) context.getBean("Teacher1"); 
        System.out.println(t2.hashCode());
    }
}
