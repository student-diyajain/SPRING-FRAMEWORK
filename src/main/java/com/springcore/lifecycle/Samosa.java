package com.springcore.lifecycle;
//USING XML FILE
public class Samosa {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("set price");
		this.price = price;
	}

	public Samosa() {
		System.out.println("default constructor call");
	}
	
	
	
	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}

	//init method 
	public void init() {
		System.out.println("init method call");
	}
	//destroy method
	public void destroy() {
		System.out.println("destroy method call");
	}
	

}
