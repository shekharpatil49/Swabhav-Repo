package com.techlab.employee;

import java.util.Date;

public class Developer extends Employee {

	public Developer(String name, double salary,Date date) {
		super(name, salary,date);
	}

	@Override
	public double calculateTotalSalary() {
	     double totalSalary = basicSalary+ (0.30* basicSalary);
         return totalSalary;
		
	}

}
