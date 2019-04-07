package com.techlab.ocp.solution;

public class NewYear implements IFestival {
	
	double population =9000;

	@Override
	public double calculateFestivalRate() {
		
		return population/10000;
	}

}
