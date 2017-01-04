import java.util.Scanner;
public class Firstletter
{
	public static void main (String args[])
	{
	Scanner kb = new Scanner(System.in);
	System.out.println("Please enter 5 strings");
	String [] s = new String[5];
		for(int i = 0; i < s.length; i++)
		{
			s[i] = kb.nextLine();
		}
		run(s);
	}
	public static void run(String [] s)
	{
		for(String S : s)
		{
			System.out.println(S.substring(0,1));
		}
	}
}