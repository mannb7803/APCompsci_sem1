/**
 * Created by mannb7803 on 3/1/2017.
 */

public class Toyota extends car
{
    public Toyota(String c)
    {
        super();
        String[] x = c.split(", ");
        locationsplit[0] = Double.parseDouble(x[0]);
        locationsplit[1] = Double.parseDouble(x[1]);
        this.location = locationsplit;

    }

}
