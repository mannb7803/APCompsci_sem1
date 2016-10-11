import java.util.Random;
public class dice
{
	public static int player, computer;
	public static String winner;
	public static void main (String args[])
	{
	Random roll = new Random();	
	player = roll.nextInt(6) + 1;
	computer = roll.nextInt(6) + 1;
	rollDice();
	System.out.println("Player rolled " + player);
	System.out.println("Computer rolled " + computer);
	System.out.println(winner);
	}
	public static void rollDice()
	{
		if(player > computer)
		{
			winner = ("Player wins");
		}
		if(computer > player)
		{
			winner = ("Computer wins");
		}
	}
}