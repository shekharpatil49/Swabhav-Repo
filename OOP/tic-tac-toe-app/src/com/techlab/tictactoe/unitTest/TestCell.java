package com.techlab.tictactoe.unitTest;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.techlab.tictactoe.Cell;
import com.techlab.tictactoe.MarkType;

public class TestCell {
@Test
public void checkCellValueIsCorrectOrNot() {
	MarkType mark = null;
	Cell cell = new Cell();
	 MarkType expectedValue = mark.X;
	 cell.setCellValue(mark.X);
     assertEquals(expectedValue,cell.getCellValue());
}
@Test
public void checkCellIsEmptyOrNot() {
	MarkType mark = null;
	Cell cell = new Cell();
	cell.setCellValue(mark.O);
	assertEquals(cell.getCellValue(),mark.EMPTY);
}
@Test
public void checkWhetherYourReWritingCellOrNot() {
	MarkType mark = null;
	Cell cell = new Cell();
	int flag=1;
	cell.setCellValue(mark.O);
	if(cell.getCellValue()==mark.EMPTY) {
	 flag = 0; 
	}
	assertEquals(1,flag);
	
}
}
