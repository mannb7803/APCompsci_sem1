/**
 * Created by mannb7803 on 2/9/2017.
 */
public abstract class Consol extends GameSystem
{
    static String controller;
    public Consol()
    {
        super();
    }
    public Consol(String p)
    {
        super(p);
    }
    public String getController()
    {
        return controller;
    }
    public  String toString()
    {
        return "Platform:\t" + super.getplatform() + "\nSerial#:\t" + super.getserial() + "\nControler:\t" + this.getController();
    }
}
