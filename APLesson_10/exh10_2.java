import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class exh10_2
{
	public static Scanner kb = new Scanner(System.in);
	public static void main (String args[])
	{
		System.out.println("Please enter an equation with multiplication(*), division(/), addition(+), or subtraction(-) seperated by spaces");
		String expression = kb.nextLine();
		ArrayList <String> equation = new ArrayList<>(Arrays.asList(expression.split(" ")));	
		System.out.println(doEq(equation));
	}
	public static ArrayList doEq(ArrayList<String> eq)
	{
		int i = 0;
		while (i < eq.size())
		{
			if (eq.get(i).equals ("*") || (eq.get(i).equals("/")))
			{
				if (eq.get(i).equals ("*"))
				{
					eq.set(i, "" + (Integer.parseInt(eq.get(i-1)) * Integer.parseInt(eq.get(i+1))));
					eq.remove(i+1);
					eq.remove(i-1);
				}
				else
				{
				eq.set(i, "" + (Integer.parseInt(eq.get(i-1)) / Integer.parseInt(eq.get(i+1))));
				eq.remove(i+1);
				eq.remove(i-1);
				}
			}
			else
			{
				i++;
			}
		}
		i = 0;
		while (i < eq.size())
		{
			if (eq.get(i).equals ("+") || (eq.get(i).equals("-")))
			{
				if (eq.get(i).equals ("+"))
				{
					eq.set(i, "" + (Integer.parseInt(eq.get(i-1)) + Integer.parseInt(eq.get(i+1))));
					eq.remove(i+1);
					eq.remove(i-1);
				}
				else
				{
				eq.set(i, "" + (Integer.parseInt(eq.get(i-1)) - Integer.parseInt(eq.get(i+1))));
				eq.remove(i+1);
				eq.remove(i-1);
				}
			}
			else
			{
				i++;
			}
		}
		return eq;
	}
	
}