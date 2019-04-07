package com.techlab.shopping;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Customer {
	
	private static int id=0;
	private String name;
	private String address;
	private List<Order> order=new ArrayList();
	
	public Customer(String name, String address) {
		this.name = name;
		this.address = address;
		id++;
	}
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public void addOrder(Order o) {
		 order.add(o);	
	}
	public List<Order> getOrder() {
		return order;
	}
}
