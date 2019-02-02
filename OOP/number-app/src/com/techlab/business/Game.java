package com.techlab.business;

public class Game {
	private double randomNumber= Math.random()*100;
	private int number = (int) randomNumber;
	private String state;
	private int attempt = 0;
    
	public String play(int guessedNumber) {
		String state = null;
		  attempt++;
		if (guessedNumber > number) {
			
			state = "high";

		}
		if (guessedNumber < number) {
			
			state = "low";

		}
		if (guessedNumber == number) {
            state = "correct";

		}
		return state;
	}
	public int getAttepmt() {
		return attempt;
	}
	
}
