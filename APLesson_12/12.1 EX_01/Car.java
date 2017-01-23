/**
 * Created by mannb7803 on 1/23/2017.
 */
public class Car {
    public static String paint, interior, engine, tires;
    public Car()
    {
        paint = null;
        interior = null;
        engine = null;
        tires = null;
    }
    public Car(String p, String i, String e, String t)
    {
        paint = p;
        interior = i;
        engine = e;
        tires = t;
    }
    public String getPaint()
    {
        return paint;
    }
    public String getInterior()
    {
        return interior;
    }
    public String getEngine()
    {
        return engine;
    }
    public String getTires()
    {
        return tires;
    }
}
