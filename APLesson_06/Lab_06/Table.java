import java.util.Scanner;
public class Table
{
	public static int imput, ts;
	public static void main (String args[])
	{
		Scanner kb = new Scanner(System.in); // i have typed this line so many tims so far this year that i'm starting to dream of kbs and system.ins
		System.out.println("Please enter table size");
		ts = kb.nextInt();
		System.out.println("Please enter a number for the table");
		imput = kb.nextInt();
		System.out.println("  x\t   y\n----------");
		for (int i = 1; i <= ts; i++)
		{
			System.out.printf("%3d | %3d\n", i, (i*imput));
		}
		System.out.println("y = x times " + imput);
	}	
}