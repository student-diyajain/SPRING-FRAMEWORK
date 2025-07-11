package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;





public class Test {

	public static void main(String[] args) {
       
        
        //Instantiating an IOC container
        ApplicationContext context =new AnnotationConfigApplicationContext(JavaConfig.class);
        		 
        //return Student object
//        Student s1=(Student) context.getBean("student");
//        System.out.println(s1);
//        s1.display();
        
        //return object of A and B
        A a1=context.getBean("one",A.class);
        A a2=context.getBean("first",A.class);
        A a3=context.getBean("prime",A.class);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        B b=context.getBean("ball",B.class);
        System.out.println(b);
        System.out.println( a1.getObj().getX());
    

	}

}
