package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/lifecycle/AnnotationConfig.xml");
		//register ShutdownHook to call destroy method
		context.registerShutdownHook();

		
		Example e1=(Example)context.getBean("E1");
		System.out.println(e1);

	}

}
