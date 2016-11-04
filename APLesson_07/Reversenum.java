import java.util.Scanner;
public class Reversenum{
	public static int number, num, rev = 0;
	public static void main (String args[])
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a number to be reversed!");
		number = kb.nextInt();
		num = number;
		getReverse();
		System.out.println(number + " reversed is " + rev);
	}
	public static void getReverse()
	{
		while (num > 0)
		{
			rev *= 10;
			rev += num % 10;
			num /= 10;	
		}
	}
}