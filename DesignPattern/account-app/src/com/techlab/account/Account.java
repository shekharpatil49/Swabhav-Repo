package com.techlab.account;

public class Account  {
	private int account_no;
	private String name;
	private double balance;


	public Account(int account_no, String name, double balance) {
		this.account_no = account_no;
		this.name = name;
		this.balance = balance;

	}

	public void deposite(double amount) {
		balance += amount;
		
	}
	
	public void withrow(double amount) {
		if (balance - amount > 500)
			balance -= amount;
		if (balance - amount < 500) {
			System.out.println("You dont have sufficient balanace");
			return;
		}
	}

	public int getAccountNO() {
		return account_no;
	}

	public String getName() {
		return name;
	}

	public Double getBalance() {
		return balance;
	}

}

