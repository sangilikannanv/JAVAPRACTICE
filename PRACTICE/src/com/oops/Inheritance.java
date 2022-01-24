package com.oops;

class A
{
	static void text()
	{
		System.out.println("text");
	}
}
class B extends A
{
	static void write()
	{
		System.out.println("write");
		A.text();
	}
	//A.text();
}
class C extends B
{
	void print()
	{
		System.out.println("print");
		B.write();
	}
}
public class Inheritance {
	
	public static void main(String[] args) {
		
	C obj=new C();
	obj.print();
	}

}
