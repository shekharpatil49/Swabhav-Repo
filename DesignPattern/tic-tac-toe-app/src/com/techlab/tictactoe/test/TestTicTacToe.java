package com.techlab.tictactoe.test;

import java.util.Scanner;

import com.techlab.tictactoe.Board;
import com.techlab.tictactoe.Cell;
import com.techlab.tictactoe.Game;
import com.techlab.tictactoe.MarkType;
import com.techlab.tictactoe.Player;
import com.techlab.tictactoe.ResultAnalyzer;
import com.techlab.tictactoe.ResultType;

public class TestTicTacToe {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Cell cell = new Cell();
		ResultType res=null;
		Board board = new Board() ;
		ResultAnalyzer result = new ResultAnalyzer(board);
		Player player[] = new Player[2];
		MarkType mark=null;	
		player[0]=new Player("Shekhar",mark.X);
		player[1]= new Player("ABC",mark.O);
		Game game = new Game(player,board,result);
	    while(!board.checkBoardIsfull()) {
	    	int m = sc.nextInt();
			game.play(m);
			System.out.println(" "+ board.getBoardPosition(m));
			System.out.println(game.getResult());
			if(game.getResult()==res.WIN)
				break;
			
		}
	}

}
