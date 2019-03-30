package com.techlab.lineitem.test;

import java.util.ArrayList;

import com.techlab.lineitem.LineItem;

public class TestGenericItem {
	
	public static void main(String[] args) {
	     ArrayList<LineItem> cart = new ArrayList<LineItem>(); 
	     cart.add(new LineItem(1,"Book",100,2));
	     cart.add(new LineItem(1,"PEN",10,2));
	     cart.add(new LineItem(1,"NoteBook",50,2));
	     cart.add(new LineItem(1,"Bottle",50,2));
	    // cart.add("Shekhar");
	     
	     for(LineItem ele:cart) {
	    	 System.out.println(ele.calculateTotal());
	     }
		}

}
