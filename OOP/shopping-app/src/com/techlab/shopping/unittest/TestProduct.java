package com.techlab.shopping.unittest;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.techlab.shopping.Product;

public class TestProduct {
	
	@Test
	public void checkProductIsAddedOrNot() {
		
		Product product1 = new Product(1,"Book",10,199);
		
		int actual = product1.getId();
		int expected = 1;
		assertEquals(expected,actual);
		
	}

}
