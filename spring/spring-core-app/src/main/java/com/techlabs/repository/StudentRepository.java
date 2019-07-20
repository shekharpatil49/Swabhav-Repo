package com.techlabs.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.techlabs.model.Student;

@Repository("studentRepository")
public class StudentRepository {
	
	List<Student> list = new ArrayList();
	
	public StudentRepository() {
		
		Student student = new Student("Shekhar","101");
		list.add(student);
	}
	
	public List getList() {
		return this.list;
	}
	
	

}
