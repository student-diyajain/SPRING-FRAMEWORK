package com.springcore.stereotype;


import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        
        //Instantiating an IOC container
        ApplicationContext context =
        		 new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoConfig.xml");
        //return Student object
        StudentClass s1=(StudentClass) context.getBean("studentClass"); //or agr name change nhi kr rhe toh class k name in camel case
      
        System.out.println(s1);
        System.out.println(s1.getStudentPhones());
        
        
    }
}
