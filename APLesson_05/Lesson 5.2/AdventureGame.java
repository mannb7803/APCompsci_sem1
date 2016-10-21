import java.util.Scanner;
public class AdventureGame
{
	public static String Settle, vote, action;
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
				vote = kb.nextLine();
				if (!vote.equalsIgnoreCase("allow") && !vote.equalsIgnoreCase("ignore"))
				{
					System.out.println("I didn't quite get that, please try again \n Do you allow or ignore this request.");
					vote = kb.nextLine();
				}
				if(vote.equalsIgnoreCase("allow"))
				{
					System.out.println("You lose the election by a narrow margin to your neighbor Tim. \nYou know Tim leaves his doors unlocked at night, do you take action or let him rule");
					action = kb.nextLine();
					if (!action.equalsIgnoreCase("take action") && !action.equalsIgnoreCase("let him rule"))
					{
						System.out.println("I didn't quite get that, please try again. \nDo you take action or let him rule.");
						action = kb.nextLine();
					}
					if (action.equalsIgnoreCase("take action"))
					{
						System.out.println("You sneak into Tim's house that night and kill him while he sleeps. \nWhile you atempt to leave his dog grabs your leg and you fall to the floor unable to defend yourself from the vicious dog.");
						dead();
					}
					if(action.equalsIgnoreCase("let him rule"))
					{
						System.out.println("After two months of Tim's rule bandits rode into town and killed everyone");
						dead();
					}
				}
				
				else if (vote.equalsIgnoreCase("ignore"))
				{
					System.out.println("You throw those who want a free election into the town jail and take control for yourself. \nWhat's your first act as \"mayor\", execute the prisoners or build a wall for the indains you heard last night.");
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
	public static void dead()
	{
		System.out.println("You're dead please press enter to restart.");
		kb.nextLine();
		settle();
	}
}
