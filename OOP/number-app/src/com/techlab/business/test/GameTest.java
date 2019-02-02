package com.techlab.business.test;

import java.util.Scanner;

import com.techlab.business.Game;

public class GameTest {
	public static void main(String args[]) {
		int number = 0;
		String state = null;
		Scanner sc = new Scanner(System.in);
		Game game = new Game();
		while (state != "correct") {
			System.out.println("Enter number");
			number = sc.nextInt();
			state = game.play(number);
			System.out.println(state);
			System.out.println(game.getAttepmt());
		}
	}

}
