package com.spring.jdbc;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "program started..." );
        ApplicationContext context= new AnnotationConfigApplicationContext(JdbcConfig.class);
        
        //get bean of StudentDaoImpl class and refer to StudentDao interface
        StudentDao sd =context.getBean("studentDao",StudentDao.class);
        
        //INSERT
//        Student s=new Student();
//        s.setId(2020);
//        s.setName("pari");
//        s.setCity("delhi");
//        int result1=sd.insert(s);
//        System.out.println(result1+" rows inserted."); 
        System.out.println("====================================================");
//        
        //UPDATE
//        Student s1=new Student();
//        s1.setId(202);
//        s1.setName("vikas");
//        s1.setCity("delhi");
//        int result2=sd.update(s1);
//        System.out.println(result2+" rows updated."); 
//        System.out.println("====================================================");
        
        //DELETE
          //FIRST METHOD-
//          Student s2=new Student();
//          s2.setId(100);
//          s2.setName("diya");
//          int result3=sd.delete(s2);
//          System.out.println(result3+" rows deleted.");
          
          //SECOND METHOD-
//          Scanner s=new Scanner(System.in);
//          System.out.println("enter id you want to delete?");
//          int X=s.nextInt();
//          int result4=sd.deleteUsingId(X);
//          System.out.println(result4+" rows deleted.");
        
        //SELECT
          //one row-
          Scanner s=new Scanner(System.in);
          System.out.println("enter id?");
          int X=s.nextInt();
          Student student= sd.getStudent(X);
          System.out.println(student);
          
        //all row-
//          List<Student> student= sd.getAllStudents();
//          for(Student list:student) {
//          System.out.println(list);
//          }
          
    }
}
