package com.practice;

public class BuilderVsBuffer {
	
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();  
		//StringBuffer is synchronized i.e. thread safe. It means two threads can't call the methods of StringBuffer simultaneously.
		//StringBuffer is less efficient than StringBuilder.
		//StringBuffer was introduced in Java 1.0
        StringBuffer sb = new StringBuffer("Java");  
        for (int i=0; i<10000; i++){  
            sb.append("Tpoint");  
        }  
        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");  
        
        startTime = System.currentTimeMillis();  
        
        // StringBuilder is non-synchronized i.e. not thread safe. It means two threads can call the methods of StringBuilder simultaneously.
        // StringBuilder is more efficient than StringBuffer.
        // StringBuilder was introduced in Java 1.5
        
        StringBuilder sb2 = new StringBuilder("Java");  
        for (int i=0; i<10000; i++){  
            sb2.append("Tpoint");  
        }  
        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");  
    }  

}
