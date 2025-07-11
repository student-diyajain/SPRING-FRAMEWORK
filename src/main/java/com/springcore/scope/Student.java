package com.springcore.scope;

import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student {
@Value("12")
private int studentId;
@Value("diya")
private String studentName;


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

//tostring method
@Override
public String toString() {
	return "Student [studentId=" + studentId + ", studentName=" + studentName + "]";
}





}
