package com.techlab.account;

import java.time.LocalTime;

public class ProxyAccount extends Account {
	
	private LocalTime time= LocalTime.now();
	

	private Account account;
	
	public ProxyAccount(int account_no, String name, double balance) {
		
		super(account_no, name, balance) ;

		
	}

	
	public void deposite(double amount) {
	     super.deposite(amount);
	     System.out.println(time);
		
	}

	
	public void withrow(double amount) {
		
	    super.withrow(amount);
	    System.out.println(time);
	}

	
	public Double getBalance() {
		
		return super.getBalance();
	}

	public LocalTime getTime() {
		return time;
	}
	
}
