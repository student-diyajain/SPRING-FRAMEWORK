package com.spring.orm.dao;

import java.util.List;

import com.spring.orm.entities.Student;

public interface StudentDao {
	//insert 
	public int insert(Student student);
	//get(single object)
	public Student getStudent(int studentId);
	//getAllStudents (multiple objects)
	public List<Student> getAllStudents();
	//delete
	public void delete(int studentId);
	//update 
	public void update(Student student);

}
