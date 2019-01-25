package com.techlab.overloading;

public class TestOverloading {

	public static void main(String[] args) {


		printthis(10);
		printthis(10.5);
		printthis(10.8f);
		printthis("Hello");
		printthis(true);
		
		
	}
	
	static void printthis(int value)
	{   
		System.out.println("OverLoad 1");
		System.out.println(value);
		
	}
	static void printthis(double value)
	{
		System.out.println("OverLoad 2");
		System.out.println(value);
		
	}
	static void printthis(float value)
	{
		System.out.println("OverLoad 3");
		System.out.println(value);
		
	}
	static void printthis(String name)
	{
		System.out.println("OverLoad 4");
		System.out.println(name);
		
	}
	static void printthis(boolean t)
	{
		System.out.println("OverLoad 5");
		System.out.println(t);
		
	}

}
