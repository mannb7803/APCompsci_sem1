import java.util.Scanner;
public class q1{
	


	public static void main (String args[])
	{
	Scanner kb = new Scanner(System.in);
	System.out.println("Please enter the first element in your compound: ");
	String element1 = kb.next();
	System.out.println("Now enter the electronegativity: ");
	double electro1 = kb.nextDouble();
	System.out.println("Please enter the second element in your compound: ");
	String element2 = kb.next();
	System.out.println("Now enter the electronegativity: ");
	double electro2 = kb.nextDouble();

	String bond = calcBond(electro1, electro2);
	System.out.println("The bond between " +element1+ " and " +element2+ " is " +bond);
	}
	public static String calcBond(double one, double two)
	{
	if (one > two)
	{
		if (one - two>= 1.7)
		{
			return "ionic";
		}
		else 
		{
			return "covalent";	
		}
	}
	else
	{
		if (two - one>= 1.7)
		{
			return "ionic";
		}
		else 
		{
			return "covalent";	
		}
	}

}
}