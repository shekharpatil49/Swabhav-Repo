package com.techlab.storage;

public class File implements IStorageItem{

	private float size;
	private String name;
	private String extension;
	private static int spaces=0;
	private int  counter =0;
	
	
	public File(float size, String name, String extension) {
		this.size = size;
		this.name = name;
		this.extension = extension;
	
	}
	public void setCounter(int counter) {
		this.counter=counter;
	}
	
	
	@Override
	public void display() {
		if(counter==0) {
			spaces=8;
		}
		if(counter==1) {
			spaces=16;
		}
		System.out.println("");
		for(int i=0;i<spaces;i++) {
			System.out.print(" ");
		}
		System.out.print("----> "+name+""+extension+" size "+size);
		counter=0;
	}
     
}
