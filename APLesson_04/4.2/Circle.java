import java.util.Scanner;
public class Circle
{
	public static double a, r;
	public static void main (String args[])
	{
	Scanner kb = new Scanner(System.in);
		System.out.println("Pleas enter radius");
		r = kb.nextDouble();
		calcArea();
		print();
	}
	public static void calcArea()
	{
		a = (r*r) * 3.14;
	}
	public static void print()
	{
		System.out.printf("The area of a circle with a radius of %5.1f is %5.4f", r, a);
	}
}