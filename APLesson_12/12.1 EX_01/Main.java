/**
 * Created by mannb7803 on 1/23/2017.
 */
import java.util.Scanner;
public class Main {
    public static void main (String args[])
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter the color of your car you yearn for");
        String color = kb.nextLine();
        System.out.println("Pleae enter the type of interior you want");
        String interior = kb.nextLine();
        System.out.println("Please enter the type of engine you desire");
        String engine = kb.nextLine();
        System.out.println("Please enter the model of wheels you strive towards");
        String tires = kb.nextLine();

        Car c = new Car(color, interior, engine, tires);
        System.out.println("Paint:\t " + c.getPaint() + "\nInterior:\t " + c.getInterior() + "\nEngine:\t " + c.getEngine() + "\nTires:\t" + c.getTires());
    }




}
