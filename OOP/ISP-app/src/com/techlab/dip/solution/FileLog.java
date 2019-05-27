package com.techlab.dip.solution;

public class FileLog implements ILog {

	@Override
	public void log(String error) {
		System.out.println(""+error + " error is loged in File");
	}
}
