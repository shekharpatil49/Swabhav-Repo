package com.techlab.student;

public class Student {
	
	private  final int roll_no ;
	private  final String name;
	private  final int age;
	
	public Student(int roll_no,String name,int age) {
		this.roll_no=roll_no;
		this.name=name;
		this.age=age;
		
	}
	public Student(int roll_no,String name) {
		this(5,"Sham",18);
	}
	public int getRoll_No() {
		return roll_no;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public Student whoIsElder(Student student){
		if(this.age>student.getAge()) {
			return this;
		}
		return student;
	}
}
   
	

