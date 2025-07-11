package com.springcore.standalone.collections;
import java.util.*;
public class Person {
	
	private List <String> address;
	private Set<String> phones;
	private Map<String,String> courses;
	private Properties props;
	
	//getter AND setter
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
    System.out.println("set address");
		this.address = address;
	}
	public Set<String> getPhones() {
		return phones;
	}
	public void setPhones(Set<String> phones) {
		System.out.println("set phones");
		this.phones = phones;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		System.out.println("set courses");
		this.courses = courses;
	}
	public Properties getProps() {
		return props;
	}
	public void setProps(Properties props) {
		this.props = props;
	}
	
	//toString method
	@Override
	public String toString() {
		return "Person [ address=" + address + ", phones=" + phones + ", courses=" + courses + ", props="
				+ props + "]";
	}

	
	
	
	

}
