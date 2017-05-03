package aula9_2;

import java.util.ArrayList;

public class Deck {

	private ArrayList<Player> players;
	private ArrayList<Card> deck;

	public Deck() {
		players = new ArrayList<Player>(4);
		deck = drawDeck(32);
	}
	
	public ArrayList<Card> drawDeck(int deckSize)
	{
		ArrayList<Card> newDeck = new ArrayList<Card>(deckSize);
		
		for(int i=1; i <= deckSize/4; i++)
		{
			newDeck.add(new Card(i, Suit.Clubs));
			newDeck.add(new Card(i, Suit.Diamonds));
			newDeck.add(new Card(i, Suit.Hearts));
			newDeck.add(new Card(i, Suit.Spades));
		}
		
		return newDeck;
	}

	public ArrayList<Player> getPlayers() {
		return players;
	}

	public ArrayList<Card> getDeck() {
		return deck;
	}

}
