package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;


public class Test {

	public static void main(String[] args) {

ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/spel/spelConfig.xml");
Demo d1=context.getBean("demo",Demo.class);
System.out.println(d1);

System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

//other way to use SpEL---
SpelExpressionParser temp=new SpelExpressionParser();
Expression exp=temp.parseExpression("1+20");
System.out.println(exp.getValue());

	}

}
