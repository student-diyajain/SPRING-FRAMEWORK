package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/lifecycle/Config.xml");
		//register ShutdownHook to call destroy method
		context.registerShutdownHook();
		
		
		Samosa s1=(Samosa)context.getBean("S1");
            System.out.println(s1);
            
        Pepsi p1=(Pepsi)context.getBean("P1");
                System.out.println(p1);
	
            
	}

}
