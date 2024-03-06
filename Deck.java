package assignment4;
import java.util.*;

class Deck {
	ArrayList<Card> cards = new ArrayList<Card>();
	
	public void createDeck() {
		String[] values = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		String[] suit = {"Spades","Diamonds","Clubs","Hearts"};
		
		for(String s: suit) {
			for(String v: values) {
				cards.add(new Card(s,v));
			}
		}
	}
	
	public void printDeck() {
		for(Card card: cards) {
			System.out.println(card);
		}
	}
	
	// sameCard - Card which is from same suit
	// compareCard - Card having same rank or number
	// dealCard - randomly deal 5 cards
	// findCard - return index of particular card
	// identifyCard - face or number
	// shuffleDeck - Randomize the deck
	
	public void shuffleDeck() {
		Collections.shuffle(cards);
	}
	
	public void dealCard() {
		shuffleDeck();
		System.out.println("---- Dealing 5 cards : ");
		for(int i = 0; i < 5; i++)
			System.out.println(cards.get(i));
	}
	
	public Card getCard() {
		shuffleDeck();
		Card card = cards.get(0);
		System.out.println(card.getValue() + " of " + card.getSuit());
		return card;
	}
	
	public boolean sameCard(Card card1, Card card2) {
		if (card1.getSuit() == card2.getSuit()) {
			System.out.println("Same suit");
			return true;
		}
		else {
			System.out.println("Different suit");
			return false;
		}
	}
	
	public boolean compareCard(Card card1, Card card2) {
		if (card1.getValue() == card2.getValue()){
			System.out.println("Same value");
			return true;
		}
		else {
			System.out.println("Different value");
			return false;
		}
	}
	
	public int findCard(String suit, String value) {
		for(int i = 0; i < 52; i++) {
			if(cards.get(i).getSuit() == suit && cards.get(i).getValue() == value)
				return i;
		}
		return 0;
	}
	
	public void identifyCard(Card card) {
		String value = card.getValue();
		if(value == "A" || value == "K" || value == "Q" || value == "J")
			System.out.println(card.getValue() + " of " + card.getSuit() + " is a face card");
		else
			System.out.println(card.getValue() + " of " + card.getSuit() + " is a number card");
	}
}
