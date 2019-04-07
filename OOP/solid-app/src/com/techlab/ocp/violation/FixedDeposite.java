package com.techlab.ocp.violation;

public class FixedDeposite {
	
	private int accountNo;
	private String name;
	private double principal;
	private int years;
	private FestivalType festival;
	
	public FixedDeposite(int accountNo, String name, double principal, int years, FestivalType festival) {
		this.accountNo = accountNo;
		this.name = name;
		this.principal = principal;
		this.years = years;
		this.festival = festival;
	}
	
	public double calculateSimpleInterest() {
		
		switch(festival) {
		case NORMAL:
			return principal * 0.70 *years;
		case HOLI:
			return principal * 0.80 *years;
		case NEWYEAR:
			return principal * 0.85 *years;
		}
	return 0;

		
	}
	
	

}
