/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] rank1 = {"Jack", "Queen", "King"};
		int[] value1 = {11, 12, 13};
		String[] suit1 = {"Hearts", "Hearts", "Hearts"};
		Deck deck1 = new Deck(rank1, suit1, value1);
		System.out.println("Deck1 size should be 3: " + deck1.size());

		String[] rank2 = {"9", "Queen", "Ace"};
		int[] value2 = {9, 12, 15};
		String[] suit2 = {"Spades", "Spades", "Diamonds"};
		Deck deck2 = new Deck(rank2, suit2, value2);
		System.out.println("Deck3 dealt card is: " + deck2.deal());


		String[] rank3 = {"4", "2", "0"};
		int[] value3 = {4, 2, 0};
		String[] suit3 = {"Diamonds", "Spades", "None"};
		Deck deck3 = new Deck(rank3, suit3, value3);
		System.out.println("Deck2 should not be empty: " + !deck3.isEmpty());

		String rComplete[] = new String[13];
		String sNotComplete[] = new String[4];
		sNotComplete[0] = "Spades";
		sNotComplete[1] = "Diamonds";
		sNotComplete[2] = "Hearts";
		sNotComplete[3] = "Clubs";
		String sComplete[] = new String[13];
		int iComplete[] = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
 		for(int i = 0; i <=9; i++)
		{
			rComplete[i] = i +2 + "";
		}
		rComplete[9] = "jack";
		rComplete[10] = "queen";
		rComplete[11] = "king";
		rComplete[12] = "Ace";
		for(int i = 0; i<sComplete.length; i++)
		{
			int temp = (int)(Math.random()*3);
		//	System.out.println(sNotComplete[temp]);
			sComplete[i] = sNotComplete[temp];
		}
		Deck fulldeck = new Deck(rComplete, sComplete, iComplete);
 		System.out.println("\n" + fulldeck);
 		fulldeck.shuffle();
 		System.out.println("\n" + fulldeck);




	}
}
