package com.techlab.intefaceCrud.test;

import com.techlab.interfaceCrud.CustomerDB;
import com.techlab.interfaceCrud.ICrudable;
import com.techlab.interfaceCrud.InvoiceDB;
import com.techlab.interfaceCrud.OrderDB;

public class TestICrudable {

	public static void main(String[] args) {
		ICrudable x;
		x = new InvoiceDB();
		doDBOperation(x);
		x = new CustomerDB();
		doDBOperation(x);
		x = new OrderDB();
		doDBOperation(x);

	}

	public static void doDBOperation(ICrudable x) {
		x.create();
		x.read();
		x.update();
		x.delete();
	}

}
