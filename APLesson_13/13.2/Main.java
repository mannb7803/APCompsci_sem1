/**
 * Created by mannb7803 on 2/13/2017.
 */
import java.util.Scanner;
public class Main {
    static Scanner kb = new Scanner(System.in);
    public static void main (String args[])
    {
        System.out.println("Please enter how long is left on the early reservations");
        Ticket a = new Advanced();
        Ticket b = new Student();
        Ticket c = new Walkup();
        System.out.println(c + "\n");
        System.out.println(a + "\n");
        System.out.println(b);
    }
}
