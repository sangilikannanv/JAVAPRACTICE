package com.logicalprogram;

import java.util.Scanner;

public class MagicalNumber {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		//String str=sc.nextLine();   
		String str="19";
		System.out.println(magic(Integer.parseInt(str)));   //if( ((number - 1) % 9) == 0) 
		
	}
	public static boolean magic(int n)
	{
		boolean flag=false;
		int temp=0;
		int sum=0;
		System.out.println("Length : "+String.valueOf(n).length());
		if(n==1 && String.valueOf(n).length()==1)
		{
		  flag=true;
		}
		else if(n!=1 && String.valueOf(n).length()==1)
		{
			flag=false;
		}
		else
		{
			while(n!=0)
			{
			temp=n%10;
			sum+=Math.pow(temp,2);
			n/=10;
			}
			System.out.println("temp : "+temp+" sum : "+sum+" n : "+n);
			System.out.println("^^^ : "+String.valueOf(sum).length());
			if(sum!=1)
			{
				return 	magic(sum);
			}
			else
			{
				return true;
			}
		}
		return flag;
	}
}
