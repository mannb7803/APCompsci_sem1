/**
 * Created by mannb7803 on 1/23/2017.
 */
import java.util.Scanner;
public class Main {
    public static Scanner kb = new Scanner(System.in);
    public static void main (String args[])
    {
        System.out.println("Please enter your first name");
        String fn = kb.nextLine();
        System.out.println("Please enter your second name");
        String ln = kb.nextLine();
        System.out.println("Do you want a public avatar? Enter yes or no");
        String bool = kb.nextLine();
        if (bool.equalsIgnoreCase("no"));
        {
            user user1 = new user(fn, ln);
        }
        if (bool.equalsIgnoreCase("yes"));
        {
            System.out.println("Please enter avatar");
            user user1 = new user(fn, ln, bool);
        }
        System.out.println(user1);
    }
}
