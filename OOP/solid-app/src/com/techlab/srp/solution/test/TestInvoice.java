package com.techlab.srp.solution.test;

import com.techlab.srp.solution.Invoice;
import com.techlab.srp.solution.InvoiceConsolePrinter;


public class TestInvoice {
	
	public static void main(String args[]) {
		Invoice invoice = new Invoice(1,"Peanut Butter",100,10);
		InvoiceConsolePrinter icp = new InvoiceConsolePrinter(invoice);
		icp.print();
	}

}
