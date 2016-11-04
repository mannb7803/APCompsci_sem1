
public class Sing {

	public static String na = "na", hey = "hey", gb = "goodbye";
	public static int one = 1, three = 3, four = 4;
	public static void main (String args[])
	{
		
		song(na, four);
		song(na, four);
		song(hey, three);
		song(gb, one);
		
	}
	public static void song(String word, int num)
	{
		
		for (int i = num; i > 0; i--)
		{
			System.out.print(word + " ");
		}
		System.out.print("\n");
	}
}
