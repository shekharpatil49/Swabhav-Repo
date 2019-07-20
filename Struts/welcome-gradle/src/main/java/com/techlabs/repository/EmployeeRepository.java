package com.techlabs.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.techlabs.model.Employee;

public class EmployeeRepository {
	Employee e =null;
	
	private List<Employee> emp = new ArrayList<Employee>();
	
	public List getData() {
		System.out.println(emp);
		
		return emp;	
		
	}
	
	public void loadData() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
	    System.out.println("inside load");
		Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		System.out.println("11");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav","root","12345678");
		Statement stmt = conn.createStatement();
		System.out.println("33");
		ResultSet rs = stmt.executeQuery("SELECT * FROM swabhav.EMP");
		rs=stmt.getResultSet();
		System.out.println("22");
		System.out.println(rs);
		while(rs.next()) {
			
		 e	= new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), 
					rs.getString(5), rs.getInt(6),
					rs.getString(7), rs.getInt(8));
			System.out.println("H");
			
			addToList(e);
		}
	    
	
	}

	private void addToList(Employee e) {
		System.out.println("Hello11");
		System.out.println(e);
		emp.add(e);
		
	}

}