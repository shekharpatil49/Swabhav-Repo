package com.techlab.shopping;

public class LineItem {
	
	private int id;
	private int quantity;
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getQuantity() {
		return quantity;
	}

	private Product p;
	
	public Product getP() {
		return p;
	}

	public LineItem(int id, int quantity, Product p) {
		this.id = id;
		this.quantity = quantity;
		this.p = p;
	}
	
	
    
	public double lineItemTotalCost() {
		
		return (p.calculateTotalCost()*quantity);
	}

}
