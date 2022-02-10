package com.innerClass;

public class Outerclass {
	
	int regNo;
	public void printOuterClass()
	{
		System.out.println("printOuterClass");
		
		class InnerLocalclass
		{
			String keyword="Hey this is localinnerclass";
			public void printInnerLocalclass()
			{
				System.out.println(keyword);
			}
		}
		InnerLocalclass bn=new InnerLocalclass();
		bn.printInnerLocalclass();
	}
	
	//public static class Innerclass
	public class Innerclass
	{
		int serialNo;
		public void printInnerclass()
		{
			System.out.println("printInnerclass");
		}
	}

}
