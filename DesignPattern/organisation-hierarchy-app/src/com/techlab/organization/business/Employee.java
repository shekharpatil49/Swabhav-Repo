package com.techlab.organization.business;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Comparable<Employee>  {
	
	private int empID;
	private String empName;
	private String designation;
	private String maganerID;
	private String dateOfJoining;
	private int salary;
	private String commission;
	private int departmentNumber;
	private int level=0;
	private List<Employee> subordinates =new ArrayList();


	public Employee(int empID, String empName, String designation, String maganerID, 
			String dateOfJoining, int salary,
			String commission, int departmentNumber) {

		this.empID = empID;
		this.empName = empName;
		this.designation = designation;
		this.maganerID = maganerID;
		this.dateOfJoining = dateOfJoining;
		this.salary = salary;
		this.commission = commission;
		this.departmentNumber = departmentNumber;
	}

	@Override
	public String toString() {
		return " empName= " + empName;
	}

	public Employee() {

	}

	public int getEmpID() {
		return empID;
	}

	public String getEmpName() {
		return empName;
	}

	public String getDesignation() {
		return designation;
	}

	public String getMaganerID() {
		return maganerID;
	}

	public String getDateOfJoining() {
		return dateOfJoining;
	}

	public int getSalary() {
		return salary;
	}

	public String getCommission() {
		return commission;
	}

	public int getDepartmentNumber() {
		return departmentNumber;
	}

	@Override
	public int compareTo(Employee o) {
		return empID - o.empID;
	}

	
	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	
	

}
