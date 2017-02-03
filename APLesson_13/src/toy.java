/**
 * Created by mannb7803 on 2/1/2017.
 */
public abstract class toy
{
    private  String name;
    private  int count;

    public toy()
    {
       this.name = null;
        this.count = 1;
    }
    public toy(String n, int x)
    {
        this.name = n;
        this.count = x;
    }
    public String getName()
    {
        return this.name;
    }
    public int getCount()
    {
        return this.count;
    }
    public void setName(String n)
    {
        this.name = n;
    }
    public void setCount(int x)
    {
        this.count = x;
    }
    public abstract String getType();
    public String toString()
    {
        return "The toy is a " + name + " and there are " + count;
    }
}
