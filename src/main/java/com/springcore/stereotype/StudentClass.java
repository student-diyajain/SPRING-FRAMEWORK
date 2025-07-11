package com.springcore.stereotype;

import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class StudentClass {
@Value("12")
private int studentId;
@Value("diya")
private String studentName;
@Value("delhi")
private String studentAddress;
@Value("#{phones}")
private Set<String> studentPhones;

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

public Set<String> getStudentPhones() {
	return studentPhones;
}
public void setStudentPhones(Set<String> studentPhones) {
	this.studentPhones = studentPhones;
}


//tostring method
@Override
public String toString() {
	return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
			+ "]";
}


}
