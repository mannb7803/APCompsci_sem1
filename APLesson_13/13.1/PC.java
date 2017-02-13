/**
 * Created by mannb7803 on 2/9/2017.
 */
public class PC extends GameSystem
{
    //pcmasterrace
    public PC()
    {
        super();
    }
    public PC(String p)
    {
        super(p);
    }
    public String systemInput()
    {
        return "Keyboard and mouse";
    }
    public String toString()
    {
        return "Platform:\t" + super.getplatform() + "\nSerial#:\t" + super.getserial() + "\nInput device: " + this.systemInput();
    }
}
