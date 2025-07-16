package com.spring.jdbc.dao;

import java.util.List;

import com.spring.jdbc.entities.Student;

public interface StudentDao {
	//insert method-
	public int insert(Student student);
	
	//update method-
	public int update(Student student);

	//Delete method-
		public int delete(Student student);
		public int deleteUsingId(int studentId);
		
    //Select method-
		public Student getStudent(int studentId);
		public List<Student> getAllStudents();
}
