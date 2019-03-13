package com.techlab.interfaceCrud;

public class OrderDB implements ICrudable {

	@Override
	public void create() {
		System.out.println("create method of Order");
	}

	@Override
	public void read() {
		System.out.println("read method of Order");
	}

	@Override
	public void update() {
		System.out.println("update method of Order");
	}

	@Override
	public void delete() {
		System.out.println("delete method of Order");
	}

}
