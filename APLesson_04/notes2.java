import java.util.Scanner;
public class notes2
{
	public static int x, y, answer;
	public static void main (String args[])
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter to numbers to be added together seperated by an enter");
		x = kb.nextInt();
		y = kb.nextInt();
		calc();
		print();
	}
	public static void calc()
	{
		return answer = x+y;
	}
	public static void print()
	{
	System.out.println("When " + x + " is added to " + y + " it equals " + answer);
	}
}	