package com.bridgeit.spring_HiberDemo;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("applicationcontext.xml");	
		EmployeeDao dao = (EmployeeDao) factory.getBean("personDao");

		Employee e = new Employee();
		
		e.setName("varun");
		e.setSalary(50000);

		dao.saveEmp(e);
		System.out.println("Successfull..");
	}
}
