/**
 * Created by mannb7803 on 2/3/2017.
 */
public class Main
{
    public static void main (String args[])
    {
        AFigure afig = new AFigure("TestFig");
        ACar acar = new ACar("TestCar");
        System.out.println(afig);
        System.out.println(acar);
        Toystore t = new Toystore("Hotwheel, Car, G.I.Joe, AF, PennyRacer, Car, Matchbox, Car, Star Wars, AF, Pullback, Car, Star Wars, AF");
        System.out.println(t);
        System.out.println("The most frequent toy is " + t.getMostFrqToy());
        System.out.println("The most frequent type is " + t.getMostFrqtype());
    }
}
