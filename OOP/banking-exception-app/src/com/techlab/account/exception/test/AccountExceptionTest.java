package com.techlab.account.exception.test;

import com.techlab.account.exception.Account;
import com.techlab.account.exception.InsufficentFundException;

public class AccountExceptionTest {

	public static void main(String args[]) {
		
		Account account = new Account(1, "Shekhar", 1000);
	
		
		try {
			account.withrow(600);
		} catch (InsufficentFundException e) {

			System.out.println(e.getMessage());

		}

	}
}
