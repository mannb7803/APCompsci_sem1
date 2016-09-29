import java.util.Scanner;
public class Rectangle
{
	static double l, w, p;
	public static void main (String[]args)
		{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter length");
		l = kb.nextDouble();
		System.out.println("Enter width");
		w = kb.nextDouble();
		calcPerim();
		print();
		
		
		
		}
	public static void calcPerim()
	{
		p = l*w;
	}
	public static void print()
	{
		System.out.printf("Your rectangle %10.4f", p);
	}
	
}