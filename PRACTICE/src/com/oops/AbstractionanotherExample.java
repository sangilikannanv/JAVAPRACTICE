package com.oops;

interface Shape
{
	int a=10;
	void circle();
	void rectangle();
	
}
abstract class Circle implements Shape
{
	
	int b;
	public void circle()
	{
		System.out.println("Circle");
	}
	public void setB(int b) {
		this.b=b+a;
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
	obj.setB(10);;
	obj.b=10;
	obj.rectangle();
}

}
