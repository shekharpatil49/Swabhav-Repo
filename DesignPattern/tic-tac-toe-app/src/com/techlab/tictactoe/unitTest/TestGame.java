package com.techlab.tictactoe.unitTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Scanner;

import org.junit.Test;

import com.techlab.tictactoe.Board;
import com.techlab.tictactoe.Cell;
import com.techlab.tictactoe.Game;
import com.techlab.tictactoe.MarkType;
import com.techlab.tictactoe.Player;
import com.techlab.tictactoe.ResultAnalyzer;

public class TestGame {
	
	@Test
	public void checkIfItSwitchingOrNot() {
	
		Player player[] = new Player[2];
		MarkType mark=null;	
		player[0]=new Player("Shekhar",mark.X);
		player[1]= new Player("ABC",mark.O);
		//Game game = new Game(player);
		//game.play(0);
		//assertEquals();
	}

}
