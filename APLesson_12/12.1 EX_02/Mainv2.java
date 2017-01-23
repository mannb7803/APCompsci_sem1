/**
 * Created by mannb7803 on 1/23/2017.
 */
import java.util.Scanner;
public class Mainv2
{
    public static void main (String args[])
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter your Hair color");
        String hair = kb.nextLine();
        System.out.println("Please enter your eye color");
        String eye = kb.nextLine();
        System.out.println("Please enter your skin type");
        String skin = kb.nextLine();
        human h1 = new human(hair, eye, skin);
        System.out.println("Hair: " + h1.getHair() + "\nEyes: " + h1.getEyes() + "\nSkin: " + h1.getSkin());


        System.out.println("Please enter your friends Hair color");
        hair = kb.nextLine();
        System.out.println("Please enter your friends eye color");
        eye = kb.nextLine();
        System.out.println("Please enter your friends skin type");
        skin = kb.nextLine();
        h1.setHuman(hair, eye, skin);
        System.out.println("Hair: " + human.getHair() + "\nEyes: " + human.getEyes() + "\nSkin: " + human.getSkin());
    }


}
