package com.practice;

public class EandYspaceSplit {
	public static void main(String[] args) {
		
		String s="a good  example";
		String[] arr=s.trim().split(" ",0);
        String str="";
        for(int i=arr.length-1;i>=0;i--)
        {
            if(i==0 || arr.length==1)
                 str+=arr[i];
            else
                 str+=arr[i]+" ";
        }
        System.out.println(str);
	}

}
