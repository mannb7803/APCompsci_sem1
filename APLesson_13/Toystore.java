import java.util.ArrayList;
import java.util.Arrays;


/**
 * Created by mannb7803 on 2/3/2017.
 */
public class Toystore
{
    ArrayList<toy> toyList;
    public Toystore()
    {
        ArrayList<toy> toylist = new ArrayList<>();
    }
    public Toystore(String l)
    {
        loadtoys(l);
    }

    public void loadtoys(String l)
    {
        ArrayList<String> toys = new ArrayList<>(Arrays.asList(l.split(", ")));
        toyList = new ArrayList<>();
        for(int i = 0; i < toys.size(); i += 2)
        {
            String name = toys.get(i);
            String type = toys.get(i + 1);
            toy t = getThatToy (name);
            if (t == null)
            {
                 if (type.equalsIgnoreCase("car"))
                 {
                     toyList.add(new ACar(name));
                 }
                 if (type.equalsIgnoreCase("af"))
                 {
                     toyList.add(new AFigure(name));
                 }
            }
            else
            {
                int temp = t.getCount() + 1;
                t.setCount(temp);
            }
        }
    }
    public toy getThatToy(String nm)
    {
        for(toy t : toyList)
        {
            if(t.getName().equalsIgnoreCase(nm))
            {
                return t;
            }
        }
        return null;
    }
    public String getMostFrqToy()
    {
        String name = "";
        int max = Integer.MIN_VALUE;
        for(toy t : toyList)
        {
            if (max < t.getCount())
            {
                max = t.getCount();
                name = t.getName();
            }
        }
        return name;
    }
    public String getMostFrqtype()
    {
        int car = 0;
        int figure = 0;

        for(toy t : toyList)
        {
            if(t.getType().equalsIgnoreCase("car"))
            {
                car++;
            }
            if(t.getType().equalsIgnoreCase("af"))
            {
                figure++;
            }
        }
        if (car > figure)
        {
            return "car";
        }
        if (car < figure)
        {
            return "Action figure";
        }
        else
        {
            return "Equal amounts of action figures and cars";
        }
    }
    public String toString()
    {
        return "" + toyList;
    }
}
