package com.practice;

public class HCLArray {
	
	public static void main(String[] args) {
		
		int[] a={1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0};
		
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++)
			{
				if(a[j]==0)
				{
					for(int k=j;k<a.length;k++)
					{
						if(a[k]!=0)
						{
							temp=a[j];
							a[j]=a[k];
							a[k]=temp;
							break;
						}
					}
				}
			}
		}
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}

}
