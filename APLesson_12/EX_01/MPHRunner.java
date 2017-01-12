import java.util.Scanner;
public class MPHRunner
{
	public static void main (String args[])
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the distance");
		int distance = kb.nextInt();
		System.out.println("Enter hours");
		int hours = kb.nextInt();			
		System.out.println("Enter minutes");
		int minutes = kb.nextInt();
		
		MilesPerHour mph = new MilesPerHour(distance, hours, minutes);
		
		
	}
}