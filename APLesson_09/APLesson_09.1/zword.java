import java.util.Scanner;
public class zword
{
	public static Scanner kb = new Scanner(System.in);
	public static String [] array = new String [5];
	public static void main (String args[])
	{
		System.out.println("Please enter 5 words seperated by an enter");
		fillArray();
		printArray();
		ZzZ();
	}
	public static void fillArray()
	{
		for (int i = 0; i < array.length; i ++)
		{
			array[i] = kb.nextLine();
		}
	}
	public static void printArray()
	{
		System.out.print("For the words");
		for (String a : array)
		{
			System.out.print(" " + a);
		}
	}
	public static void ZzZ()
	{
		System.out.print("\nOnly");
		for (String a : array)
		{
			if (a.indexOf("z") != -1)
			{
				System.out.print(" " + a);
			}
		}
		System.out.print(" contains the letter z");
	}
}