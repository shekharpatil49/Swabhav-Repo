package com.techlab.ocp.solution;

import com.techlab.ocp.violation.FestivalType;

public class FixedDeposite1 {

	private int accountNo;
	private String name;
	private double principal;
	private int years;
	private IFestival festival;
	
	public FixedDeposite1(int accountNo, String name, double principal, 
			int years,IFestival festival) {
		this.accountNo = accountNo;
		this.name = name;
		this.principal = principal;
		this.years = years;
		this.festival=festival;
	}

	
	public double calculateSimpleInterest() {
		
		return principal * festival.calculateFestivalRate() * years;
	}
		
}
	
