package com.techlab.business.test;

import java.util.Scanner;

import com.techlab.business.GuessTheNumber;

public class NumberTest {

	public static void main(String[] args) {
		
		GuessTheNumber guess = new GuessTheNumber();
		System.out.println("Welcome "
				+ "to Guess " + "The number game");
		
		guess.setrandomNumberGenerate();
		while(guess.validate()) {
		retry(guess);
		}
	}
    public static void retry(GuessTheNumber guess)
    {   Scanner sc = new Scanner(System.in);
    	System.out.println("Please enter number");
		int number= sc.nextInt();
		guess.setNumber(number);
    }
}
