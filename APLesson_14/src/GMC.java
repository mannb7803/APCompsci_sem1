
import java.util.ArrayList;
import java.util.jar.Pack200;

/**
 * Created by mannb7803 on 3/1/2017.
 */

public class GMC implements Location
{
    int x1, y1;
    public GMC()
    {
        x1 = 0;
        y1 = 0;
    }
    public int getId()
    {
        return (int)(Math.random()* 999999) + 99999;
    }
    public int getX()
    {
    return x1;
    }
    public int getY()
    {
        return y1;
    }
    public double getLoc()
    {
        ArrayList<Integer> b = new ArrayList<>();
        return double x;
    }
    public void move(int x, int y)
    {
        x1 = x;
        y1 = y;
    }
}
