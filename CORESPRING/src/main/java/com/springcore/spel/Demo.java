package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	@Value("#{23+344}")   //normal operator
	private int x;
	@Value("#{6>8?34:56}")   //ternary operator
	private int y;
	@Value("#{T(java.lang.Math).sqrt(25)}")    //static method
	private double z;
	@Value("#{T(java.lang.Math).E}")  //variable
	private double e;
	@Value("#{new java.lang.String('diya')}")    //object
	private String name;
	@Value("#{56-7<10000}")
	private boolean result;
	

	public boolean isResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public double getE() {
		return e;
	}

	public void setE(double e) {
		this.e = e;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", name=" + name + ", result=" + result + "]";
	}



	

}
