package com.techlab.tictactoe.unitTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.techlab.tictactoe.Board;
import com.techlab.tictactoe.MarkType;
import com.techlab.tictactoe.ResultAnalyzer;
import com.techlab.tictactoe.ResultType;

public class TestResultAnalyzer {
	
	@Test
	public void checkResultIsCorrectOrNot() {
		
		Board board = new Board();
		MarkType mark = null;
		ResultType result= null;
		board.setBoardPosition(0, mark.O);
		board.setBoardPosition(3, mark.O);
		board.setBoardPosition(6, mark.O);
		ResultAnalyzer analyze = new ResultAnalyzer(board);
		result=analyze.ifWin(mark.O);
		
		assertEquals(result.WIN,result);
		
		
	}
	

}
