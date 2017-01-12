public class EX_03
{
	public static String[][] xando = new String[4][4];
	public static void main (String args[])
	{
		for (int i = 0; i < xando.length; i++)
		{
			for(int n = 0; n < xando.length; n++)
			{
				int Random = (int)(Math.random() * 2 + 1);
				if (Random == 1)
				{
					xando[i][n] = "X";
				}
				else
				{
					xando[i][n] = "O";
				}
					System.out.print(xando[i][n] + " ");
			}
			System.out.println();
		}
	}
}