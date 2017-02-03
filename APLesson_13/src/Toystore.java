import java.util.ArrayList;
import java.util.Arrays;


/**
 * Created by mannb7803 on 2/3/2017.
 */
public class Toystore
{
   public static ArrayList<toy> list = new ArrayList<toy>();
    public Toystore()
    {
        list = null;
    }
    public Toystore(String l)
    {
        loadtoys(l);
    }

    public void loadtoys(String l)
    {

        ArrayList<String> toys = new ArrayList<String>(Arrays.asList(l.split(", ")));
        for(int i = 0; i < toys.size(); i++)
        {
            String name = toys.get(i);
            String type = toys.get(i+1);
            toy t = getThatToy (name);
            if(type.equalsIgnoreCase ("AFigure"))
            {
                getThatToy (name);
            }
            if type.equalsIgnoreCase ("Car")
            {

            }
            getThatToy (name);

        }
    }
    public toy getThatToy(String nm)
    {
      for(toy x : list)
        {
            if(x.getName().equalsIgnoreCase(nm))
            {
                return x;
            }
            else
            {
                return null;
            }
        }
    }

}
