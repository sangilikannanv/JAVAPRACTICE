package com.logicalprogram;

public class ArmstrongNumber {
	
	public static void main(String[] args) {
		
		int n=1634;
		int stratingValue=n;
		int fixvale=(int)(String.valueOf(n).length());
		int sum=0,temp;
		while(n!=0)
		{
			temp=n%10;
			sum+=Math.pow(temp,fixvale);
			n=n/10;
		}
		if(sum==stratingValue)
		{
			System.out.println("Armstrong Number");
		}

}
}
