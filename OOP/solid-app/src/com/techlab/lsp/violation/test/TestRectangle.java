package com.techlab.lsp.violation.test;

import com.techlab.lsp.violation.Rectangle;
import com.techlab.lsp.violation.Square;

public class TestRectangle {

	public static void main(String[] args) {

		shouldNotChangeHeightIfWidthIsModified(new Rectangle(100,10));
		shouldNotChangeHeightIfWidthIsModified(new Square(100,10));
	}

	private static void shouldNotChangeHeightIfWidthIsModified(Rectangle r) {
		
		int before = r.getHeight();
		r.setWidth(150);
		int after = r.getHeight();
		System.out.println(before==after);
		
	}

}
