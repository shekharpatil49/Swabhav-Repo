package com.techlab.college;

public class Professor extends Person implements SalariedEmployee{
      private double salary;
      private double pa=0.10f;
	   public Professor(int id, String address,
			String dob,double salary) {
		super(id, address, dob);
		this.salary=salary;
	}
	@Override
	public double calculateSalary() {
		return salary = salary*(pa)+salary;
	}
    
	
}
