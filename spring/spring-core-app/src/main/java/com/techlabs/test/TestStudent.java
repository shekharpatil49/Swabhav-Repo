package com.techlabs.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techlabs.model.Student;
import com.techlabs.service.StudentService;

public class TestStudent {
	
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentService s = (StudentService)context.getBean("studentService");
		System.out.println(s.getList().size());
		
	}

}
