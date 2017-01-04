import java.util.Arrays;
import java.util.ArrayList;
public class ex10_1
{
	public static void main (String args[])
	{
		Integer [] numbers = {2, 6, 8, 9, 10, 12, 13, 15, 17, 24, 55, 66, 78, 77, 79};
		ArrayList<Integer> num = new ArrayList<>(Arrays.asList(numbers));
		System.out.println(num + "\n" + removePrimes(num));
	}
	public static int gFactor(int x)
	{
		for(int i = 2; i < x; i++)
		{
			if (x % i == 0)
			{
				return 1;
			}
			return 0;
		}
		return 0;
	}
	public static ArrayList removePrimes(ArrayList<Integer> num)
	{
		for(int i = 0; i < num.size(); i++)
		{
			if(gFactor(num.get(i)) == 0)
			{
				num.remove(i);
				i--;
			}
		}
		return num;
	}
}