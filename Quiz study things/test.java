public class test
{
	public static void main (String args[])
	{
			int [] arr = new int [5];
			arr[4] = 1;
			System.out.println(arr[arr.length-1]);
			for(int i = 3; i < arr.length; i++)
			{
				System.out.println(arr[i]);
			}
	}
}