package assignment4;

public class Card {
	private String suit, value;
	
	// constructor
	public Card(String suit, String value) {
		this.suit = suit;
		this.value = value;
	}
	
	// getter and setter for suit
	public String getSuit() {
		return suit;
	}
	public void setSuit(String suit) {
		this.suit = suit;
	}
	
	// getter and setter for value
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	public String toString() {
		return value + " of " + suit;
	}
}
