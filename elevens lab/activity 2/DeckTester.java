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
	}
}
