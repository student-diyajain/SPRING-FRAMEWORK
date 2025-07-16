package com.spring.jdbc.trial;




import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "program started..." );
        ApplicationContext context= new ClassPathXmlApplicationContext("com/spring/jdbc/trial/Config.xml");
        JdbcTemplate jt=context.getBean("jdbcTemplate",JdbcTemplate.class);
        String query="INSERT INTO STUDENT(ID,NAME,CITY) VALUES (?,?,?);";
        int result=jt.update(query,343,"rahul","chennai");
        System.out.println(result+" rows inserted.");
    }
}
