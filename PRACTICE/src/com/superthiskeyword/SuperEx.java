package com.superthiskeyword;

public class SuperEx {
	
	public static void main(String[] args) {
		C obj=new C();
		
		
	}
}

class A
{
	void print()
	{
		System.out.println("A print");
	}
	A()
	{
		//by default constructor contains super keyword
		System.out.println("From A");
	}
}
class B extends A
{
	void print()
	{
		super.print();
		System.out.println("B print");
	}
	B()
	{
		System.out.println("From B");
	}
}
class C extends B
{
	void print()
	{
		System.out.println("C print");
	}
	C()
	{
		super.print();
		System.out.println("From C");
	}
}
