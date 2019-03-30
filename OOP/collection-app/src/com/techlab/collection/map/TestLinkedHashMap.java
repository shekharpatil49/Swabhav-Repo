package com.techlab.collection.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import com.techlab.lineitem.LineItem;

public class TestLinkedHashMap {

	public static void main(String[] args) {

		Map<LineItem,LineItem> linkedHashMap = new LinkedHashMap<LineItem,LineItem> (); 
		LineItem cart1 =new LineItem(1,"Book",100,2);
		LineItem cart2 = new LineItem(1,"Book",100,2); 
		LineItem cart3 = new LineItem(3,"NoteBook",50,2);
		LineItem cart4 = new LineItem(4,"Bottle",50,2);
		
		linkedHashMap .put(cart1,cart1);
		linkedHashMap .put(cart2,cart2);
		linkedHashMap .put(cart3,cart3);
		linkedHashMap .put(cart4,cart4);
		System.out.println(linkedHashMap.size());
		printLineItems(linkedHashMap);
	}

	private static void printLineItems(Map<LineItem, LineItem> linkedHashMap) {
		for(LineItem item : linkedHashMap.values()) {
	      	  System.out.println(item.getId());
	        }
		
	}

}
