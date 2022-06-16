package com.practice;

import java.util.Scanner;

public class egThread {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		Operation obj=new Operation();
		obj.run();
		obj.increment(n);
		OperationTwo obj1=new OperationTwo();
		obj1.run();
		obj1.decremt(n);
	}

}

class Operation extends Thread
{
	public void increment(int n) throws InterruptedException
	{
		for(int i=0;i<10;i++)
		{
			Thread.sleep(1000);
			System.out.println(n);
			n++;
		}
		//System.out.println(n);
	}
}
class OperationTwo extends Thread
{
	public void decremt(int n) throws InterruptedException
	{
		for(int i=0;i<10;i++)
		{
			Thread.sleep(1000);
			System.out.println(n);
			n--;
		}
	}
}
