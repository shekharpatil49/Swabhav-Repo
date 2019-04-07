package com.techlab.shopping;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Order {
	
	private int orderID;
	private String date;
	private LineItem item;
	private List<LineItem> cart= new LinkedList();
	
	
	public List<LineItem> getCart() {
		return cart;
	}

	public LineItem getItem() {
		return item;
	}


	public Order(int orderID, String date) {
		this.orderID = orderID;
		this.date = date;
	}
	
    public void addLineItem(LineItem item) {
    	
    	if(cart.isEmpty())	{
    	  cart.add(item);
    	  return;
    	}
    	if(!cart.isEmpty()) {
    		for(int index=0;index<cart.size();index++) {
    			if(item.getP().getId()== cart.get(index).getP().getId()) {
    				cart.get(index).setQuantity(item.getQuantity()+cart.get(index).getQuantity());
    				return;
    			}  			
    				
    		}
    	}
    	cart.add(item);
    
    		

    }
    public int getOrderID() {
		return orderID;
	}

	public String getDate() {
		return date;
	}
	public double checkoutPrice() {
		
		double finalPrice=0;
		for(LineItem items:cart) {
			finalPrice = finalPrice + items.lineItemTotalCost();
		}
		return finalPrice;
	}

}
