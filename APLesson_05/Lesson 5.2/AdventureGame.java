import java.util.Scanner;
public class AdventureGame
{
	public static String Settle, vote, action1, action2;
	public static Scanner kb = new Scanner(System.in);
	public static void main (String args [])
	{
		settle();
	}
	public static void settle()
	{
		System.out.println("Please enter one of the two choices that come before or after an \" or \"");
		System.out.println("In 1820 you and your weary party of settlers find a sutable location to set up a settlment do you settle or leave?");
		Settle = kb.nextLine();
		
			if (Settle.equalsIgnoreCase("settle"))
			{
				System.out.println("One year has passed since you settled on this spot and the town has grown a substantial amount. \nSome peope would like to host the towns first election for mayor. \nDo you allow or ignore this request?");
				vote = kb.nextLine();
				 if (!vote.equalsIgnoreCase("allow") && !vote.equalsIgnoreCase("ignore"))
				{
					System.out.println("I didn't quite get that, please try again using \"allow\" or \"ignore\". \nDo you allow or ignore this request?");
					vote = kb.nextLine();
				}
				else if(vote.equalsIgnoreCase("allow"))
				{
					System.out.println("You lose the election by a narrow margin to your neighbor Tim. \nYou know Tim leaves his doors unlocked at night, do you take action or let him rule?");
					action1 = kb.nextLine();
					if (!action1.equalsIgnoreCase("take action") && !action1.equalsIgnoreCase("let him rule"))
					{
						System.out.println("I didn't quite get that, please try again using \"take action\" or \"let him rule\". \nDo you take action or let him rule?");
						action1 = kb.nextLine();
					}
					else if (action1.equalsIgnoreCase("take action"))
					{
						System.out.println("You sneak into Tim's house that night and kill him while he sleeps. \nWhile you atempt to leave his dog grabs your leg and you fall to the floor unable to defend yourself from the vicious dog.");
						dead();
					}
					else if(action1.equalsIgnoreCase("let him rule"))
					{
						System.out.println("After two months of Tim's rule bandits rode into town and killed everyone");
						dead();
					}
				}
				
				else if (vote.equalsIgnoreCase("ignore"))
				{
					System.out.println("You throw those who want a free election into the town jail and take control for yourself. \nWhat's your first act as \"mayor\", execute the prisoners or build a wall?");
					action2 = kb.nextLine();
					if (!action2.equalsIgnoreCase("execute the prisoners") && !action2.equalsIgnoreCase("build a wall"))
					{
						System.out.println("I didn't quite get that, please try again using \"execute the prisoners\" or \"build a wall\". \nWhat's your first act as \"mayor\", execute the prisoners or build a wall?");
						action2 = kb.nextLine();
					}
					else if (action2.equalsIgnoreCase("execute the prisoners"))
					{
						System.out.println("You decide to hang the prisoners in a very public way, as they are walking to the gallows one swears to get his revenge. \nYou laugh at him as you watch him walk towards his death. \nA week later a ghost starts following you at all points in the day laughing at you, you commit suicide shortly thereafter.");
						dead();
					}
					else if (action2.equalsIgnoreCase("build a wall"))
					{
						System.out.println("You build the biggest wall the plains have ever seen and better yet you made the plains pay for it with its rescources!");
						System.out.println("Your town starts to thrive under your firm and dictatorial rule for a week until your son poisons you");
						dead();
					}
				}
			}
			else if (Settle.equalsIgnoreCase("leave"))
			{
				System.out.println("Your entire party and family dies as you walk for the next two months. You eventually get find 3 disheveled men who you group up with.\nOver the next two months you become the leader of your new gang.\nDo you attack the local town or train?");
				vote = kb.nextLine();
					if (!vote.equalsIgnoreCase("local town") && !vote.equalsIgnoreCase("train"))
					{
					System.out.println("I didn't quite get that, please try again using \"local town\" or \"train\". \nDo you attack the local town or train?");
					vote = kb.nextLine();
					}
					else if (vote.equalsIgnoreCase("local town"))
					{
						System.out.println("As you and your gang are gathering up the hostages you see a man from your old traveling party you thought was dead. Do you set him free or execute him?");
						action1 = kb.nextLine();
					}
						if (!action1.equalsIgnoreCase("set him free") && !action1.equalsIgnoreCase("execute him"))
						{
							System.out.println("I didn't quite get that, please try again using \"set him free\" or \"execute him\". \nDo you set him free or execute him?");
							action1 = kb.nextLine();
						}
						else if(action1.equalsIgnoreCase("set him free"))
						{
							System.out.println("You untie him and invite him to join your gang. He declines leading to you spending 10 minutes trying to convince him to join.\nYour gang sees this as deserpation and weekness and after getting back to your hideout they kill you in your sleep.");
							dead();
						}
						else if(action1.equalsIgnoreCase("execute him"))
						{
							System.out.println("That one time this man stole your blanket flares up in your mind. In a fit of rage you pull out your gun and kill him. \nAs you do this a sherif rides into town unnoticed and opens fire on you. You were hit and left behind by your gang to be hung");
							dead();
						}
					else if (vote.equalsIgnoreCase("train"))
					{
						System.out.println("You manage to get on the train easily. You decide to search through some luggage when you discover a massive golden nugget.\nDo you inform the gang of keep it hidden?" );
						action2 = kb.nextLine();
						if (!action2.equalsIgnoreCase("inform the gang") && !action2.equalsIgnoreCase("keep it hidden"))
						{
							System.out.println("I didn't quite get that, please try again using \"inform the gang\" or \"keep it hidden\". \nDo you inform the gang of keep it hidden?");
							action2 = kb.nextLine();
						}
						else if(action2.equalsIgnoreCase("inform the gang"))
						{
							System.out.println("You let the group know once you get back to your hideout, that night one of your more greedy members decides he deserves it. You discover him as he is leaving with the nugget and a stolen horse, he shoots you where you stand and takes off.");
						dead();
						}
						else if(action2.equalsIgnoreCase("keep it hidden"))
						{
							System.out.println("Your righthand man notices your new taste for fancy things and convinces the gang you've been stealing from them. They confront you and decide to use you as target practice.");
							dead();
						}
					}
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
