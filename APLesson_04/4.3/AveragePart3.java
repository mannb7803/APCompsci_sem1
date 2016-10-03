import java.util.Scanner;
public class AveragePart3
{
	public static void main (String args[])
	{
		double n1, n2, n3;
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter number 1");
		n1 = kb.nextDouble();
		System.out.println("Enter number 2");
		n2 = kb.nextDouble();
		System.out.println("Enter number 3");
		n3 = kb.nextDouble();
		print(n1, n2, n3, average(n1, n2, n3));
		
	}
	public static double average(double n1, double n2, double n3)
	{
		return (n1 + n2 + n3)/3;
	}
	public static void print(double n1, double n2, double n3, double a)
	{
		System.out.printf("The average of %5.1f, %5.1f, and %5.1f is %5.4f", n1, n2, n3, a);
	}
}
