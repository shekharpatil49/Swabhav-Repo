package com.techlab.shopping.unittest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.techlab.shopping.Customer;

public class TestCustomer {
	
	@Test
	public void checkCustomerName() {
		
		Customer customer = new Customer("Shekhar","Dombivli");
		int actual = customer.getId();
		int expected = 1;
		assertEquals(expected,actual);
	}
	
	

}
