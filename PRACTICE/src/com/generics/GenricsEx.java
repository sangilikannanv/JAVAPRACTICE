package com.generics;

import java.util.ArrayList;

public class GenricsEx {
	
	public static void main(String[] args) {
		
		PrinterEx testx=new PrinterEx(78.0);
		testx.print();
//		Printer<Integer> testy=new Printer(23);
//		testy.print();
//		Printer<Double> testz=new Printer(23.7);
//		testz.print();
		
		ArrayList<Cat> catList=new ArrayList<>();
		
		
		
	}

}
class PrinterEx<T> {
	
	T count;
	
	public PrinterEx(T count)
	{
		this.count=count;
	}
	
	public void print()
	{
		System.out.println(count);
	}

}