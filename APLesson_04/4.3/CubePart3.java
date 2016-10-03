import java.util.Scanner;
public class CubePart3
{
	public static void main (String args [])
	{
		Scanner kb = new Scanner(System.in);
		double s;
		System.out.println("Enter the length of a side");
		s = kb.nextDouble();
		print(s,calcsurf(s));
	}
	public static double calcsurf(double s)
	{
		return (s*s)*6;
	}
	public static void print(double a, double sa)
	{
		System.out.printf("The surface area of a cube whose sides are %5.4f in length is %5.4f", a, sa);
		
	}
	
}