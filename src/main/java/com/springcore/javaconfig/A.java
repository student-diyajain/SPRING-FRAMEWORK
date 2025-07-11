package com.springcore.javaconfig;

public class A {
  @Override
	public String toString() {
		return "A [obj=" + obj + "]";
	}

private B obj;

public B getObj() {
	return obj;
}

public void setObj(B obj) {
	this.obj = obj;
}

public A(B obj) {
//	 System.out.println("parameterized constructor of A");

	this.obj = obj;
}

public A() {
//	 System.out.println("default constructor of A");

}
  
}
