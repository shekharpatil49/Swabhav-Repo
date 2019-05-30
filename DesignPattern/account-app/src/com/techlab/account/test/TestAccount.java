package com.techlab.account.test;

import com.techlab.account.Account;
import com.techlab.account.IObject;
import com.techlab.account.ProxyAccount;

public class TestAccount {
	public static void main(String args[]) {
	ProxyAccount acc = new ProxyAccount(10,"Shekhar",5000);
	acc.deposite(500);
	System.out.println(acc.getBalance());
	}

}
