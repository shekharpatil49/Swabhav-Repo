package com.techlab.tictactoe;

public class ResultAnalyzer {
	private Board board;
	private ResultType result;
	private MarkType mark=null;
	public ResultAnalyzer(Board board) {
		this.board=board;
		System.out.println("ResultAnalyzer");
	}
	
	public ResultType ifWin(MarkType mark) {	
        if((board.getBoardPosition(0)==mark && board.getBoardPosition(3)==mark && board.getBoardPosition(6)==mark)
        	||
        	(board.getBoardPosition(0)==mark && board.getBoardPosition(1)==mark && board.getBoardPosition(2)==mark)
        	||
        	(board.getBoardPosition(0)==mark && board.getBoardPosition(4)==mark && board.getBoardPosition(8)==mark)
        	||
        	(board.getBoardPosition(6)==mark && board.getBoardPosition(7)==mark && board.getBoardPosition(8)==mark)
        	||
        	(board.getBoardPosition(3)==mark && board.getBoardPosition(4)==mark && board.getBoardPosition(5)==mark)
        	||
        	(board.getBoardPosition(1)==mark && board.getBoardPosition(4)==mark && board.getBoardPosition(7)==mark)
        	||
        	(board.getBoardPosition(2)==mark && board.getBoardPosition(5)==mark && board.getBoardPosition(8)==mark)
        	||
        	(board.getBoardPosition(2)==mark && board.getBoardPosition(4)==mark && board.getBoardPosition(6)==mark)
        	)
          return result.WIN;
        
        if(board.checkBoardIsfull()) {
         return result.DRAW;
        }
        return result.ONGOING;
	}
	

}
