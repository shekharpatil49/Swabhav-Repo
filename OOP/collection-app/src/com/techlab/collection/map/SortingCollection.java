package com.techlab.collection.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.techlab.lineitem.LineItem;

public class SortingCollection {

	public static void main(String[] args) {
		ArrayList<LineItem> cart = new ArrayList(); 
		LineItem cart1 =new LineItem(1,"Book",100,2);
		LineItem cart2 =  new LineItem(2,"PEN",10,2);
		LineItem cart3 = new LineItem(3,"NoteBook",50,2);
		LineItem cart4 = new LineItem(4,"Bottle",50,2);
		
		cart.add(cart3);
		cart.add(cart1);
		cart.add(cart4);
		cart.add(cart2);
	
		Collections.sort(cart); 
		printLineItems(cart);
		
	}
	private static void printLineItems(ArrayList<LineItem> cart) {
        for(LineItem item : cart) {
      	  System.out.println(item.getId());
        }
	}

}
