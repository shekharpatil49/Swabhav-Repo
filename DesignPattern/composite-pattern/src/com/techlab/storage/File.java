package com.techlab.storage;

public class File implements IStorageItem{

	private float size;
	private String name;
	private String extension;
	private static int spaces=0;
	
	
	public File(float size, String name, String extension) {
		this.size = size;
		this.name = name;
		this.extension = extension;
	}
	
	@Override
	public void display() {
		System.out.println("");
		for(int i=0;i<8;i++) {
			System.out.print(" ");
		}
		System.out.print("----> "+name+""+extension+" size "+size);
		
	}

}
