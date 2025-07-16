package com.spring.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.jdbc.entities.Student;

@Component("studentDao")
public class StudentDaoImpl implements StudentDao {
    @Autowired
	JdbcTemplate jdbcTemplate;  // to perform the operation-
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	@Override
	public int insert(Student student) {
		String query="INSERT INTO STUDENT(ID,NAME,CITY) VALUES (?,?,?);";
		int r=jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		return r;	
	}
	@Override
	public int update(Student student) {
		String query="UPDATE STUDENT SET NAME=?,CITY=? WHERE ID=?;";
		int r=jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
		return r;
	}
	@Override
	public int delete(Student student) {
		String query="DELETE FROM STUDENT WHERE ID=? AND NAME=?;";
		int r=jdbcTemplate.update(query,student.getId(),student.getName());
		return r;
	}
	@Override
	public int deleteUsingId(int studentId) {
		String query="DELETE FROM STUDENT WHERE ID=?;";
		int r=jdbcTemplate.update(query,studentId);
		return r;
	}
	@Override
	public Student getStudent(int studentId) {
		String query="SELECT * FROM STUDENT WHERE ID=?;";
		//USING ANONYMOUS CLASS-
//		Student student= jdbcTemplate.queryForObject(query,new RowMapper<Student>() {
//            @Override
//			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
//       		Student student=new Student(rs.getInt(1),rs.getString(2),rs.getString(3));
//            return student;
//			}
//	    },studentId);
		
		RowMapper<Student> rowMapper=new RowMapperImpl();
		Student student=jdbcTemplate.queryForObject(query, rowMapper,studentId);
		return student;
	}
	@Override
	public List<Student> getAllStudents() {
		String query="SELECT * FROM STUDENT;";
        List<Student> student=jdbcTemplate.query(query,new RowMapperImpl());
		return student;
	}
	

}
