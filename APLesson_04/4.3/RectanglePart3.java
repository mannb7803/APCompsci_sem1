import java.util.Scanner;
public class RectanglePart3
{
	public static void main (String[]args)
		{
		double l, w;
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter length");
		l = kb.nextDouble();
		System.out.println("Enter width");
		w = kb.nextDouble();
		print(calcPerim(l, w));
		
		
		
		}
	public static double calcPerim(double l, double w)
	{
		return 2*(l+w);
	}
	public static void print(double p)
	{
		System.out.printf("Your rectangle %10.4f ft around", p);
	}
	
}