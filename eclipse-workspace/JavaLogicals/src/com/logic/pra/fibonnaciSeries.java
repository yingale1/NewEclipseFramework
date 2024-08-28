package com.logic.pra;

public class fibonnaciSeries {

	public static void main(String[] args) 
	{
		// fibonnaci series- 11234567

		int n = 10;
		int i;
		int first_term=0;
		int second_term=1;
		int next_term;
		for (i = 1; i <= n; i++) 
		{
			next_term=first_term+second_term;
			first_term=second_term;
			second_term=next_term;
			System.out.println(first_term);
			
		}

	}

}
