package com.interfaceEx;

import java.math.BigInteger;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class SBI implements Bank
{
	public float getRateOfIntrest() {
		return (float) 4.7;
	}
}
class IOB implements Bank
{
	public float getRateOfIntrest() {
		return (float) 4.9;
	}
}
public class Main {
	
	public static void main(String[] args) {
		int number=6;
		Stream.iterate(BigInteger.valueOf(2), BigInteger::nextProbablePrime).limit(number).forEach(x->System.out.println(x));
		
		System.out.println(IntStream.rangeClosed(2, number/2).noneMatch(i->number%i==0));
		
	Bank obj=null;
	obj=new SBI();
	System.out.println(obj.getRateOfIntrest());
	obj=new IOB();
	System.out.println(obj.getRateOfIntrest());
		
	}

}
