import java.util.Scanner;
public class Discount
{
	public static double price1, price2, price3, price4, subtotal, tax, discount, fprice;
	public static String item1, item2, item3, item4; 
	public static void main (String args[])
	{
	Scanner kb = new Scanner(System.in);
		System.out.println("Please enter item 1");
		item1 = kb.nextLine();
		System.out.println("Please enter the price of item 1");
		price1 = kb.nextDouble();
		kb.nextLine();
		System.out.println("Please enter item 2");
		item2 = kb.nextLine();
		System.out.println("Please enter the price of item 2");
		price2 = kb.nextDouble();
		kb.nextLine();
		System.out.println("Please enter item 3");
		item3 = kb.nextLine();
		System.out.println("Please enter the price of item 3");
		price3 = kb.nextDouble();
		kb.nextLine();
		System.out.println("Please enter item 4");
		item4 = kb.nextLine();
		System.out.println("Please enter the price of item 4");
		price4 = kb.nextDouble();
		kb.nextLine();
		
		subtotal = price1 + price2 + price3 + price4;
		discount = calc();
		tax = subtotal * 0.08;
		fprice = subtotal - discount + tax;
		
		System.out.println("\t<<<<<<< Receipt >>>>>>>");
		
		printf(item1, price1);
		printf(item2, price2);
		printf(item3, price3);
		printf(item4, price4);
		printf("subtotal", subtotal);
		printf("Discount", discount);
		printf("Tax", tax);
		printf("Total", fprice);
		System.out.println("\t--------------------------");
		System.out.println("\tThank you for your business");
	}
		public static double calc()
		{
			if (subtotal >= 2000)
			{
				return discount = subtotal * 0.15;
			}
			else 
			{
				return discount = 0.0;
			}
		}
		public static void printf(String a, double b)
		{
			System.out.printf("%10s ........ %5.4f\n", a, b);
		}
}