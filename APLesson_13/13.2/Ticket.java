/**
 * Created by mannb7803 on 2/13/2017.
 */
public abstract class Ticket {
    static int price;
    public Ticket()
    {
        price = 0;
    }
    public int getSerialNo()
    {
        return (int)(Math.random()*9999999)+ 1000000;
    }
    public abstract int getPrice();

    public String toString()
    {
        return "Serial: " + getSerialNo() + "\nPrice: " + getPrice();
    }
}
