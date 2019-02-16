package com.techlab.account;

public class Account {

	private int account_no;
	private String name;
	private double balance;

	private static int noOfTransaction = 0;

	public Account(int account_no, String name, double balance) {
		this.account_no = account_no;
		this.name = name;
		this.balance = balance;

	}

	public Account(int account_no, String name) {
		this(account_no, name, 500);
	}

	public void deposite(double amount) {
		balance += amount;
		noOfTransaction++;
	}
   @Override
	public String toString() {
	    
	   String str = super.toString();
		return "Account No: " + 
	account_no + ", Name : " + name + ","
			+ " Balance :" + balance +"\n" + str;
		
		

	}

	public void withrow(double amount) {
		if (balance - amount > 500)
			balance -= amount;
		if (balance - amount < 500) {
			System.out.println("You dont have sufficient balanace");
			return;
		}
		noOfTransaction++;
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

	public int NoOfTransactionDone() {
		return noOfTransaction;
	}
	
	public boolean equals(Account acc) {
		     if(this == acc)
		    	 return true;
		    
	        return ((this.account_no == acc.account_no)
	        		&&(this.balance==acc.balance)
	        		&&(this.name==acc.name));
	    }

}