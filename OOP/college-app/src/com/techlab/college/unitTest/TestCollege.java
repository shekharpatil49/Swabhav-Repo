package com.techlab.college.unitTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.techlab.college.Branch;
import com.techlab.college.College;
import com.techlab.college.Student;

public class TestCollege {
	
	@Test
	public void checkNoOfStudentIsEqualToAddedStudentOrNot() {
		College college = new College();
		Student student = new Student(2, "Dombivli",
				"31/07/1995", Branch.CMPN);
		Student student1 = new Student(3, "Andheri", 
				"24/06/1995", Branch.CMPN);
		Student student2 = new Student(4, "Ghansoli XI", 
				"14/08/1997", Branch.CMPN);
		college.addStudent(student);
		college.addStudent(student1);
		college.addStudent(student2);
		
		int actual = college.getCount();
		int expected = 3;
		assertEquals(expected,actual);
		
		
	}
	

}
