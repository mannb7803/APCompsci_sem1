/**
 * Created by mannb7803 on 2/9/2017.
 */
public class Main
{
    public static void main (String args[])
    {
        Consol x = new Xbox("XBox");
        System.out.println(x + "\n");
        Consol x1 = new Playstation("apple");
        System.out.println(x1 + "\n");
        GameSystem x2 = new PC("Battlestation");
        System.out.println(x2 + "\n");
    }
}
