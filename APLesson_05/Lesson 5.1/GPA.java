package apcompsci;
import java.util.Scanner;
public class Lesson5_1 
{
	public static String Math, Science, History, English, Compsci, Drama, Spanish;
	public static void main (String args[])
	{
	Scanner kb = new Scanner(System.in);
	System.out.println("Please enter your letter grade for Math");
	Math = kb.nextLine();
	System.out.println("Please enter your letter grade for Science");
	Science = kb.nextLine();
	System.out.println("Please enter your letter grade for History");
	History = kb.nextLine();
	System.out.println("Please enter your letter grade for English");
	English = kb.nextLine();
	System.out.println("Please enter your letter grade for Compsci");
	Compsci = kb.nextLine();
	System.out.println("Please enter your letter grade for Drama");
	Drama = kb.nextLine();
	System.out.println("Please enter your letter grade for Spanish");
	Spanish = kb.nextLine();
	// test delete later System.out.println(calc(Math));
	System.out.println((calc(Math) + calc(Science) + calc(History) + calc(English) + calc(Compsci) + calc(Drama) + calc(Spanish)) / 7);

	
	}
	public static double calc(String x)
	{
		if (x.equalsIgnoreCase("a"))
		{
			return 4.0;
		}
		if (x.equalsIgnoreCase("b"))
		{
			return 3.0;
		}
		if (x.equalsIgnoreCase("c"))
		{
			return 2.0;
		}
		if (x.equalsIgnoreCase("d"))
		{
			return 1.0;
		}
		else
		{
			return 0.0;
		}
	}
	
}
