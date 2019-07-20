package com.techlabs.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlabs.model.Student;
import com.techlabs.repository.StudentRepository;
@Service("studentService")
public class StudentService {
	
	private List<Student> list = new ArrayList();
	@Autowired
	StudentRepository sr ;
	
	public StudentService() {
		
		System.out.println("servive");
		
	}
	
	public List getList() {
		
		return sr.getList();
		
	}
	
	

}
