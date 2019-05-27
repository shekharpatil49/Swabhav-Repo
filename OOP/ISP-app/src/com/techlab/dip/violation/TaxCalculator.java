package com.techlab.dip.violation;

public class TaxCalculator {
	
	private LogType log;
	public TaxCalculator(LogType log) {
		this.log=log;
	}
	
	public void calculate(int amt1 , int amt2) {
		try {
			int r = amt1/amt2;
		}
		catch(Exception e) {
			if(log == log.FILE) {
				new FileLog().log(e.getMessage());
				return;
			}
			if(log == log.DB) {
				new DbLog().log(e.getMessage());
			}
		}
	}

}
