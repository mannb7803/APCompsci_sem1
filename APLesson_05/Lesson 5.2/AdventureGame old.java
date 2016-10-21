import java.util.Scanner;
public class AdventureGame
{
	public static String Settle, answer;
	public static Scanner kb = new Scanner(System.in);
	public static void main (String args [])
	{
		settle();
	}
	public static void settle()
	{
		System.out.println("In 1820 you and your weary party of settlers find a sutable location to set up a settlment do you settle or leave?");
		Settle = kb.nextLine();
		
			if (Settle.equalsIgnoreCase("settle"))
			{
				System.out.println("One year has passed since you settled on this spot and the town has grown a substantial amount. \nSome peope would like to host the towns first election for mayor. \nDo you allow or ignore this request.");
				answer = kb.nextLine();
				if (!answer.equalsIgnoreCase("allow") || !answer.equalsIgnoreCase("ignore"))
				{
					System.out.println("I didn't quite get that, please try again \n Do you allow or ignore this request.");
					answer= kb.nextLine();
				}
				if(answer.equalsIgnoreCase("allow"))
				{
					System.out.println("test");
				}
				else if (answer.equalsIgnoreCase("ignore"))
				{
					System.out.println("test2");
				}
			}
			else if (Settle.equalsIgnoreCase("leave"))
			{
				System.out.println("Test1");
			}
			else 
			{
			System.out.println("i didn't quite get that, please try again");
			settle();
			}
		
	}
}
