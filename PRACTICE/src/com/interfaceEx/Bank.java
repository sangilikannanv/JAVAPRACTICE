package com.interfaceEx;

public interface Bank {
	
	public float getRateOfIntrest();
	
	default  int add()
	{
		return 0;
	}
	static int addq()
	{
		return 0;
	}

}
