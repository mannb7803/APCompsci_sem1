import java.util.Scanner;
public class Compoundint
{
	public static void main (String args[])
	{
		Compoundint run = new Compoundint();
		Scanner kb = new Scanner(System.in);
		double p, n, t, r, payment;
		System.out.println("Please enter interest rate as a decimal (r)");
		r = kb.nextDouble();
		System.out.println("Please enter amount borrowed (p)");
		p = kb.nextDouble();
		System.out.println("Please enter how fast the interest is compounded per year (n)");
		n = kb.nextDouble();
		System.out.println("Please enter the life of the loan in years(t)");
		t = kb.nextDouble();
		payment = run.interest(r, p, n, t);
		System.out.printf("Your total monthly payment is $%5.2f", payment);
	}
	public double interest(double r, double p, double n, double t)
	{
		double temp = p*(Math.pow(1 + r/n, n * t));
		return temp / (12 * t);
	}
}