package com.techlabs.model;
public class Employee {
	
	private int empID;
	private String empName;
	private String designation;
	private String maganerID;
	private String dateOfJoining;
	private int salary;
	private String commission;
	private int departmentNumber;

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
		System.out.println("1");
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

}