/**
 * Created by mannb7803 on 1/23/2017.
 */
public class human {
    public static String hair, eyes, skin;
    public human()
    {

    }
    public human(String h, String e, String s)
    {
        hair = h;
        eyes = e;
        skin = s;
    }
    public void setHuman(String h, String e, String s)
    {
        hair = h;
        eyes = e;
        skin = s;
    }
    public static String getHair()
    {
        return hair;
    }
    public static String getEyes()
    {
        return eyes;
    }
    public static String getSkin()
    {
        return skin;
    }

}
