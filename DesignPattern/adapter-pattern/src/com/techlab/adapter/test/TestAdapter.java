package com.techlab.adapter.test;

import java.util.List;

import com.techlab.adapter.IQueue;
import com.techlab.adapter.QueueAdapter;

public class TestAdapter {
	
	public static void main(String args[]) {
		
		IQueue<Integer> q = new QueueAdapter();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.dqueue();
		System.out.println(q.count());;
		
		for ( Integer list:q) {
		    System.out.println(list);
		}
	}

}
