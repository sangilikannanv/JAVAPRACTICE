package com.innerClass;

public class InnerClassExample {
	
	public static void main(String[] args) {
		
		Outerclass objOuter=new Outerclass();
		objOuter.printOuterClass();
		
		Outerclass.Innerclass objInner=objOuter.new Innerclass();
		//Outerclass.Innerclass objInner=new Outerclass.Innerclass();  // static inner class
		objInner.printInnerclass();
	}

}
