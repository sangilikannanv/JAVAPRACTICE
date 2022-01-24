package com.practice;

public class Constructor {
	Constructor()
	{
		System.out.println("Default Constructor :");
	}
	Constructor(String name)
	{
		System.out.println("Parameter Constructor : "+name);
	}

	public static void main(String[] args) {
		
		Constructor obj1=new Constructor();		
		Constructor obj2=new Constructor("Virat");
		
	}
}

