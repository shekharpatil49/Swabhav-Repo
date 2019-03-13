package com.techlab.college;

import java.util.LinkedList;
import java.util.List;

public class College {
	private static int noOfStudent = 0;
	private static String collegeName = "Vidyalankar Institute" + " Of Technology";
	private List students = new LinkedList();
	private List professors = new LinkedList();

	public void addStudent(Student student) {
		students.add(student);
		noOfStudent++;
	}

	public List getStudent() {
		return this.students;
		
	}

	public String getCollegeName() {
		return collegeName;
	}

	public int getCount() {
		return noOfStudent;
	}

	public void addProfessor(Professor prof) {
       	professors.add(prof)	;
	}
	public List getProfessor() {
		return this.professors;
		
	}
}
