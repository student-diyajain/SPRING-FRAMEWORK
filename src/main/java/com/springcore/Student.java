package com.springcore;

public class Student {
private int studentId;
private String studentName;
private String studentAddress;

//getters and setters
public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	System.out.println("set function call of Id");
    this.studentId = studentId;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	System.out.println("set function call of Name");
	this.studentName = studentName;
}
public String getStudentAddress() {
	return studentAddress;
}
public void setStudentAddress(String studentAddress) {
	System.out.println("set function call of Address");
	this.studentAddress = studentAddress;
}

//constructors
//public Student(int studentId, String studentName, String studentAddress) {
//    System.out.println("parameterized constructor call");
//	this.studentId = studentId;
//	this.studentName = studentName;
//	this.studentAddress = studentAddress;
//}
//public Student() {
//	System.out.println("default constructor call");
//}

//tostring method
@Override
public String toString() {
	return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
			+ "]";
}


}
