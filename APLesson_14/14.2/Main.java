
import java.util.ArrayList;
public class Main
{
    public static void main(String[]args)
    {
        ArrayList<Location> locate = new ArrayList<>();
        double[] honLoc = {5, 6};
        locate.add(new Honda(honLoc));
        locate.add(new Toyota("8, 9"));
        locate.add(new GMC(3, 8));


        double[] home = {0, 0};


        String printout = "\n\n" +
                "==========================" + "\nStarting locations...";


        for (Location l : locate)
        {
            printout += "\nLocation for " + l.getID() + ": (" + getLocation(l.getLoc()) + ")";
        }


        printout += "\n\n" + "==========================" +
                "\nDistance from home...";


        for (Location l : locate)
        {
            printout += String.format("\nDistance for %d: (%.2f)", l.getID(), getDistance(l.getLoc(), home));
        }
		    printout += "\n\n" + "==========================" +
                "\n";

		for(Location l : locate)
		{
			int r1 = (int)(Math.random()* 100);
			int r2 = (int)(Math.random()* 100);
			((car)l).move(r1, r2);
			printout+= "\nAfter " + l.getID() + " Moved ("+r1+", "+r2+")\nNew Location: ("+getLocation(l.getLoc())+")";
			//this works in np++ but wont compile in iintellij, no idea why it's like that
		}
        printout += "\n\n" + "==========================" +
                "\n";
		for(Location l : locate)
		{
            printout += String.format("\nDistance for %d: (%.2f)", l.getID(), getDistance(l.getLoc(), home));
//            printout += String.format("\nDistance for " + l.getID() + ": (" + getDistance(l.getLoc(), home)+ ")");
		}
        printout += "\n\n" + "==========================";
       System.out.println(printout);
    }


    public static double getDistance(double[] car, double[] home)
    {
        return Math.sqrt((Math.pow(car[0] - home[0], 2)+ Math.pow(car[1] - home[1], 2)));
    }


    public static String getLocation(double[] loc)
    {
        return loc[0] + ", " + loc[1];
    }
}
