/**
 * Created by mannb7803 on 2/13/2017.
 */
public class Student extends Advanced{
    public Student()
    {
        super();
    }
    public int getPrice()
    {
        if(daysleft >= 10)
        {
            return Math.round(30/2);
        }
        else
        {
            return Math.round(40/2);
        }
    }
    public String toString()
    {
        return "Serial: " + getSerialNo() + "\nPrice: " + getPrice() + "\n(Student ID REQUIRED)";
    }
}
