package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//when use @Component annotation no need when use @Bean annotation
@ComponentScan(basePackages = "com.springcore.javaconfig")  
public class JavaConfig {
	
	@Bean("ball")
	public B getB() {
		return new B(50);   //constructor injection
	}
	
	
	@Bean(name={"one","first","prime"})
	public A getA() {
		return new A(getB());  //constructor injection
	}
	

}
