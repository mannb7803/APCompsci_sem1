/**
 * Created by mannb7803 on 3/1/2017.
 */

public class Toyota implements Location
{
    double[] locationsplit = new double[2];
    double[] location;
    public Toyota(String c)
    {
        String[] x = c.split(", ");
        this.locationsplit[0] = Double.parseDouble(x[0]);
        this.locationsplit[1] = Double.parseDouble(x[1]);

    }
    public int getID()
    {
        return (int)(Math.random()* 999999) + 99999;
    }
    public double[] getLoc()
    {
        location = new double[2];
        this.location = locationsplit;
        return location;
    }
    public void move(int x, int y)
    {
        this.location[1] = x;
        this.location[2] = y;
    }
}
