package com.springcore.auto.wire;

public class Emp {
private Address address;

public Address getAddress() {
	return address;
}

public void setAddress(Address address) {

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
