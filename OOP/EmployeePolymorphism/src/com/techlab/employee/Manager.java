package com.techlab.employee;

import java.util.Date;

public class Manager extends Employee{

	public Manager(String name, double basicsalary,Date date) {
		super(name, basicsalary,date);
	}

	@Override
	public double calculateTotalSalary() {
     double totalSalary = getBasicSalary()+(0.50*getBasicSalary()) 
    		 +( 0.40*getBasicSalary())+ (0.30*getBasicSalary());
     return totalSalary;
	}
	
	

}
