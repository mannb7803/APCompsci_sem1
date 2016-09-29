import java.util.Scanner;
public class cube
{
	public static double s, sa;
	public static void main (String args[])
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the length of a side");
		s = kb.nextDouble();	
		calcSurf();
		print();
	}
	public static void calcSurf()
	{
		sa = (s*s) * 6;
	}
	public static void print()
	{
		System.out.printf("The surface area of a cube with %5.1f sides is %5.4f", s, sa);
	}
}