package com.techlab.business.test;

import java.io.IOException;
import java.util.Scanner;

import com.techlab.business.ContactService;

public class ContactConsole {

	public static void main(String[] args) throws IOException {
     ContactService service = new ContactService();
    /* System.out.println("Enter Contact Details");
     Scanner sc = new Scanner(System.in);
     String data = sc.nextLine();
     service.addContact(data);*/
     service.sizeOfString();
     for(String str : service.displayContact())
     System.out.println(str);
       String result=service.search("RAM");
       System.out.println(result);
       
     
	}

}
