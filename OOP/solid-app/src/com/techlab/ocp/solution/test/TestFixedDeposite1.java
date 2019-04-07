package com.techlab.ocp.solution.test;

import com.techlab.ocp.solution.FixedDeposite1;
import com.techlab.ocp.solution.Holi;
import com.techlab.ocp.solution.NewYear;

public class TestFixedDeposite1 {
	
	public static void main(String args[]) {
	
		FixedDeposite1 fd = new	FixedDeposite1(1,"Shekhar", 100, 2, new NewYear());
		System.out.println(fd.calculateSimpleInterest());
	}

}
