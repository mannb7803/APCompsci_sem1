public class test
{
	public static void main (String args[])
	{
			int [] arr = new int [5];
			arr[4] = 1;
			System.out.println(arr.length-1);
			
			for(int i = 1; i < arr.length; i++)
			{
				System.out.println(i);
			}
	}
}