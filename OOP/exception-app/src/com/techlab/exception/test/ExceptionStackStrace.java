package com.techlab.exception.test;

public class ExceptionStackStrace {

	public static void main(String[] args) {
      
		m1();
		System.out.println("end of main");
	}

	private static void m1()  {
       System.out.println("Inside M1");
		m2();
	}

	private static void m2()  {
		System.out.println("Inside M2");
        m3();		
	}

	private static void m3() {
		System.out.println("Inside M3");
		throw new RuntimeException("Error in M3");
		
	}

}
