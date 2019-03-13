package com.techlab.college.unitTest;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.techlab.college.Branch;
import com.techlab.college.Professor;
import com.techlab.college.Student;

public class TestProfessor {
	
	@Test
	public void checkProfessorIsAddedOrNot() {
		
		Professor prof = new Professor(1, "Dombivli", "20/11/1980", 30000);
		int actual = prof.getID();;
	    int expected = 1;
	    assertEquals(expected, actual);
	}

}
