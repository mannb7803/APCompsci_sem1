import java.util.Scanner;
public class RudeAI{
public static void main(String args[])
	{
	
	Scanner kb = new Scanner(System.in);
	System.out.println("Yo man whats up.\n" + "Can i ask you a few questions?\nScratch that i dont care if you want to or not, what's your name?");
		String name = kb.nextLine();
	System.out.println("What a horrendous name, who names their kid " + name + ". God i feel so bad for you, due to the amount of bullying you must have recieved of course. Alright so how old are you "  + name + "?");
		int age = kb.nextInt();
		kb.nextLine();
	System.out.println("You have acomplished nothing in " + age + " years. Moving on then what do you do for fun then?"); 
		String fun = kb.nextLine();
	System.out.println("Who does " + fun + " for fun, seriously? Alright well what type of music do you listen to?");
		String music = kb.nextLine();
	System.out.println("Why would you listen to " + music + "? How may brothers and sisters have you forced to listen to that garbage?");
		int brothers = kb.nextInt();
		kb.nextLine();
	System.out.println("I feel bad for them. What's your goal for adult life?");
		String job = kb.nextLine();
	System.out.println("Really a " + job + "?");
	System.out.println("Good luck becoming a " + job + ", you'll need it. Just kidding good luck " + name);
	
	}	
}
