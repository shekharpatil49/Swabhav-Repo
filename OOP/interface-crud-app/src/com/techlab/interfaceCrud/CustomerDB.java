package com.techlab.interfaceCrud;

public class CustomerDB implements ICrudable {

	@Override
	public void create() {
		System.out.println("Craete method of Customer");
	}

	@Override
	public void read() {
		System.out.println("read method of Customer");

	}

	@Override
	public void update() {
		System.out.println("update method of Customer");
	}

	@Override
	public void delete() {
		System.out.println("delete method of Customer");
	}

}
