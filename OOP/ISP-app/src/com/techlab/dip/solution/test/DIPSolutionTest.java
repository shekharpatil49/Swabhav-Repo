package com.techlab.dip.solution.test;

import com.techlab.dip.solution.DbLog;
import com.techlab.dip.solution.FileLog;
import com.techlab.dip.solution.LogType;
import com.techlab.dip.solution.TaxCalculator;

public class DIPSolutionTest {
	
	public static void main(String args[]) {
		TaxCalculator cal = new TaxCalculator(new DbLog());
		System.out.println(cal.calculate(10, 0)); 
	}

}
