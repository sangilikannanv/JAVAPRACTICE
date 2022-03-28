package com.superthiskeyword;

public class ThisEx {
	public static void main(String[] args) {
		
		Animal obj=new Animal(6,"dog");
		obj.print();
		
	}

}
class Animal    //this: to refer current class instance variable
{
	int id;
	String name;
	
	Animal(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	void print()
	{
		System.out.println("Id : "+id+" Name :"+name);
	}
}