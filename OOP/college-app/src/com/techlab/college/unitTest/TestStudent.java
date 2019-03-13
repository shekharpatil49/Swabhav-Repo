package com.techlab.college.unitTest;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.techlab.college.Branch;
import com.techlab.college.Student;

public class TestStudent {
	
	@Test
	public void checkStudentIsAddedOrNot() {
		
		Student student = new Student(2, "Dombivli",
				"31/07/1995", Branch.CMPN);
		int actual = student.getID();
	    int expected = 2;
	 
	    assertEquals(expected, actual);
	}

}
