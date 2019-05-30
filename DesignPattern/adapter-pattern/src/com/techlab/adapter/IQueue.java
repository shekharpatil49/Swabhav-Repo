package com.techlab.adapter;

public interface IQueue<T> extends Iterable<T>{

	public void enqueue(T item);

	public void dqueue();

	public int count();

}
