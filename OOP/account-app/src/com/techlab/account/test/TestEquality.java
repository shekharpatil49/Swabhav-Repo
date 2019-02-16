package com.techlab.account.test;

import com.techlab.account.Account;

public class TestEquality {

	public static void main(String[] args) {

		Account acc1 = new Account(10, "Shekhar", 50000);
		Account acc2 = new Account(10, "Shekhar", 50000);

		System.out.println(acc1 == acc1);
		System.out.println(acc1 == acc2);

		System.out.println(acc1.equals(acc1));
		System.out.println(acc1.equals(acc2));

	}

}
