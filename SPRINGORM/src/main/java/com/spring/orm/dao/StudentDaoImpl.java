package com.spring.orm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;


import com.spring.orm.entities.Student;

public class StudentDaoImpl implements StudentDao {
private HibernateTemplate hibernateTemplate;
    //insert
	@Override
	@Transactional
	public int insert(Student student) {
		Integer r=(Integer) hibernateTemplate.save(student);
		return r;
	}
    //getSingleObject
	@Override
	public Student getStudent(int studentId) {
		Student student=hibernateTemplate.get(Student.class, studentId);
		return student;
	}
    //getMultipleObject
	@Override
	public List<Student> getAllStudents() {
		List<Student> students=hibernateTemplate.loadAll(Student.class);
		return students;
	}
	//delete
	@Transactional
	@Override
	public void delete(int studentId) {
		Student student=hibernateTemplate.get(Student.class, studentId);
		hibernateTemplate.delete(student);
	}
	//update
	@Transactional
	@Override
	public void update(Student student) {
		hibernateTemplate.update(student);
	}

	
	public StudentDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentDaoImpl(HibernateTemplate hibernateTemplate) {
		super();
		this.hibernateTemplate = hibernateTemplate;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}


	


}
