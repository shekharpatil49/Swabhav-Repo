package com.techlab.account.exception;

public class InsufficentFundException extends RuntimeException {
	
	public InsufficentFundException(Account account) {

		super(" " + account.getName() + ",You don't have sufficent balance");
	}

}
