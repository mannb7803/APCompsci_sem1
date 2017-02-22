import java.util.Arrays;
import java.util.ArrayList;

class EX_01
{
    public static void main (String args[])
    {

        Integer [] numbers = {2, 6, 8, 9, 10, 12, 13, 15, 17, 24, 55, 66, 78, 77, 79};
        ArrayList<Integer> num = new ArrayList<>(Arrays.asList(numbers));
        System.out.println(num);
        System.out.println(removePrimes(num));
    }
    public static int gFactor(int x)
    {
     //   System.out.println(x);
        for(int i = 2; i < x; i++)
        {
            if (x % i == 0)
            {
                return 1;
            }
        }
        return 0;
    }
    public static ArrayList removePrimes(ArrayList<Integer> num2)
    {
        for(int i = 0; i < num2.size(); i++)
        {
            System.out.println(gFactor(num2.get(i)));
            //System.out.println(num2);
            if(gFactor(num2.get(i)) == 0);
            {
                System.out.println(num2);
                num2.remove(i);
                System.out.println(num2);
                i--;
            }
        }
        return num2;
    }
}