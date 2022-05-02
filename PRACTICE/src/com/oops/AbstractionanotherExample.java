package com.oops;

interface Shape
{
	abstract void  circle();
	void rectangle();
	
}
abstract class Circle implements Shape
{
	
	public void circle()
	{
		System.out.println("Circle");
	}
}
class Rectangle extends Circle
{
	
	public void rectangle() {
		System.out.println("Rectangle");
	}
}
public class AbstractionanotherExample {
	public static void main(String[] args) {
		
	Rectangle obj=new Rectangle();
	obj.circle();
	obj.rectangle();
}

}
