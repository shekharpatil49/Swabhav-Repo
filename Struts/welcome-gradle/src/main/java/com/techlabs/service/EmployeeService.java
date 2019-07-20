package com.techlabs.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.techlabs.model.Employee;
import com.techlabs.repository.EmployeeRepository;

public class EmployeeService {
	
	
	private List<Employee> emp = new ArrayList();
	EmployeeRepository er = new EmployeeRepository();
	
	
	public List getEmployeeList() {
		System.out.println("Hello2");
		System.out.println("getEmployee");
		System.out.println(er.getData());
		try {
			er.loadData();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return er.getData();
	}
	
	

}
