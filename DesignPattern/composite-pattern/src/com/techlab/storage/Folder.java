package com.techlab.storage;

import java.util.ArrayList;
import java.util.List;

public class Folder implements IStorageItem {
	private static int spaces = 0;
	private String name;
	private List<IStorageItem> items = new ArrayList();

	public Folder(String name) {
		this.name = name;
	}

	public void addItem(IStorageItem item) {
		items.add(item);
	}

	@Override
	public void display() {
		if(spaces==8) {
			System.out.println("");
			for(int i=0;i<8;i++) {
				System.out.print(" ");
			}
			System.out.print(name);
		}
		else {
		System.out.println("");
		System.out.print("");
		System.out.print(name);
		}
		for (IStorageItem item : items) {
            if(item instanceof Folder) {
            	spaces=8;
            	item.display();
            }
            else {
            	item.display();
            }
			

		}
      
	}

}
