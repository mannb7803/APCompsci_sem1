import java.util.Scanner;

/**
 * Created by mannb7803 on 1/23/2017.
 */
public class user {
    public static String firstname, lastname, avatar;
    public static int userid;
    public static Scanner kb = new Scanner(System.in);


    public user()
    {
        firstname = null;
        lastname = null;
        avatar = null;
        userid = 0;
    }
    public user(String fN, String lN)
    {
        firstname = fN;
        lastname = lN;
        avatar = "Undefined";
        userid = (int)(Math.random() * 1000000) + 1;
    }
    public user(String fN, String lN, String av)
    {
        firstname = fN;
        lastname = lN;
        avatar = av;
        userid = (int)(Math.random() * 1000000) + 1;
    }
    public static void setavatar(String av)
    {
        avatar = av;
    }
    public String toString()
    {
        return "Customer Info...\nFirst Name: " + firstname +
                "\nLast Name: " + lastname +
                "\nAvatar: " + avatar +
                "\nUser ID#: " + userid;
    }
    public static void main (String args[])
    {
        user user1 = new user();
        System.out.println("Please enter your first name");
        String fn = kb.nextLine();
        System.out.println("Please enter your second name");
        String ln = kb.nextLine();
        System.out.println("Do you want a public avatar? Enter yes or no");
        String bool = kb.nextLine();
        if (bool.equalsIgnoreCase("no"))
        {
            user1 = new user(fn, ln);
        }
        else
        {
            System.out.println("Please enter avatar");
            String av = kb.nextLine();
            user1 = new user(fn, ln, av);
        }
        System.out.println(user1);
        //You say take 2 sets of user imputes but never say to print/use/make a new object so if you wanted me 2 do so my bad
    }
}
