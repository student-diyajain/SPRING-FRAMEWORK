package com.springcore.ci;

public class Person {
      private String personName;
      private int personId;
      private Certi certi;
	public Person(String personName, int personId, Certi certi) {
		
		System.out.println("parameterized constructor call");
		this.personName = personName;
		this.personId = personId;
		this.certi = certi;
	}
	
	public Person() {
		System.out.println("default constructor call");
		
	}

	@Override
	public String toString() {
		return "Person [personName=" + personName + ", personId=" + personId + ", certi=" + certi + "]";
	}
  


      
}
