package com.techlab.tictactoe.unitTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.techlab.tictactoe.Board;
import com.techlab.tictactoe.Cell;
import com.techlab.tictactoe.MarkType;

public class TestBoard {
	
@Test
public void checkBoardIsInitializeOrNot() {
	Board board = new Board();
	MarkType mark = null;
	int flag =0;
	Cell cell[] = new Cell[9];
	for(int i=0;i<9;i++) {
		if(board.getBoardPosition(i)==MarkType.EMPTY) {
		  flag = 1;
		}
	}
	assertEquals(flag,1);
	
}
}
