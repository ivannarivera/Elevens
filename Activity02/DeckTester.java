package Activity02;

/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
	String[] ranks = {"Ace", "Queen", "King", "Jack"};
	    String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
	    int[] vals = {14, 12, 13, 11};
		Deck deck1 = new Deck(ranks, suits, vals);
		Deck deck2 = new Deck(ranks, suits, vals);
		Deck deck3 = new Deck(ranks, suits, vals);
		System.out.println(deck1.size());
		System.out.println(deck2.deal().toString());
	}
}
