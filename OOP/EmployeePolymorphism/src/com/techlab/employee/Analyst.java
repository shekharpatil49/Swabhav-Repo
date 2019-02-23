package com.techlab.employee;

import java.util.Date;

public class Analyst extends Employee {

	public Analyst(String name, double basicsalary,Date date) {
		super(name, basicsalary,date);
	}

	@Override
	public double calculateTotalSalary() {
		double totalSalary = getBasicSalary() + (0.40 * getBasicSalary());
		return totalSalary;
	}

}
