package com.techlab.inheritance.with.constructor.test;

import com.techlab.inherihance.with.constructor.Child;

public class TestInheritanceWithConstructor {

	public static void main(String[] args) {

		Child c1 = new Child();
		System.out.println(c1.getFoo());
		
		Child c2 = new Child();
		System.out.println(c2.getFoo());
		
		Child c3 = new Child(300);
		System.out.println(c3.getFoo());
	}

}
