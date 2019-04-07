package com.techlab.lsp.solution.test;

import com.techlab.lsp.solution.IPolygon;
import com.techlab.lsp.solution.Rectangle1;
import com.techlab.lsp.solution.Square1;


public class TestPolygon {
	
	public static void main(String args[]) {
		
		shouldNotChangeHeightIfWidthIsModified(new Rectangle1(100,10));
		shouldNotChangeHeightIfWidthIsModified(new Square1(100,10));
		
		
	}
	private static void shouldNotChangeHeightIfWidthIsModified(Rectangle1 r) {
		
		int before = r.getHeight();
		int after = r.getHeight();
		System.out.println(before==after);
		
	}


}
