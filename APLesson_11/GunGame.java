import java.util.Scanner;
public class GunGame
{
	public static int bulletcount, clipsize, shotcount;
	public static Scanner kb = new Scanner(System.in);
	public static String [] clip;
	public static void main (String args[])
	{
		clipsize = 16;
		bulletcount = 96;
		shotcount = 0;
		clip = new String [clipsize];
		resetClip();
			while(bulletcount > 0 || shotcount > 0)
			{
				System.out.println("Action: ");
				String a = kb.nextLine();
				if (a.equalsIgnoreCase("R"))
				{
					reload();
				}
				else if (a.equalsIgnoreCase("S"))
				{
					shoot();
				}
				printClip();
			}
				System.out.println("Out of bullets");
	}
		public static void resetClip()
		{
			for (int i = 0; i < clip.length; i++)
			{
				clip[i] = "[]";
			}
		}
		public static void shoot()
		{
			if(shotcount > 0)
			{
				clip[shotcount-1] = "[]";
				shotcount--;
				System.out.println("Boom!");
			}
			else
			{
				System.out.println("Reload!");
			}
		}
		public static void reload()
		{
			if (bulletcount >= clipsize)
			{
				bulletcount -= clipsize;
				shotcount = clipsize;
			}
			else 
			{
				shotcount = bulletcount;
				bulletcount = 0;
			}
			resetClip();
			for(int i = 0; i < clip.length; i++)
			{
				clip[i] = " * ";
			}
		}
		public static void printClip()
		{
			System.out.print("Bullets: \t" + bulletcount + "\nClip:\t");
			for(int i = 0; i < clip.length; i++)
			{
				System.out.print(clip[i]);
			}
			System.out.println();
			// void > String
		}
}