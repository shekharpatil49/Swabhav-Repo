package com.techlab.lineitem.test;

import java.util.ArrayList;

import com.techlab.lineitem.LineItem;

public class TestLineItem {

	public static void main(String[] args) {
     ArrayList cart = new ArrayList(); 
     cart.add(new LineItem(1,"Book",100,2));
     cart.add(new LineItem(1,"PEN",10,2));
     cart.add(new LineItem(1,"NoteBook",50,2));
     cart.add(new LineItem(1,"Bottle",50,2));
     cart.add("Shekhar");
     
     for(Object ele:cart) {
    	 System.out.println(((LineItem) ele).calculateTotal());
     }
	}
	

}
