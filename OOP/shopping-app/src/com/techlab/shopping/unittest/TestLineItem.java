package com.techlab.shopping.unittest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.techlab.shopping.LineItem;
import com.techlab.shopping.Product;

public class TestLineItem {
	
	@Test
	public void checkProductIsAddedInLineItemOrNot() {
		
		Product product1 = new Product(1,"Book",10,199);
		LineItem cart1 = new LineItem(1,2,product1); 
		
		String actual = cart1.getP().getName();
		String expected = "Book";
		assertEquals(expected,actual);
		
	}

}
