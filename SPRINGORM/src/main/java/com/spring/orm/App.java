package com.spring.orm;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

public class App 
{
    public static void main( String[] args )
    {   
    	Scanner scanner =new Scanner(System.in);
        ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/orm/Config.xml");
        StudentDao studentDao=context.getBean("studentDao",StudentDao.class);
        while(true) {
        	printMenu();
        	int choice=scanner.nextInt();
        	switch(choice) {
        	case 1:addStudent(studentDao,scanner);
        	break;
        	case 2:displayAllStudent(studentDao,scanner);
        	break;
        	case 3:	displaySingleStudent(studentDao,scanner);
        	break;
        	case 4:deleteStudent(studentDao,scanner);
        	break;
        	case 5:updateStudent(studentDao,scanner);
        	break;
        	case 0:System.out.println("Thankyou.....");
        	return;
        	default:System.out.println("Invalid choice!");
        	}
        	
        	
        }
  }

	private static void updateStudent(StudentDao studentDao, Scanner scanner) {
		Student student =new Student();
		System.out.println("Enter Id where you want to changes:");
		student.setStudentId(scanner.nextInt());
		scanner.nextLine(); // Fix newline issue

		System.out.println("Enter name:");
		String name = scanner.nextLine();
		student.setStudentName(name);

		System.out.println("Enter city:");
		String city = scanner.nextLine();
		student.setStudentCity(city);
		
		studentDao.update(student);
		System.out.println("updated");
		
	}

	private static void deleteStudent(StudentDao studentDao, Scanner scanner) {
		System.out.print("Enter Id:\n");
		studentDao.delete(scanner.nextInt());
		System.out.println("deleted");
	}

	private static void displaySingleStudent(StudentDao studentDao, Scanner scanner) {
		System.out.print("Enter Id:\n");
		Student student=studentDao.getStudent(scanner.nextInt());
		System.out.println(student.getStudentId()+":"+student.getStudentName()+":"+student.getStudentCity());
	}

	private static void displayAllStudent(StudentDao studentDao, Scanner scanner) {
		List<Student> list=studentDao.getAllStudents();
		if(list.isEmpty()) {
			System.out.println("Empty list!");
			return;
		}
		for(Student student:list) {
			System.out.println(student.getStudentId()+":"+student.getStudentName()+":"+student.getStudentCity());
		}
		
	}

	private static void addStudent(StudentDao studentDao, Scanner scanner) {
		Student student =new Student();
		System.out.println("Enter Id:");
		student.setStudentId(scanner.nextInt());
		scanner.nextLine(); // Fix newline issue

		System.out.println("Enter name:");
		String name = scanner.nextLine();
		student.setStudentName(name);

		System.out.println("Enter city:");
		String city = scanner.nextLine();
		student.setStudentCity(city);

		
		int r=studentDao.insert(student);
		System.out.println("rows inserted");
		
	}

	private static void printMenu() {
		System.out.println("==================================================================");
		System.out.println("*****Welcome to spring orm project*****");
		System.out.println("Press1 for add new student");
		System.out.println("Press2 for display all students");
		System.out.println("Press3 for get detail of single student");
		System.out.println("Press4 for delete student");
		System.out.println("Press5 for update student");
		System.out.println("Press0 exit");
		System.out.println("enter your coice:");
		System.out.println("==================================================================");
	}
}
