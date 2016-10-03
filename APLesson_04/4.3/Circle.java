import java.util.Scanner;
public class Circle
{
public static void main (String args[])
	{
			double r;
			Scanner kb = new Scanner(System.in);
			System.out.println("Please enter the radius of a circle");
			r = kb.nextDouble();
			print(r, calcArea(r));
			
			
	}
	public static double calcArea(double r)
	{
		return (r*r) * 3.14;
	}
	public static void print(double r, double a)
	{
		System.out.printf("The area of a circle with a radius of %5.4f is %5.4f.", r, a);
	}
}