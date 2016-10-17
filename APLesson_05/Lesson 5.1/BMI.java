import java.util.Scanner;
public class Test
{
	static double bmi;
	static String condition;
	public static void main (String args[])
	{
		double h, w;
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your height in inches");
		h = kb.nextDouble();
		System.out.println("Please enter your weight in pounds");
		w = kb.nextDouble();
		bmi = (703 * w) / (h * h);
		test();
		System.out.println("Your BMI is " + bmi);
		System.out.println("Your are " + condition);
	}
	public static void test()
	{
		if (bmi < 18.5)
		{
			condition = "Underweight";
		}
		else if (bmi < 24.9)
		{
			condition ="Normal";
		}
		else if (bmi < 29.9)
		{
			condition ="Overweight";
		}
		else if (bmi < 34.9)
		{
			condition ="Obese";
		}
		else if (bmi < 39.9)
		{
			condition ="Very Obese";
		}
		else if (bmi > 39.9)
		{
			condition = "Morbidly Obese";
		}
	}
}
