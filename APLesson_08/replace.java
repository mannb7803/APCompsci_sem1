import java.util.Scanner;
public class replace
{
	
	public static void main(String args[])
	{
			Scanner kb = new Scanner(System.in);
			System.out.println("Please enter a sentance");
			String string = kb.nextLine();
			System.out.println(replaceu(string));
	}
	public static String replaceu(String string)
	{
		if (string.indexOf(" ") < 0)
		{
		return string;	
		}
		else
		{
		return replaceu(string.substring(0, string.indexOf(" ")) + "_" + string.substring(string.indexOf(" ") +1));
		}
	}
}