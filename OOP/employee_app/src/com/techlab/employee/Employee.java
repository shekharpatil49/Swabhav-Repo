package com.techlab.employee;

public class Employee {
	
	private String firstName;
	private String lastName;
	private static int  nextEmp_no;
	private  int emp_no=100;
	static {
		nextEmp_no=100;
	}
	public Employee(String firstName,String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.emp_no= nextEmp_no;
		nextEmp_no++;
	}
	
	public String getfirstName() {
		return firstName;
	}
	
	public String getlastName() {
		return lastName;
	}
	
	public int getEmp_No() {
	
		return emp_no;
	}
}
