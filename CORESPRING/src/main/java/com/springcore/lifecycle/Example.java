package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//USING ANNOTATIONS
public class Example {
private String subject;

public String getSubject() {
	return subject;
}

public void setSubject(String subject) {
	System.out.println("set subject");
	this.subject = subject;
}

public Example() {
	System.out.println("call default constructor");
	
}

@Override
public String toString() {
	return "Example [subject=" + subject + "]";
}


//To use annotations we need to add additional dependency
//init method
@PostConstruct
public void init() {
	System.out.println("init method call");
}
//destroy method
@PreDestroy
public void destroy() {
	System.out.println("destroy method call");
}


}
