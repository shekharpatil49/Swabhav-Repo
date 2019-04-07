package com.techlab.ocp.solution;

public class Holi implements IFestival{

	double population =8000;
	
	@Override
	public double calculateFestivalRate() {
	
		return population/10000;
	}
	
	

}
