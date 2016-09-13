import java.util.Scanner;
public class BMI{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter your weight in pounds");
		int w = kb.nextInt();
		System.out.println("Enter your height in inches");
		int h = kb.nextInt();
		double bmi = 703 * w / (h*h);
		System.out.println("Your bmi is " + bmi);
	}
}