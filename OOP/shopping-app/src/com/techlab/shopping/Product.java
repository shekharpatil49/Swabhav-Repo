package com.techlab.shopping;

public class Product {
	
	private int id;
	private String name;
	private double discount ;
	private double cost;
	
	public Product(int id, String name, double discount, double cost) {
	
		this.id = id;
		this.name = name;
		this.discount = discount;
		this.cost = cost;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getDiscount() {
		return discount;
	}

	public double calculateTotalCost() {
		return cost-=cost*(discount/100);
	}
	
	
}
