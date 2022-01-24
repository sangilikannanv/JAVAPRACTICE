package com.logicalprogram;

import java.math.BigInteger;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeNumbers {
	
	public static boolean isPrime(int number) {
	    return IntStream.rangeClosed(2, number/2).noneMatch(i -> number%i == 0);
	}
	public static boolean isPrimeNumber(int n) {  
	       if (n <= 1) {  
	           return false;  
	       }  
	       for (int i = 2; i < Math.sqrt(n); i++) {  
	           if (n % i == 0) {  
	               return false;  
	           }  
	       }  
	       return true;  
	   }
	
	public static void main(String[] args) {
		
		System.out.println(isPrime(5));
		
		System.out.println(isPrimeNumber(5));
		
		Stream.iterate(BigInteger.valueOf(2), BigInteger::nextProbablePrime)
				.limit(5)
				.forEach(x -> System.out.format("%s\t", x));
		
		System.out.println();
		System.out.println("Normal Logic");
		  int n=1;
	      int status = 1;
	      int num = 3;
	      System.out.println("First "+n+" prime numbers are:");   
	      System.out.print(2+" ");
	      for ( int i = 2 ; i <=n ;  )
	      {
	         for ( int j = 2 ; j <= Math.sqrt(num) ; j++ )
	         {
	            if ( num%j == 0 )
	            {
	               status = 0;
	               break;
	            }
	         }
	         if ( status != 0 )
	         {
	            System.out.print(num+" ");
	            i++;
	         }
	         status = 1;
	         num++;
	      }         
		
		
	}

}
