package com.techlab.srp.solution;

public class InvoiceConsolePrinter {
	
	private Invoice invoice;
	public InvoiceConsolePrinter(Invoice invoice) {
		this.invoice=invoice;
	}
	public void print() {
		System.out.println("ID "+invoice.getId());
		System.out.println("Name "+invoice.getName());
		System.out.println("Final Cost :"+invoice.finalCost() );
	}

}
