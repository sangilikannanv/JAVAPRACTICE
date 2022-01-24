package com.practice;

public class DifferentEqualsExample {
	public static void main(String[] args) {
		
		String name="Sachine";
		String name1=new String("Sachine");
		String name2="Sachine";
		if(name.equals(name1))   //Check word only
		{
			System.out.println("equals");
		}
		if(name==name1)  //check address of the location
		{
			System.out.println("......==");
		}
		if(name==name2)  //check address of the  location
		{
			System.out.println("==");
		}
	}

}
