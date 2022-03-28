package com.basic.entity;

public class SingletonEx {
	
	private static SingletonEx singleton = new SingletonEx();
	
	private  int number ;
	private SingletonEx() {
		
	}
	
	public static  SingletonEx getInstance() {
		return singleton;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	
	public static void main(String[] args) {
		SingletonEx obj = getInstance();
		
		obj.setNumber(10);
		
		SingletonEx obj1 = getInstance();
		System.out.println(obj1.getNumber());
	}

}
