package com.practice;

public class SingletonEx {
	
	static SingletonEx ref=null;
	
	private SingletonEx()
	{
		
	}
	static SingletonEx getInstance()
	{
		if(ref==null)
		{
			 ref=new SingletonEx();
		}
		return ref;
		
	}

}
class MainDriver
{
	public static void main(String[] args) {
		SingletonEx.getInstance();
	}
}
