import java.util.Scanner;
public class box
{
	public static void main (String args[])
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a sring");
		String astring = kb.nextLine();
		for (int i = 0; i < astring.length(); i++)
		{
			System.out.println(astring);
		}
	}
}