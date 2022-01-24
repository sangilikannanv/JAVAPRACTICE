package com.oops;

//Polymorphism refers to the ability to perform a certain action in different ways. 
//In Java, polymorphism can take two forms: method overloading and method overriding.
class MethodOverloading
{
	static int add(int a,int b)
	{
		return a+b;
	}
	static int add(int a,int b,int c)
	{
		return a+b+c;
	}
}
 class MethodOverriding
 {
	    void print()
		{
			System.out.println("AAA");
		}
 }
 class subOne extends MethodOverriding
 {
	   void print()
		{
			System.out.println("AAA");
		}
 }
 class subTwo extends MethodOverriding
 {
	    void print()
		{
			System.out.println("BBB");
		}
 }

public class Polymorphism {
	public static void main(String[] args) {
		System.out.println(MethodOverloading.add(2, 3));
		System.out.println(MethodOverloading.add(2, 3, 4));
		
		MethodOverriding mor;
		mor=new subOne();
		mor.print();
		mor=new subTwo();
		mor.print();
	}

}
