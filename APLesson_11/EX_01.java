public class EX_01
{
	
	public static void main (String args[])
	{
		 int [][] numbers = new int[4][4];
		for (int i = 0; i < numbers.length; i++)
		{
			for (int j = 0; j < numbers.length; j++)
			{
				numbers[i][j] = (int)(Math.random()* 100 + 1); 
				System.out.print(numbers[i][j] + " ");
			// i did all of the lab 11 labs over break but forgot to upload it and i wiped the laptop they were on :)))))	
			}
			System.out.println();
		}
	}
}
