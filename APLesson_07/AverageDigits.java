import java.util.Scanner;
public class AverageDigits
{
	public static int number, digits = 0, average = 0;
	public static void main (String args[])
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the number to find the average of its digits");
		number = kb.nextInt();
		System.out.printf("The average of the digits in %d is %d", number, avDigits());	
	}
	// Void is easier but i wanted to use a non void method for practice
	public static int avDigits()
	{
		int num = number;
		while (num > 0)
		{
			digits += 1;
			average += num % 10;
			num /= 10;
		
		}
		return average/digits;
	}
}