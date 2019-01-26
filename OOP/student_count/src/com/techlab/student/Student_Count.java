package com.techlab.student;

public class Student_Count {
	
	private  final int roll_no ;
	private  final String name;
	private  final int age;
	private static int count;
	static { 
        count = 100; 
        System.out.println("Inside static block " + count); 
    } 
	
	public Student_Count(int roll_no,String name,int age) {
		this.roll_no=roll_no;
		this.name=name;
		this.age=age;
		count ++;
		System.out.println("Inside Constructor block " + count);
		
	}
	public Student_Count(int roll_no,String name) {
		this(5,"Sham",18);
		count ++;
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
	public static int getCount() {
		return count;
	}
	public Student_Count whoIsElder(Student_Count student){
		if(this.age>student.getAge()) {
			return this;
		}
		return student;
	}
}
   
