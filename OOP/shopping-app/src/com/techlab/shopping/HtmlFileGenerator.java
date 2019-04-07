package com.techlab.shopping;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class HtmlFileGenerator {

	private List<Order> orders=new LinkedList();
	private List<LineItem> lineitems= new LinkedList();
	private Customer customer;
	FileReader fr;
	FileWriter fw;
	File f;
	PrintWriter pw;

	public void generateHtmlFile(Customer customer, List<LineItem>
	lineitems, List<Order> orders, Order o) throws IOException {
		f = new File("/Users/shekhar/Desktop/abcd.html");
		fw = new FileWriter(f, false);
		pw = new PrintWriter(fw);
		
		String str ="";
		for(LineItem order1:lineitems) {
		str = str + "Product Name : "
		+order1.getP().getName()+", Quantity:"
				+ ""+order1.getQuantity()+", Price with Discount: " +
		order1.lineItemTotalCost()+"<br>";
		}
		pw.println("Customer Name: "+customer.getName()+", Customer Address: "+
		customer.getAddress()+"<br> <br>"+ str + "<br>Checkout Price: "+o.checkoutPrice());
		pw.close();
		
	}
}
