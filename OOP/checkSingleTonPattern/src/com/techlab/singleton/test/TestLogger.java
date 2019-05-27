package com.techlab.singleton.test;

import com.techlab.singleton.Logger;

public class TestLogger {
	public static void main(String args[]) {
		
		Logger obj1 = Logger.getInstance();
		Logger obj2 = Logger.getInstance();
		System.out.println(obj1);
		System.out.println(obj2);
	}

}
