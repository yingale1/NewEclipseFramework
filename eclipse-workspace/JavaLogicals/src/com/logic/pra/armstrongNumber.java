package com.logic.pra;a

public class armstrongNumber {

	public static void main(String[] args) 
	{
		int Number=153;
		
		int count=0;
		int rem=0;
		while(Number!=0)
		{
		Number=Number/10;
		count++;
		
		}
		
		System.out.println(count);

	}

}
