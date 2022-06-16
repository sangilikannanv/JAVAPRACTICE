package com.logicalprogram;

import java.util.stream.Stream;

public class Fibonacci {
	
	public static void main(String[] args) {  // 0 1 1 2 3 5 8 13 21
		int n1=0,n2=1,n3,count=5;    
		 for(int i=0;i<count;i++)    
		 {    
			 if(i<2)
			 {
				 System.out.print(i+" ");
			 }
			 else
			 {
		  n3=n1+n2;    
		  System.out.print(n3+" ");    
		  n1=n2;    
		  n2=n3;   
			 }
		 } 
		 
		
		Stream.iterate(new int[] {0,1}, p-> new int[] {p[1],p[0]+p[1]}).limit(5).map(p -> p[0]).forEach(x->System.out.print(x+" "));
		//System.out.println(value);
		
		
	}

}
