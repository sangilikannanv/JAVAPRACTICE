package com.generics;

public class Printer<T> {
	
	T count;
	
	public Printer(T count)
	{
		this.count=count;
	}
	
	public void print()
	{
		System.out.println(count);
	}

}
