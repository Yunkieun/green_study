package di_p.main;


import java.util.HashSet;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import di_p.Student;

public class Student_main {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("di_xml/student.xml");
		
	
			Student stu = context.getBean("stu", Student.class);
			stu.calc();
			System.out.println(stu);
		
	}

}