/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card c1 = new Card("9", "Spades", 9);
		Card c2 = new Card("1", "Diamonds",1);
		Card c3 = new Card("10", "Hearts", 10);

		System.out.println("Card one matches two?" + c1.matches(c2));
		System.out.println("Card one matches three?" + c1.matches(c3));
		System.out.println("Suit of Card number 1: " + c1.suit());
		System.out.println("Card number 1: " + c1.toString());

		System.out.println("\nCard one matches two?" + c2.matches(c3));
		System.out.println("Suit of Card number 1: " + c2.suit());
		System.out.println("Card number 1: " + c2.toString());

		System.out.println("\nSuit of Card number 1: " + c3.suit());
		System.out.println("Card number 1: " + c3.toString());
	}
}
