import java.util.Scanner;
public class EX_04
{
	public static Scanner kb = new Scanner(System.in);
	public static int count = 0;
	public static int [][] nums = new int [4][4];
	public static void main (String args[])
	{
		for(int i = 0; i < nums.length; i++)
		{
			for (int n = 0; n < nums.length; n++)
			{
				nums[i][n] = (int)(Math.random() * 100 + 1);
				System.out.print(nums[i][n] + " ");
			}
			System.out.println();
		}
		System.out.println("Please enter a divisor");
		int d = kb.nextInt();
		for(int i = 0; i < nums.length; i++)
		{
			for (int n = 0; n < nums.length; n++)
			{
				if(nums[i][n] % d == 0)
				{
				count += 1;
				}
			}
		}
		System.out.println("There are " + count + " numbers divisible by " + d + " in the Array");
	}
}