package com.techlab.dip.violation.test;

import com.techlab.dip.violation.LogType;
import com.techlab.dip.violation.TaxCalculator;

public class DIPViolation {
	
	public static void main(String args[]) {
		TaxCalculator cal = new TaxCalculator(LogType.DB);
		cal.calculate(0, 0);
	}

}
