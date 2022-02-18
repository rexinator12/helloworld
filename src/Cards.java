import java.util.ArrayList;

public class Cards {
	
	ArrayList<String> cards = new ArrayList<String>();
	//all cards of a deck mentioned once because suite doesn't matter. Accepts amount to know how many decks to add.
	void decks(int amount) {
		//repeats 4 times due to there being 4 of the same cards in 1 deck
		for (int i = 0; i < amount * 4; i++) {
			cards.add("Ace");
			cards.add("King");
			cards.add("Queen");
			cards.add("Jack");
			cards.add("10");
			cards.add("9");
			cards.add("8");
			cards.add("7");
			cards.add("6");
			cards.add("5");
			cards.add("4");
			cards.add("3");
			cards.add("2");	
	}
	}
}

