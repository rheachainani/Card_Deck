/*
 * Name: Rhea Chainani
 * PRN: 22070126086
 * Batch: AIML-B1
*/
package assignment4;

class Main {
	public static void main(String[] args) {
		Deck deck = new Deck();
		deck.createDeck();
		System.out.println("---- Original Deck ----\n");
		deck.printDeck();
		deck.shuffleDeck();
		System.out.println("\n---- Shuffled Deck ----\n");
		deck.printDeck();
		deck.dealCard();
		System.out.println("\n---- Two chosen cards : ");
		Card card1 = deck.getCard();
		Card card2 = deck.getCard();
		deck.sameCard(card1, card2); 
		deck.compareCard(card1, card2);
		System.out.println("Card 1 found at index " + deck.findCard(card1.getSuit(), card1.getValue()));
		System.out.println("Card 2 found at index " + deck.findCard(card2.getSuit(), card2.getValue()));
		deck.identifyCard(card1);
		deck.identifyCard(card2); 
	} 
} 
