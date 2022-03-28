package com.practice;

public class ContinueBreakEx {
	
	public static void main(String[] args) {
		
		
		
		for(int i=0;i<15;i++)
		{
			if(i<7)
			{
				System.out.println(i);
				continue;
			}
			if(i==8)
			{
				System.out.println(i);
				break;
			}
			System.out.println("End");
		}
	}

}
