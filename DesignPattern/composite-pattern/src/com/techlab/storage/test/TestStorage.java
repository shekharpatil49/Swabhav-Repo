package com.techlab.storage.test;

import com.techlab.storage.File;
import com.techlab.storage.Folder;

public class TestStorage {
	
	public static void main(String args[]) {
		Folder f1 = new Folder("Movies");
		Folder f2 = new Folder("Games");
		f1.addItem(new File(1024,"Intersteller",".mp4"));
		f1.addItem(new File(1024,"ABCD",".mp4"));
		f2.addItem(new File(1024,"COD",".exe"));
	    f1.addItem(f2);
	    f2.addItem(new Folder("Action"));
		f1.display();
		
		
	}

}
