package com.techlab.srp.solution;

public class Invoice {
	
	private int id;
	private String name;
	private double cost;
	private double discount;
	private final float GST = (float) 0.12;
	
	public Invoice(int id, String name, double cost, double discount) {
	
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.discount = discount;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	public double calculateTax() {
		return cost*GST;
		
	}
	public double calculateDiscount() {
		return cost*(discount/100);
	}
	
	public double finalCost() {
		return cost + calculateTax() - calculateDiscount();
	}
	

}
