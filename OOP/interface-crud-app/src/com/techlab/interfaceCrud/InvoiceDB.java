package com.techlab.interfaceCrud;

public class InvoiceDB implements ICrudable  {

	@Override
	public void create() {
       System.out.println("Craete method of Invoice");		
	}

	@Override
	public void read() {
		System.out.println("read method of Invoice");			
	}

	@Override
	public void update() {
		System.out.println("update method of Invoice");			
	}

	@Override
	public void delete() {
		System.out.println("delete method of Invoice");			
	}

}
