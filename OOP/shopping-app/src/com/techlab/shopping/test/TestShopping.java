package com.techlab.shopping.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.techlab.shopping.Customer;
import com.techlab.shopping.HtmlFileGenerator;
import com.techlab.shopping.LineItem;
import com.techlab.shopping.Order;
import com.techlab.shopping.Product;

public class TestShopping {
	
	public static void main(String args[]) throws IOException {
		String str ="";
		HtmlFileGenerator obj = new HtmlFileGenerator();
		List<LineItem> lineitems = new LinkedList();
		List<Order> orders = new LinkedList();
		Product product1 = new Product(1,"Book",10,199);
		Product product3 = new Product(1,"Book",10,199);
		Product product2 = new Product(2,"NoteBook",10,199);
		LineItem cart1 = new LineItem(1,2,product1); 
		LineItem cart2 = new LineItem(1,2,product2); 
		LineItem cart3 = new LineItem(2,3,product3); 
		
		Order order = new Order(1,"4/04/2019");
		lineitems=order.getCart();
		Customer customer = new Customer("Shekhar","Dombivli");
		orders=customer.getOrder();
		customer.addOrder(order);
		order.addLineItem(cart1);
		order.addLineItem(cart2);
		order.addLineItem(cart3);
		order.checkoutPrice();
		obj.generateHtmlFile(customer, lineitems, orders,order);
		
	}

}
