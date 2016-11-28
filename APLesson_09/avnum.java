public class avnum
{
	public static void main (String args[])
	{
		int [] num = new int[10];
		for(int i = 0; i < num.length; i++)
		{
			num[i] = (int)(Math.random() * 100) + 1;
		}
		for(int n : num)
		{
			System.out.println(n + " ");
		}
		System.out.println("\n The average of the above numbers is..." + aver(num));
	}
	public static int aver(int [] n)
	{
		int	temp = 0;
		int sum = 0;
		for (int N : n)
		{
			sum += N;
			temp ++;
		}
		return sum/temp;
	}
}