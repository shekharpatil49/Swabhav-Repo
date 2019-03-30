package com.techlab.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import com.techlab.lineitem.LineItem;

public class TestTreeMap {

	public static void main(String[] args) {

		Map<LineItem,LineItem> treemap = new TreeMap<LineItem,LineItem> (); 
		LineItem cart1 =new LineItem(1,"Book",100,2);
		LineItem cart2 = new LineItem(1,"Book",100,2);
		LineItem cart3 = new LineItem(3,"NoteBook",50,2);
		LineItem cart4 = new LineItem(4,"Bottle",50,2);
		
		treemap.put(cart1,cart1);
		treemap.put(cart2,cart2);
		
		
		treemap.put(cart3,cart3);
		treemap.put(cart4,cart4);
		System.out.println(treemap.size());
		printLineItems(treemap);
		
	}
	private static void printLineItems(Map<LineItem, LineItem> treemap) {
        for(LineItem item : treemap.values()) {
      	  System.out.println(item.getId());
        }
	}

}
