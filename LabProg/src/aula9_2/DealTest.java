package aula9_2;

import java.util.ArrayList;

import junit.framework.TestCase;

public class DealTest extends TestCase {

	public void testDealingOfCards() {
		Player teste = new Player("JG");
		Player teste1 = new Player("JG1");
		Player teste2 = new Player("JG2");
		Player teste3 = new Player("JG3");

		Deck deck = new Deck();
		ArrayList<Player> players = deck.getPlayers();
		ArrayList<Card> decks = deck.getDeck();
		
		
		players.add(teste);
		players.add(teste1);
		players.add(teste2);
		players.add(teste3);
		Dealer.deal(decks, players);
		
		for (int i = 0; i < players.size(); i++) {
			Player player = players.get(i);
			
			ArrayList<Card> cardsInHand = player.getCardsInHand();
		
			//assertEquals(cardsInHand.size(), 5);
			
			print(player, cardsInHand, deck);
			
		}
		assertEquals(decks.size(), 32);
	}

	private void print(Player player, ArrayList<Card> cardsInHand, Deck deck) {
		System.out.println(player.getName() + " has the following cards:");
		for (Card aCard : cardsInHand) {
			System.out.println(aCard.toString());
		}
		System.out.println();
	}
}