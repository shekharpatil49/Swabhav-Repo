package com.techlab.dip.solution;

public class TaxCalculator {
	
	private ILog log;
	public TaxCalculator(ILog log) {
		this.log=log;
	}
	
	public int calculate(int amt1 , int amt2) {
		try {
			int r = amt1/amt2;
			return 1;
		}
		catch(Exception e) {
		
				log.log(e.getMessage());
				return 0;
		}
		
	}

}
