package com.techlab.sorttreeset.employee.test;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import com.techlab.sorttreeset.emplyee.Employee;
import com.techlab.sorttreeset.emplyee.FirstNameComparator;
import com.techlab.sorttreeset.emplyee.LastNameComparator;


public class TestEmployee {
	
	public static void main(String args[]) {
		TreeSet<Employee> employee = new TreeSet(new FirstNameComparator());
		employee.add(new Employee("Shekhar","Patil"));
		employee.add(new Employee("Yogita","More"));
		
		employee.add(new Employee("Abhishek","Londe"));
		employee.add(new Employee("Deepak","Gupta"));
		employee.add(new Employee("Deepak","Deshmukh"));

		System.out.println("Sorting using Last Name\n");
		sortUsingLastName(employee);
		
	}

	private static void sortUsingLastName(TreeSet<Employee> employee) {
		for(Employee emp : employee) {
			System.out.println(emp);			
		}
	}
}
		
	

