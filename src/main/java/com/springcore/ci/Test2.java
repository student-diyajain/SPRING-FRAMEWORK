package com.springcore.ci;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.ci.Emp;

public class Test2 {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/ci/ciCollectionsConfig.xml");
		 Emp e1=(Emp) context.getBean("Emp1");
	        System.out.println(e1);
		
		
		
	}


}
