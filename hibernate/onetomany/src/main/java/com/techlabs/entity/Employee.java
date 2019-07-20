package com.techlabs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="empID")
	private int empID;

	@Column(name="name")
	private String name;
	@ManyToOne
	@JoinColumn
	private Department dept;
	public Employee() {
		dept= new Department();
	}
	
	public Employee( String name) {
		this.name = name;
	}
	
	public int getEmpID() {
		return empID;
	}
	
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Department getDept() {
		return dept;
	}
	
	public void setDept(Department dept) {
		this.dept = dept;
	}
	
}
