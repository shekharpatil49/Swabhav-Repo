package com.techlabs.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "deptID")
	private int deptID;
	@Column(name = "deptName")
	private String deptName;

	public Department() {

	}

	public Department(String string) {
		this.deptName=string;
	}

	@OneToMany(cascade = CascadeType.ALL)
	private Set<Employee> emp = new HashSet<Employee>();

	public int getDeptID() {
		return deptID;
	}

	public void setDeptID(int deptID) {
		this.deptID = deptID;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public Set<Employee> getEmp() {
		return emp;
	}

	public void setEmp(Set<Employee> emp) {
		this.emp = emp;
	}

}
