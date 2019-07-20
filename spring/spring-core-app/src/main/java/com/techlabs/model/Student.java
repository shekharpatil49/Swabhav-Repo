package com.techlabs.model;

public class Student {

	private String name;

	private String roll_no;

	public Student(String name, String roll_no) {

		this.name = name;
		this.roll_no = roll_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(String roll_no) {
		this.roll_no = roll_no;
	}
	
	public void display() {
		System.out.println("Hello world!");
	}
}
