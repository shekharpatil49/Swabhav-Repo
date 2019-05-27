package com.techlab.tictactoe;

public class Game {

	public static int currentPlayer=0;
	private Board board ;
	private ResultAnalyzer result;
	private ResultType res;
	public static int getCurrentPlayer() {
		return currentPlayer;
	}

	

	private MarkType mark=null;
	private Player player[];
	public Game(Player[] player,Board board,ResultAnalyzer result) {
		this.player=player;
		this.board=board;
		this.result=result;
		System.out.println("Game");
	}
	
	public void play(int position) {
		checkWhoIsPlaying(position);	
	}
	
	public void checkWhoIsPlaying(int position) {
     
		if(currentPlayer==0) {
			board.setBoardPosition(position,player[currentPlayer].getMark());	
			emptyPositionsToPlay(board.availableCellsToPlay());
			res=result.ifWin(player[currentPlayer].getMark());
			currentPlayer=1;
			return;
		}
		if(currentPlayer==1) {
			board.setBoardPosition(position,player[currentPlayer].getMark());	
			emptyPositionsToPlay(board.availableCellsToPlay());
			res=result.ifWin(player[currentPlayer].getMark());
			currentPlayer=0;
			
		}
		
	}

	public void emptyPositionsToPlay(int[] places) {
		for(int index=0;index<places.length;index++) {
			System.out.print(places[index]+" , ");
		}
	}
	public ResultType getResult() {
		return res;
	}
}
