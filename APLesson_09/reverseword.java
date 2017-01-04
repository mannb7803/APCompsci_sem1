import java.util.Scanner;
public class reverseword
{
	public static void main(String args[])
	{
		Scanner kb = new Scanner(System.in);
		String [] words = new String[5];
		System.out.println("Please enter 5 words with an enter after each word");
		for (int i = 0; i < words.length; i++)
		{
			words[i] = kb.nextLine();
		}
		System.out.print("In order...");
		for(String w : words)
		{
		System.out.print("\"" + w + "\", ");
		}
		System.out.print("\nReversed...");
		reverse(words);
		
	}
	public static void reverse(String[] words)
	{
		for (int i = words.length-1; i >= 0; i--)
		{
			System.out.print("\"" + words[i] + "\", ");
		}
	}
}