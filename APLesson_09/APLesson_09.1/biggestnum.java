public class biggestnum
{
	public static int [] array = new int [10];
	public static void main (String args[])
	{
		fillArray();
		printArray();
		System.out.println("\n" + getBiggest());
	}
	public static void fillArray()
	{
		for (int i = 0; i < array.length; i ++)
		{
			array[i] = (int)(Math.random() * 100 + 1);
		}
		// not sure what you wanted the random numbers to be, did 1-100.
	}
	public static void printArray()
	{
		for (int a : array)
		{
			System.out.print(a + " ");
		}
	}
	public static int getBiggest()
	{
		int max = 0;
		for (int a : array)
		{
			if (max < a)
			{
				max = a;
			}
		}
		return  max;
	}
}