import java.util.Scanner;
public class Main
{
	public static void main (String args[])
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter x1");
		int x1 = kb.nextInt();
		System.out.println("Please enter x2");
		int x2 = kb.nextInt();
		System.out.println("Please enter y1");
		int y1 = kb.nextInt();
		System.out.println("Please enter y2");
		int y2 = kb.nextInt();
		distance dis = new distance(x1, x2, y1, y2);
		
		System.out.println("Distance = " + dis.getDist());
		
		System.out.println("Please enter x1");
		x1 = kb.nextInt();
		System.out.println("Please enter x2");
		x2 = kb.nextInt();
		System.out.println("Please enter y1");
		y1 = kb.nextInt();
		System.out.println("Please enter y2");
		y2 = kb.nextInt();
		dis.setValues(x1, x2, y1, y2);
		System.out.println("Distance = " + dis.getDist());
	}
}