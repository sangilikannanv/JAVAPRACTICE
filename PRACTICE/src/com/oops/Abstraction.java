package com.oops;

abstract class Bank
{
	abstract int getRateofinterest();
}
class SBI extends Bank
{
   int getRateofinterest()
	{
		return 5;
	}
}
class IDFC extends Bank
{
	int getRateofinterest()
	{
		return 7;
	}
}

//Abstraction is a process of hiding the implementation details and showing only functionality to the user.
public class Abstraction {
	public static void main(String[] args) {
		
		Bank obj=null;
		obj=new SBI();
		System.out.println("Rate of Interest for SBI is :"+obj.getRateofinterest());
		obj=new IDFC();
		System.out.println("Rate of Interest for IDFC is :"+obj.getRateofinterest());
	}

}
