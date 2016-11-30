public class GetOdds
{
	public static int [] array = new int [10];
	public static void main (String args[])
	{
		fillarray();
		printarray();
		getodds();
	}
	public static void fillarray()
	{
		for(int i = 0; i < array.length; i++)	
		{
		array[i] = (int)(Math.random() * 100 + 1);
		}
	}
	public static void printarray()
	{
		System.out.print("For the following numbers");
		for(int a : array)
		{
			System.out.print(" " + a);
		}
	}
	public static void getodds()
	{
		System.out.println();
		for (int a : array)
		{
			if (a % 2 != 0)
			{
			System.out.print(a + " ");
			}
			// Not sure if you wanted an ArrayList, asked jluu said it didn't matter.
		}
		System.out.println("are odd numbers");
	}
}