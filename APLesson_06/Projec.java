import java.util.Scanner;
public class Projec {
public static void main (String args[]){
	Scanner kb = new Scanner(System.in);
	System.out.println("Please enter the your maximum");
	int x = kb.nextInt();
	System.out.println("Please enter what you count by");
	int y = kb.nextInt();
	
	for (int i = 0; i <= x; i+=y)
	{
		System.out.print(i + "\t");
	}
}
}
