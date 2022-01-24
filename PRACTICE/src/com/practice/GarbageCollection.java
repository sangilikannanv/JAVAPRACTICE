package com.practice;

public class GarbageCollection {
	public void finalize() {
		System.out.println("Garbage Collected");
		
	}
	public static void main(String[] args) {
		
		Test obj=new Test();
		obj=null;
		System.gc();
		//System.out.println(obj.sum(3, 4));
		
	}
}
class Test
{
	public int sum(int a,int b)
	{
		return (a+b);
	}
}