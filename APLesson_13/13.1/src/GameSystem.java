/**
 * Created by mannb7803 on 2/9/2017.
 */
public class GameSystem
{
    static String platform;
    static int serialNo;
    public GameSystem()
    {
    this.platform= null;
        this.serialNo = 0;
    }
    public GameSystem(String p)
    {
        this.platform = p;
        this.serialNo = (int) (Math.random()* 1000000 +1);
    }
    public String getplatform()
    {
        return this.platform;
    }
    public int getserial()
    {
        return this.serialNo;
    }
}
