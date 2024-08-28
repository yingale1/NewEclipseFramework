package Programs;

public class reverseNumber {

	public static void main(String[] args) {
		int Number = 1234;
		int rem = 0;
		int var = 0;
		

		// We have to reverse this number
		while (Number != 0) 
		{
			rem = Number % 10;
			var = var + rem;
			Number = rem / 10;

		}
		System.out.println(var);
	}
}
