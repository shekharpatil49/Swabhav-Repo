package com.techlab.srp.violation;

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
	
	public double calculateTax() {
		return cost*GST;
		
	}
	public double calculateDiscount() {
		return cost*(discount/100);
	}
	
	public double finalCost() {
		return cost + calculateTax() - calculateDiscount();
	}
	
	public void print() {
		System.out.println("ID "+id);
		System.out.println("Name "+name);
		System.out.println("Final Cost :"+finalCost() );
	}
	
	

}
