package com.techlab.storage.test;

import com.techlab.storage.File;
import com.techlab.storage.Folder;

public class TestStorage {
	
	public static void main(String args[]) {
		Folder f1 = new Folder("Movies");
		Folder f2 = new Folder("Games");
		File file1 =new File(1024,"Intersteller",".mp4");
		File file2 =new File(1024,"ABCD",".mp4");
		File file3 = new File(1024,"COD",".exe");
		File file4 = new File(1234,"DDLJ",".mp4");
		
		f1.addItem(file1);
		f1.addItem(file2);
	    f2.addItem(file3);
	    f1.addItem(f2);
	    file1.setCounter(0);
	    file2.setCounter(0);
	    file3.setCounter(1);
	    file4.setCounter(1);
	    f1.setCounter(0);
	    f2.setCounter(1);
	    
	    Folder f3 =new Folder("Action");
	    f2.addItem(f3);
	    f3.addItem(file4);
	    
	    
	    
		f1.display();
		
		
	}

}
