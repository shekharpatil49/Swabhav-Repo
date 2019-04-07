package com.techlab.lsp.solution;

public class Square1 implements IPolygon {
	
	private int side;

	public Square1(int side) {
		this.side = side;
	}

	@Override
	public double calculateArea() {
		return side*side;
	}
	
	
	

}
