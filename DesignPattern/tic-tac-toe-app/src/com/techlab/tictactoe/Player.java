package com.techlab.tictactoe;

public class Player {
	
	private MarkType mark;
	private String name;
	
	public Player(String name,MarkType mark) {
		
		this.name=name;
		this.mark=mark;
	}
	
	public MarkType getMark() {
		return mark;
	}

	public String getName() {
		return name;
	}
	

}
