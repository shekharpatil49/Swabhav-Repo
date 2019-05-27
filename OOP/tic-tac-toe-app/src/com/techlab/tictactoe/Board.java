package com.techlab.tictactoe;

public class Board {
	private MarkType mark;
	static int currentTurn = 1;
	Cell cell[] = new Cell[9];
	public Board() {
		System.out.println("Board");
	 for(int index=0;index<9;index++) {	
		  cell[index]=new Cell();
	  }
	}
	
	public void setBoardPosition(int index,MarkType mark) {
	
		    cell[index].setCellValue(mark);
	
		}
	
	public MarkType getBoardPosition(int index) {
	return cell[index].getCellValue();
	}
	
	public boolean checkBoardIsfull() {
		for(int index=0;index<9;index++) {
			if(cell[index].getCellValue()!=mark.EMPTY) {
				 continue;
			}
			else
				return false;
		}
			return true;
	}
	
	public int[] availableCellsToPlay() {
		int i=0;
		int[] places = new int[9];
		for(int index=0;index<9;index++) {
			if(cell[index].getCellValue()==mark.EMPTY) {
				places[i++]=index; 
			}
			
		}	
		int[] newPlaces = new int[i];
		for(int index=0;index<i;index++) {
			newPlaces[index]=places[index];
		}
		return newPlaces;
	}
	public boolean checkValidMove(int position) {
		if(position<=8 && position>=0) {
		    return true;
		}
		return false;
	}
	
	
	
	

}
