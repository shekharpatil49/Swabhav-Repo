package com.techlabs.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.google.j2objc.annotations.AutoreleasePool;

public class College {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "collegeID")
	private int collegeID;
	@Column(name = "collegeName")
	private String collegeName;
	private Department dept;

	public College() {
		dept = new Department();
	}

	public College(String collegeName) {
		this.collegeName = collegeName;
	}

	public int getCollegeID() {
     	return collegeID;
	}

	public void setCollegeID(int collegeID) {
		this.collegeID = collegeID;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

}
