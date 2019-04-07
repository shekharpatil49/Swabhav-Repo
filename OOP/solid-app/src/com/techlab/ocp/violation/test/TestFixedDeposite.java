package com.techlab.ocp.violation.test;

import com.techlab.ocp.violation.FestivalType;
import com.techlab.ocp.violation.FixedDeposite;

public class TestFixedDeposite {
	
	public static void main(String args[]) {
		FestivalType festival = null;
		FixedDeposite fd=new	FixedDeposite(1,"Shekhar", 100, 2,festival.NORMAL);
		System.out.println(fd.calculateSimpleInterest());
	}

}
