# Card Deck Simulation

## Overview

This Java project simulates a deck of playing cards, providing various functionalities such as creating a deck, shuffling cards, dealing cards, and comparing cards. It includes three main classes: `Main`, `Card`, and `Deck`. The `Main` class serves as the entry point for the program, while the `Card` class represents individual playing cards, and the `Deck` class manages the entire deck of cards.

## Main Class

The `Main` class initializes a deck, prints the original deck, shuffles the deck, and performs various card-related operations. It demonstrates the usage of the `Deck` class methods.

## Card Class

The `Card` class represents a playing card with a suit and a value. It includes a constructor to initialize the card, getter and setter methods for the suit and value, and a `toString` method to display the card's information.

## Deck Class

The `Deck` class manages a collection of `Card` objects, providing methods for creating a deck, shuffling cards, dealing cards, comparing cards, and more. Some key functionalities include:

- **createDeck:** Initializes a standard deck of 52 playing cards.
- **printDeck:** Prints the entire deck of cards.
- **shuffleDeck:** Randomly shuffles the order of cards in the deck.
- **dealCard:** Randomly deals 5 cards from the deck.
- **getCard:** Retrieves and prints the information of the top card in the deck.
- **sameCard:** Compares two cards and determines if they belong to the same suit.
- **compareCard:** Compares two cards and checks if they have the same value.
- **findCard:** Finds the index of a specific card in the deck based on suit and value.
- **identifyCard:** Identifies whether a card is a face card or a number card.

## Usage

To use the card deck simulation, follow these steps:

1. Create an instance of the `Deck` class.
2. Call the various methods provided by the `Deck` class to perform operations on the deck of cards.

```java
Deck deck = new Deck();
deck.createDeck();
deck.shuffleDeck();
deck.printDeck();
deck.dealCard();
Card card1 = deck.getCard();
Card card2 = deck.getCard();
deck.sameCard(card1, card2);
deck.compareCard(card1, card2);
