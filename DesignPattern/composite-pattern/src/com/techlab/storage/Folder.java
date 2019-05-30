package com.techlab.storage;

import java.util.ArrayList;
import java.util.List;

public class Folder implements IStorageItem {
	private  int spaces = 0;
	private String name;
	private List<IStorageItem> items = new ArrayList();
	private int  counter =0;

	public Folder(String name) {
		this.name = name;
	}

	public Folder() {
	}

	public void addItem(IStorageItem item) {
		items.add(item);
	}
	public void setCounter(int counter) {
		this.counter=counter;
	}
	@Override
	public void display() {
		
		
		if (counter == 1) {
			spaces=8;
			System.out.println("");
			for (int i = 0; i < spaces*counter; i++) {
				System.out.print(" ");
			}
			System.out.print(name);
			return;
		} 

		if (counter == 2) {
			spaces=8;
			System.out.println("");
			for (int i = 0; i < spaces*counter; i++) {
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
			if (item instanceof Folder) {
				item.display();
				return;

			}
			if (item instanceof File) {
				item.display();
			}

		}

	}

}
