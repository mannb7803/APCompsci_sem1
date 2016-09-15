import java.util.Scanner;
public class Quadratic_formula{
	public static void main (String args[])
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter A, B, and C to a given quadratic equation when prompted to calculate all real answers.\nEnter A");
		double A = kb.nextDouble();
		System.out.println("Enter B");
		double B = kb.nextDouble();
		System.out.println("Enter C");
		double C = kb.nextDouble();
		double sq = (B*B) - (4*A*C);
			if(sq < 0)
				{
				System.out.println("Error: No real answer, please retry.");
				System.exit(0);
				}
		double answer1 = ((-B + Math.sqrt(sq)) / (2*A));
		double answer2 = ((-B - Math.sqrt(sq)) / (2*A));
		System.out.println("The answer is " + answer1 + " and " + answer2);
	}
}