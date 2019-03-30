package com.techlab.sorttreeset.emplyee;

import java.util.Comparator;

public class Employee {
	
	private String firstName;	
	private String lastName;
	
	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	@Override
	public String toString() {
		return firstName +" "+lastName;
	}
	

}
	


