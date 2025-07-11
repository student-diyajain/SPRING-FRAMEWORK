package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//USING INTERFACE
public class Pepsi implements InitializingBean,DisposableBean {
private double price;

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	System.out.println("set price");
	this.price = price;
}

public Pepsi() {
	System.out.println("default constructor call");

}

@Override
public String toString() {
	return "Pepsi [price=" + price + "]";
}

@Override
public void afterPropertiesSet() throws Exception {
	System.out.println("init method call");	
}

@Override
public void destroy() throws Exception {
	System.out.println("destroy method call");
	
}

}
