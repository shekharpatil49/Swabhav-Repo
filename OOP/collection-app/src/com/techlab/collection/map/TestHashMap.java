package com.techlab.collection.map;

import java.util.HashMap;
import java.util.Map;

import com.techlab.lineitem.LineItem;

public class TestHashMap {

	public static void main(String[] args) {
        Map<LineItem,LineItem> hashmap = new HashMap<LineItem,LineItem> (); 
		LineItem cart1 =new LineItem(1,"Book",100,2);
		LineItem cart2 =  new LineItem(2,"PEN",10,2);
		LineItem cart3 = new LineItem(3,"NoteBook",50,2);
		LineItem cart4 = new LineItem(4,"Bottle",50,2);
		hashmap.put(cart1,cart1);
		hashmap.put(cart2,cart2);
		hashmap.put(cart3,cart3);
		hashmap.put(cart4,cart4);
		System.out.println(hashmap.size());
		printLineItems(hashmap);
	}

	private static void printLineItems(Map<LineItem, LineItem> hashmap) {
          for(LineItem item : hashmap.values()) {
        	  System.out.println(item.getId());
          }
	}

}
