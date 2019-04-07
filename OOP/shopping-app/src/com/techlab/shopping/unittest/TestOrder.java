package com.techlab.shopping.unittest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.techlab.shopping.Order;

public class TestOrder {
	
	@Test
	public void checkOrderDateisSameOrNot() {
		
		Order order = new Order(1,"4/04/2019");
		String actual = order.getDate();
		String expected ="4/04/2019" ;
		assertEquals(expected,actual);
	}

}
