package com.techlab.composite;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String name;
	private String dept;
	private int salary;
	private List<Employee> list;

	public Employee(String name, String dept, int sal) {
		this.name = name;
		this.dept = dept;
		this.salary = sal;
		list = new ArrayList<Employee>();
	}

	public void add(Employee e) {
		list.add(e);
	}

	public void remove(Employee e) {
		list.remove(e);
	}

	public List<Employee> getSubordinates() {
		return list;
	}

	@Override
	public String toString() {
		return ("Employee :[ Name : " + name + ", dept : " + dept + ", salary :" + salary + " ]");
	}

}
