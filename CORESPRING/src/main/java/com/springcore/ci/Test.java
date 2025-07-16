package com.springcore.ci;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/ci/ciConfig.xml");
		Person p1=(Person)context.getBean("Person1");
		Person p2=(Person)context.getBean("Person2");
		Person p3=(Person)context.getBean("Person3");
        System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		
		
	}

}
