package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class checkAmbiguity {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/ci/ciAmbiguityConfig.xml");
	Addition add1=(Addition)context.getBean("add1");
	System.out.print(add1);
	add1.doSum();
	Addition add2=(Addition)context.getBean("add2");
	System.out.print(add2);
	add2.doSum();
	Addition add3=(Addition)context.getBean("add3");
	System.out.print(add3);
	add3.doSum();
}
}
