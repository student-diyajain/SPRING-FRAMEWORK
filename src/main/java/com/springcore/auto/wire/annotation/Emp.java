package com.springcore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	@Autowired
	@Qualifier("address8")
private Address address;

public Address getAddress() {
	return address;
}



public void setAddress(Address address) {
	System.out.println("setting address");
	this.address = address;
}

@Override
public String toString() {
	return "Emp [address=" + address + "]";
}

public Emp() {
	System.out.println("default constructor of Emp");
}


public Emp(Address address) {
	System.out.println("Parameterized constructor of Emp");
	this.address = address;
}

}
