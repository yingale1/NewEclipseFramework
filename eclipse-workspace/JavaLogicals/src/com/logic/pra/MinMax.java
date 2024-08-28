package com.logic.pra;

public class MinMax {

	public static void main(String[] args) 
	{
		int arr[]= {10,20,50,60,30,40,};
		
		//We have to find Minimum and Maximum Number in a given Array
		int min=arr[0];
		int max=arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			if(min<arr[i])
			{
				System.out.println("Minimum no is"+arr[i]);
			}
			
		}
		
		for(int i=1;i<arr.length;i++)
		{
			if(min>arr[i])
			{
				System.out.println("Maximum no is"+arr[i]);
			}
		}
		

	}

}
