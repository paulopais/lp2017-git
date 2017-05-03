package aula9_2;

import java.util.ArrayList;

public class Player {

	private String name;
	private ArrayList<Card> cardsInHand;
	
	public String getName() {
		return this.name;
	}

	public void setName(String playerName) {
		this.name = playerName;
	}
	
	public ArrayList<Card> getCardsInHand() {
		return this.cardsInHand;
	}

	public void setCardsInHand(ArrayList<Card> cardsInHand) {
		this.cardsInHand = cardsInHand;
	}

	public Player(String name) {
		this.name = name;
	}

}
