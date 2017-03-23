/**
 * Created by mannb7803 on 3/1/2017.
 */

public class Honda implements Location
{
    double[] locationsplit = new double[2];
    double[] location;
    public Honda(double[] x)
    {
        this.locationsplit = x;
    }
    public int getID()
    {
        return (int)(Math.random()* 999999) + 99999;
    }
    public double[] getLoc()
    {
        location = new double[2];
        location = locationsplit;
        return location;
    }
    public void move(int x, int y)
    {
        this.location[1] = x;
        this.location[2] = y;
    }
}
