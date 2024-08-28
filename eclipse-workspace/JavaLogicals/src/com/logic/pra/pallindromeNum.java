package Programs;

public class pallindromeNum {

	public static void main(String[] args) 
	{
		int Number=1221;
		//We have to store original number to compare
		int OrgNo=Number;
		
		int rem=0;
		int var=0;
		while(Number!=0)
		{
			rem=Number%10;
			var=var*10+rem;
			Number=Number/10;
		}
		System.out.println(var);
		System.out.println(OrgNo);
		System.out.println(OrgNo==var);
		if (OrgNo==var)
		{
			System.out.println("Number is Pallindrome");
		}

	}

}
