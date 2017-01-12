import java.util.Scanner;
public class GameHp
{
	public static Scanner kb = new Scanner(System.in);
	public static String [] health;
	public static int healthcount = 6, healthload = 6;
	
	public static void main (String args[])
	{
		String turn = "";
		int damage = 0;
		int amount = 0;
		health = new String[healthload];
		
		while (!turn.equalsIgnoreCase("Q") && healthcount > 0)
		{
			System.out.println("Your turn! Hit enter when ready: ");
			turn = kb.nextLine();
			damage = (int)(Math.random() * 2 + 1);
			amount = (int)(Math.random() * 6 + 1);
			System.out.println(takedam(damage, amount));
			printHp();
		}
		System.out.println("You died");
		
		
	}
	public static String takedam(int d, int a)
	{
		if(d == 1)
		{
			healthcount -= a;
			return "You took " + a + " damage!";
		}
		else
		{
			if(healthcount + a < healthload)
			{
				healthcount += a;
			}
			else
			{
				healthcount = healthload;
			}
		}
		return "Healed " + a;
	}
	public static void printHp()
	{
		String output  = "Health: \t";
		for(int i = 0; i < healthload; i++)
		{
			if(i < healthcount)
			{
				health[i] = " @ ";
			}
			else
			{
				health[i] = "[]";
			}
			output += health[i];
		}
		System.out.println(output);
	}
}