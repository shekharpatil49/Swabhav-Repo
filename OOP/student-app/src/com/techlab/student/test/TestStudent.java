package com.techlab.student.test;

import com.techlab.student.Student;

public class TestStudent {
	
 public static void main(String args[]) {
	 
	 Student student_1 = new Student(21,"Ram",22);
	 printDetails(student_1);
	 Student student_2 = new Student(22,"Sham");
	 printDetails(student_2);
	 Student student_3 =student_2.whoIsElder(student_1);
	 System.out.println(student_1.hashCode());
	 System.out.println(student_2.hashCode());
	 System.out.println(student_3.hashCode());
 }
 
 public static void printDetails(Student student) {
	 System.out.println("Roll No is "+student.getRoll_No());
	 System.out.println("Name is "+student.getName());
	 System.out.println("Age is "+student.getAge());
 }
}
