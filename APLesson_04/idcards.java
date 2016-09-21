import java.util.Scanner;
public class idcards
{
	public static void main (String args[])
	{
		Scanner kb = new Scanner(System.in);
		idcards id = new idcards();
		String fname, lname, title, school, year, subject;
		
		
		System.out.println("Enter your first name: ");
		fname = kb.nextLine();
		System.out.println(fname);
		System.out.println("Enter your last name: ");
		lname = kb.nextLine();
		System.out.println("Enter your title: ");
		title = kb.nextLine();
		System.out.println("Enter your school site: ");
		school = kb.nextLine();
		System.out.println("Enter the school year: ");
		year = kb.nextLine();
		System.out.println("What is your subject?");
		subject = kb.nextLine();
		
		System.out.println("*************************************");
		id.format(school, year);
		id.format(lname, fname);
		id.format(title, subject);
		System.out.println("*************************************");
	}
	public void format(String string1, String string2)
		{
		System.out.printf("*%15s  %15s   *\n", string1, string2);
		}
}