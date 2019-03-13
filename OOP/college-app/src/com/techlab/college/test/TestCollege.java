package com.techlab.college.test;

import java.util.Iterator;
import java.util.List;

import com.techlab.college.Branch;
import com.techlab.college.College;
import com.techlab.college.Person;
import com.techlab.college.Professor;
import com.techlab.college.Student;

public class TestCollege {

	public static void main(String[] args) {
		College college = new College();
		Professor prof = new Professor(1, "Dombivli", "20/11/1980", 30000);
		Student student = new Student(2, "Dombivli", "31/07/1995", Branch.CMPN);
		Student student1 = new Student(3, "Andheri", "24/06/1995", Branch.CMPN);
		Student student2 = new Student(4, "Ghansoli XI", "14/08/1997", Branch.CMPN);
		college.addStudent(student);
		college.addStudent(student1);
		college.addStudent(student2);
		college.addProfessor(prof);
		printDetails(college);
	}

	private static void printDetails(College college) {
		List students = college.getStudent();
		List professors = college.getProfessor();
		for (Iterator i = students.iterator(); i.hasNext();) {
			Student st = (Student) i.next();
			System.out.println("ID : " + st.getID());
			System.out.println("Address : " + st.getAddress());
			System.out.println("DOB : " + st.getDob());
			System.out.println("Branch : " + st.getBranch());
			System.out.println("College : " + college.getCollegeName());
		}
		for (Iterator i = professors.iterator(); i.hasNext();) {
			Professor pro = (Professor) i.next();
			System.out.println("ID : " + pro.getID());
			System.out.println("Address : " + pro.getAddress());
			System.out.println("DOB : " + pro.getDob());
			System.out.println("Branch : " + pro.calculateSalary());
			System.out.println("College : " + college.getCollegeName());
		}
		System.out.println("No of student in college " + college.getCount());

	}

}
