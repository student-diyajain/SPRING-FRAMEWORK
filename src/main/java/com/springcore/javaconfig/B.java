package com.springcore.javaconfig;

public class B {
@Override
	public String toString() {
		return "B [x=" + x + "]";
	}

private int x;

public int getX() {
	return x;
}

public void setX(int x) {
	this.x = x;
}

public B() {
// System.out.println("default constructor of B");
}

public B(int x) {
//	 System.out.println("parameterized constructor of B");
     this.x = x;
}

}
