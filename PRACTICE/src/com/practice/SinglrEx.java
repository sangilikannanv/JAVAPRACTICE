package com.practice;

public class SinglrEx {
	private int num=0;
	public static SinglrEx sing=new SinglrEx();
	private SinglrEx()
	{
	}
	public static SinglrEx getInstance()
	{
		return sing;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public static void main(String[] args) {
		SinglrEx obj=getInstance();
		SinglrEx obj1=getInstance();
		obj.setNum(10);
		System.out.println(obj1.getNum());
	}
}