import java.util.Scanner;
public class EX_02
{
	public static Scanner kb = new Scanner(System.in);
	public static String [][] words = new String [4][4];
	public static void main (String args[])
	{
		
		for (int i = 0; i < words.length; i++)
		{
			for(int j = 0; j < words.length; j++)
			{
				System.out.println("Please enter a word");
				words[i][j] = kb.nextLine();
			}
		}
		
		for (int i = 0; i < words.length; i++)
		{
			for(int j = 0; j < words.length; j++)
			{
				System.out.print(words[i][j] + " ");
			}
			System.out.println();
		}
	}
}
