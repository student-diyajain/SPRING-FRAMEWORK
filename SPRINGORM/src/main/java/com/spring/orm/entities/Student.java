package com.spring.orm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="StudentTable")
public class Student {
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentCity=" + studentCity
				+ "]";
	}
	@Id
	@Column(name="student_id")
private int studentId;
	@Column(name="student_name")
private String studentName;
	@Column(name="student_city")
private String studentCity;
public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	this.studentId = studentId;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getStudentCity() {
	return studentCity;
}
public void setStudentCity(String studentCity) {
	this.studentCity = studentCity;
}
public Student(int studentId, String studentName, String studentCity) {
	super();
	this.studentId = studentId;
	this.studentName = studentName;
	this.studentCity = studentCity;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}

}
