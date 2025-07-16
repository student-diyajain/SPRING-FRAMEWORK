package com.springcore.ci;

public class Addition {
	private int a;
	private int b;
	public Addition(double a, double b) {     //double into int
		System.out.println("Constructor:double  double");
		this.a = (int)a;
		this.b = (int)b;
	}
	public Addition(int a, int b) {          //int into int
		System.out.println("Constructor:int  int");
		this.a = a;
		this.b = b;
	}
	public Addition(String a, String b) {     //String into int
		System.out.println("Constructor:String  String");
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
	}

	@Override
	public String toString() {
		return "Addition [a=" + a + ", b=" + b + "]";
	}
	
	public void doSum() {
		System.out.println("sum is:"+(this.a+this.b));
		
	}

}
