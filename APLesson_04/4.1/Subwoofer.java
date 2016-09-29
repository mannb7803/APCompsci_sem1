import java.util.Scanner;
public class Subwoofer
{
	public static void main (String args[])
	{
	double l, h, w;
	Scanner kb = new Scanner(System.in);
	Subwoofer run = new Subwoofer();
	
	System.out.println("Enter Length in inches");
	l = kb.nextDouble();
		System.out.println("Enter Height in inches");
	h = kb.nextDouble();
		System.out.println("Enter Width in inches");
	w = kb.nextDouble();
	double print = run.volume(l, h, w);
	System.out.printf("The cubic volume in feet is %5.2f", print);
	

	}
	public double volume(double l, double h, double w)
	{
		return (l*w*h) / 1728;
	}
}
