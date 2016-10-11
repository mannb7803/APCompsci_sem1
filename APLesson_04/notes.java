import java.util.Scanner;
public class notes
{
	public static void main (String args[])
	{
	Scanner kb = new Scanner(System.in);
	System.out.println("Enter an int to be added to 5");
		int x = kb.nextInt();
		print(run(x));
	}
	public static int run(int x)
	{
		return 5 + x;
	}
	public static void print(int print)
	{
		System.out.println("The number plus 5 is " + print);
	}
}