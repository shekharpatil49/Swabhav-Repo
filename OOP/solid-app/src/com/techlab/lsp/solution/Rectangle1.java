package com.techlab.lsp.solution;

public class Rectangle1 implements IPolygon {
	private int width;
	private int height;
	
	
	public Rectangle1(int width,int height) {
		this.width=width;
		this.height=height;

	}
	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
	@Override
	public double calculateArea() {
		
		return width*height;
	}

}
