package com.techlab.array;

public class TestArguments {

	public static void main(String[] args) {
		
		int counter = 0;
		
		if (args.length == 0)
			System.out.println("Please Enter Some Value \nThank You");

		for (String s : args) {
			System.out.println("hello " + s);
			counter++;
			
			if (counter == args.length)
				System.out.println("Thank You");
		
		}
	}

}
