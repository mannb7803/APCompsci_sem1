import java.util.Scanner;
public class Lucky7s
{
	public static void main (String args[])
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a number");
		int num = kb.nextInt();
		System.out.println(run(num));
		
	}
	public static int run(int num)
	{
		if (num > 0)
		{
			if (num % 10 == 7)
			{
				return 1 + run(num/10);
			}
			else
			{
				return 0 + run(num/10);
			}
		}
		else 
		{
			return 0;
		}
	
	}
}