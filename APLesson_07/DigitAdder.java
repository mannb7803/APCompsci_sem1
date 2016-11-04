import java.util.Scanner;
public class DigitAdder
{
	public static int num, sum = 0, num2;
	public static void main (String args[])
	{
		Scanner kb = new Scanner(System.in); 
		System.out.println("Imput value for number you want to add up the digits of");
		num = kb.nextInt();	
		num2 = num;
		sumDigits();
		System.out.println("The sum of the digits in " + num + " is " + sum);
	}
	public static void sumDigits()
	{
		while (num2 > 0)
		{
				sum += num2 % 10;
				num2 /= 10; 
		}
	}
}