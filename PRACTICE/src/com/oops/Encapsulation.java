package com.oops;


class Student
{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
//Encapsulation allows us to protect the data stored in a class from system-wide access
public class Encapsulation {
	
	public static void main(String[] args) {
		Student stuObj=new Student();
		stuObj.setName("Dhoni");
		
		
		System.out.println(stuObj.getName());
	}

}
