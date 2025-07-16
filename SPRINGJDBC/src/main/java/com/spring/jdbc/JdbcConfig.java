package com.spring.jdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.dao.StudentDaoImpl;

@Configuration
@ComponentScan("com.spring.jdbc.dao")
public class JdbcConfig {
	
	
	//create DriverManagerDataSource bean
	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://127.0.0.1:3306/springjdbc");
		ds.setUsername("root");
		ds.setPassword("Diyajain@27");
		return ds;
	}
	
	//create JdbcTemplate bean
	@Bean
	public JdbcTemplate getTemplate() {
		JdbcTemplate jdbcTemplate=new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate ;
	}
//	
//	//create StudentDaoImpl bean
//	    @Bean("studentDao")
//		public StudentDao getStudentDao() {
//			StudentDaoImpl studentDao=new StudentDaoImpl();
//		    studentDao.setJdbcTemplate(getTemplate());
//			return studentDao ;
//		}

}
