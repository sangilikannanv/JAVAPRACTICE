package com.superthiskeyword;

public class ThrowandThrows {
	
	
	public static void main(String[] args) {
		try
		{
			Business.divide();
		}
		catch(ArithmeticException e)
		{
			System.out.println("From Main method");
		}
		
	}

}
class Business
{
	static int a=40;
	static int b=-3;
	public static void divide() throws ArithmeticException
	{
		try
		{
		if(a>b)
		{
			System.out.println("Inside Divide method");
			throw new ArithmeticException("negative");
		}
		}
		catch(ArithmeticException e)
		{
			System.out.println("From Main method&");
		}
	}
}