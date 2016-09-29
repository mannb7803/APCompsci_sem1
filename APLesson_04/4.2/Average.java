import java.util.Scanner;
public class Average
{
	public static double n1, n2, n3, a;
	public static void main (String args[])
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter number 1");
		n1 = kb.nextDouble();
		System.out.println("Enter number 2");
		n2 = kb.nextDouble();
		System.out.println("Enter number 3");
		n3 = kb.nextDouble();
		average();
		print();
		
	}
	public static void average()
	{
		a = (n1 + n2 + n3) /3;
	}
	public static void print()
	{
		System.out.printf("The average of %2.1f, %2.1f, and %2.1f is %2.4f", n1, n2, n3, a);
	}
}
