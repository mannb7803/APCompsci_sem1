import java.util.Scanner;
public class Inventory
{
    public static String manufacturer, name, category;
    public static int UPC, price;
    public static Scanner kb = new Scanner(System.in);
    public Inventory()
    {
        manufacturer = null;
        name = null;
        UPC = 0;
        price =0;
        category = null;
    }

    public Inventory(String m, String n)
    {
        manufacturer = m;
        name = n;
        UPC = (int)(Math.random() * 1000000) + 1;
        category = "UNIDENTIFIED";
        price = 0;
    }
    public Inventory(String m, String n, String c, int p)
    {
        manufacturer = m;
        name = n;
        UPC = (int)(Math.random() * 1000000) + 1;
        category = c;
        price = p;
    }
    public String toString()
    {
        return "Manufacturer: " + manufacturer + "\nName: " + name + "\nCategory: " + category + "" + "\nPrice: " + price + "\nUPC ID: " + UPC;
    }

    public static void main (String args[])
    {
        Inventory i = new Inventory();
        System.out.println("Do you want to enter a price and category, enter yes or no");
        String ans = kb.nextLine();
        if(ans.equalsIgnoreCase("no"))
        {
            System.out.println("Please enter the manufacturer");
            manufacturer = kb.nextLine();
            System.out.println("Please enter the name");
            name = kb.nextLine();
            i = new Inventory(manufacturer, name);
        }
        if(ans.equalsIgnoreCase("yes"))
        {
            System.out.println("Please enter the manufacturer");
            manufacturer = kb.nextLine();
            System.out.println("Please enter the name");
            name = kb.nextLine();
            System.out.println("Please enter the category");
            category = kb.nextLine();
            System.out.println("Please enter the price");
            price = kb.nextInt();
            i = new Inventory(manufacturer, name, category, price);
        }
        System.out.println(i);
    }
}