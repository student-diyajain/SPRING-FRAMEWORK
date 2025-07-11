package com.springcore.collections;
import java.util.*;
public class Emp {
	private String name;
	private List <String> address;
	private Set<String> phones;
	private Map<String,String> courses;
	private Properties props;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	public Set<String> getPhones() {
		return phones;
	}
	public void setPhones(Set<String> phones) {
		this.phones = phones;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	public Properties getProps() {
		return props;
	}
	public void setProps(Properties props) {
		this.props = props;
	}
	public Emp(String name, List<String> address, Set<String> phones, Map<String, String> courses, Properties props) {
		super();
		this.name = name;
		this.address = address;
		this.phones = phones;
		this.courses = courses;
		this.props = props;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", address=" + address + ", phones=" + phones + ", courses=" + courses + ", props="
				+ props + "]";
	}
	
	
	

}
