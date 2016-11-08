import java.util.Scanner;
public class tests
{
	public static void main(String[]args)
{
   Scanner kb = new Scanner(System.in);
   System.out.println("Please enter a number");
   int number = kb.nextInt();
   System.out.println(recur(number));
}
public static int recur(int n)
{
   if (n == 0)
       return 1;
   else
       return n * recur(n-1);
}
}