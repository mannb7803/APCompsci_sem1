import java.util.Scanner;
public class password
{
	public static String passuser, pass, usernameuser, username;
	public static Scanner kb = new Scanner(System.in);
	public static void main (String args[])
	{
	username = "bob1999";
	pass = "pass123";

		check();
	}
	public static void check()
	{
		System.out.println("Please enter your username");
		usernameuser = kb.nextLine();
		System.out.println("Please enter your password");
		passuser = kb.nextLine();
		if (passuser.equalsIgnoreCase(pass) && usernameuser.equalsIgnoreCase(username))
		{
			System.out.println("You are granted access!");
		}
		else
		{
			if (!passuser.equalsIgnoreCase(pass) && usernameuser.equalsIgnoreCase(username))
			{
			System.out.println("Your password is incorrectt, try again!");
			check();
			}
			else if (passuser.equalsIgnoreCase(pass) && !usernameuser.equalsIgnoreCase(username))
			{
			System.out.println("Your username is incorrect!, try again!");
			check();
			}
			else 
			{
			System.out.println("Your username and password are incorrect, try again!");
			check();
			}
		}
		
	
	}
}