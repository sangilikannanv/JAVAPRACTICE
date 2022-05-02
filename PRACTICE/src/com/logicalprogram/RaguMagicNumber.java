package com.logicalprogram;

public class RaguMagicNumber {

	public static void main(String[] args) {
		int a=18;
		
		int result = getMagic(a);
		if(result>1) {
			System.out.println("Not magic number");
		}else {
			System.out.println("Magic Number");
		}
		
	}
	
	
//	public static int getNumber(int number) {
//		number =getMagic(number); 
//		if((""+number).length()>1) {
//			return getNumber(number);
//		}else {
//			return number;
//		}
//	}
	
	public static int getMagic(int  num) {
		int sum=0;
		while(num>0) {
			int rem= num%10;
			sum+=rem;
			num/=10;
		}
		
		if((""+sum).length()>1) {
			return getMagic(num);
		}
		
		return sum;
	}
}
