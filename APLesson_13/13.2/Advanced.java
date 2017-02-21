/**
 * Created by mannb7803 on 2/13/2017.
 */
public class Advanced extends Ticket{
    public static int daysleft = Main.kb.nextInt();
    public Advanced()
    {
        super();
    }
    public int getPrice()
    {
        if(daysleft >= 10)
        {
            return 30;
        }
        else
        {
            return 40;
        }
    }
}
