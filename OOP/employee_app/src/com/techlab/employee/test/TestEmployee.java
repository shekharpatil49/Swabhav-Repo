package com.techlab.employee.test;

import com.techlab.employee.Employee;

public class TestEmployee {
	
	public static void main(String args[])
	{
		Employee emp1 = new Employee("Shekhar","Patil");
		
		printDetails(emp1);
		Employee emp2 = new Employee("ABC","XYZ");
		printDetails(emp2);
		printDetails(emp1);
	}
	public static void printDetails(Employee emp) {
		System.out.println("EMP_NO "+emp.getEmp_No());
		System.out.println("First Name " +emp.getfirstName());
		System.out.println("Last Name "+emp.getlastName());
		
	}


}
