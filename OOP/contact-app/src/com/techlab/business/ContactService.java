package com.techlab.business;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ContactService {

	private File f;
	private BufferedReader br;
	private BufferedWriter bw;
	private FileWriter fw ;
	private FileReader fr;
	PrintWriter pw;
    private int counter=0;
    String ss;
    String sc;
	public String[] displayContact() throws IOException {
		fr = new FileReader("/Users/shekhar/Desktop/contacts.csv");
		br = new BufferedReader(fr);
		int i=0;
		String line = br.readLine();
		String[] ss = new String[counter];
		while(line!=null) {
			ss[i++] = line;
			sc=sc+line;
			line = br.readLine();
		}
		br.close();
		return ss;
	}
	
	public void sizeOfString() throws IOException {
		fr = new FileReader("/Users/shekhar/Desktop/contacts.csv");
		br = new BufferedReader(fr);
		String ss = br.readLine();
		while(ss!=null) {
			counter++;
			ss=br.readLine();
		}
		
	}

	public String search(String name) {
		if(sc.contains(name)) {
			return name;
		}
		return "Not Found";
	}


	public void addContact(String data) throws IOException {
	    pw = new PrintWriter(fw);
        pw.println(data);
        pw.close();
	}

}
