package com.techlab.employee;

import java.util.Date;

public abstract class Employee {
	protected double basicSalary;
	private String name;
	private static int nextEmp_no;
	private int id = 0;
	private Date date;

	public Employee(String name, double basicSalary,Date date) {
		this.name = name;
		this.basicSalary = basicSalary;
		this.id = nextEmp_no;
		this.date = date;
		nextEmp_no++;

	}
	abstract public double calculateTotalSalary();
	
	public int  getId() {
		return id;
	}
	public String  getName() {
		return name;
	}
	public double  getBasicSalary() {
		return basicSalary;
	}
	public Date getDate() {
		return date;
	}
}
