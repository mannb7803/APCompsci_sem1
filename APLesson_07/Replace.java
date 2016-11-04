import java.util.Scanner;
public class Replace
{
	public static String sentance;
	public static void main (String args[])
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Pleas enter a sentance");
		sentance = kb.nextLine();
		replaceats();
		System.out.println(sentance);
	}
	public static void replaceats()
	{
		while (sentance.indexOf("a") >= 0)
		{
			sentance = sentance.substring(0, sentance.indexOf("a")) + "@" + sentance.substring(sentance.indexOf("a") +1);
		}
	}
}