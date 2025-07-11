package com.springcore.ci;
import java.util.*;
public class Emp {
	private String name;
	private List <String> address;
	private Set<String> phones;
	private Map<String,String> courses;
	private Properties props;
	
	public Emp(String name, List<String> address, Set<String> phones, Map<String, String> courses, Properties props) {
		
		System.out.println("parameter constructor call");
		this.name = name;
		this.address = address;
		this.phones = phones;
		this.courses = courses;
		this.props = props;
	}
//	public Emp() {
//	
//	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", address=" + address + ", phones=" + phones + ", courses=" + courses + ", props="
				+ props + "]";
	}
	
	
	

}
