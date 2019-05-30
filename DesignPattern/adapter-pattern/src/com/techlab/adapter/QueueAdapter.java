package com.techlab.adapter;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class QueueAdapter<T> implements IQueue<T> ,Iterable<T> {

	private LinkedList <T> list;
	
	public QueueAdapter() {
	
		this.list = new LinkedList<T>();
	}

	@Override
	public void enqueue(T item) {
		list.addLast(item);
		
	}

	@Override
	public void dqueue() {
		
		list.removeFirst();
	}

	@Override
	public int count() {
		
		return list.size();
	}


	@Override
	public Iterator<T> iterator() {
		return list.iterator();
	}



}
