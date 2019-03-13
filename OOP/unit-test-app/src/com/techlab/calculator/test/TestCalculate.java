package com.techlab.calculator.test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.jupiter.api.Test;

import com.techlab.calculator.Calculator;

public class TestCalculate {
	
	 @Test
	    public void shouldBeCubing2withResult8() {
		 Calculator calculator = new Calculator();
		   
		 	int a = 2;
		 
		    long actual = calculator.cubeEvenNumber(a);
		 
		    long expected = 8;
		 
		    assertEquals(expected, actual);
	    }
	 
}
