package com.techlab.employee.test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.techlab.employee.Analyst;
import com.techlab.employee.Developer;
import com.techlab.employee.Employee;
import com.techlab.employee.Manager;

public class TestEmployee {
	static DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
	public static void main(String[] args) {
		Date date = new Date();
		Developer dev = new Developer("JOHN",100,date);
		Analyst an = new Analyst("RAM",20000,date);
		Manager mg = new Manager("SHAM",20000,date);
		printSalary(dev);
		printSalary(an);
	}
     public static void printSalary(Employee emp) {
    	 System.out.println("Name "+ emp.getName());
    	 System.out.println("Id "+emp.getId());
    	 System.out.println(emp.calculateTotalSalary());
    	 System.out.println("Date of Joining : "+(dateFormat.format(emp.getDate())));
	 
     }
}
