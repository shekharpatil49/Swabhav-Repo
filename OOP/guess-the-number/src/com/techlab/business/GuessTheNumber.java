package com.techlab.business;

import java.util.Scanner;

public class GuessTheNumber {

	private double randomNumber;
	private int number = (int) randomNumber;
	private int guessedNumber;
	private int attempt = 0;
	private boolean guess = true;

	public void setNumber(int guessedNumber) {
		this.guessedNumber = guessedNumber;

	}

	public void setrandomNumberGenerate() {
		randomNumber = (Math.random() * 100);
		number = (int) randomNumber;
	}


	public boolean validate() {
        boolean flag = true;
			if (guessedNumber > number) {
				System.out.println("Too high");
				System.out.println("try again " + "and enter number");
				
				attempt++;
				flag = true;
				
			}
			if (guessedNumber < number) {
				System.out.println("Too Low");
				System.out.println("try again " + "and enter number");
				attempt++;
				flag =true;
			}
			if (guessedNumber == number) {
				System.out.println("Congratulations"
						+ " you " + "guessed it" + ""
								+ " correctly in " 
						+ attempt + " attemps");
				flag = false;
			}

	return flag;
	
	}

}
