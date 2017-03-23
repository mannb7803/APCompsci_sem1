/**
 * Created by mannb7803 on 3/1/2017.
 */

public class GMC implements Location
{
    int x1, y1;
    public GMC(int x, int y)
    {
        this.x1 = x;
        this.y1 = y;
    }
    public int getID()
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
    public double[] getLoc()
    {
       double[] location = new double[2];
        location[0] = this.x1;
        location[1] = this.y1;
        return location;
    }
    public void move(int x, int y)
    {
        this.x1 = x;
        this.y1 = y;
    }
}
