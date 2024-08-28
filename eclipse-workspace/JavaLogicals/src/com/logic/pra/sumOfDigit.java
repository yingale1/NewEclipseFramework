package Programs;

public class sumOfDigit {

	public static void main(String[] args) 
	{
		// Calculate sum of digit of below number
		
		int number=12345;
		int sum=0;
		int num=0;
		int rem=0;
		
		while(number!=0)
		{
			rem=number/10;
			sum=sum+rem;
			number=number/10;
			System.out.println(sum);
		}
		

	}

}
