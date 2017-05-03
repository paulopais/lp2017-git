package aula9_2;

public class Card {
	private int cardNumber;
	private Suit cardSuit;
	
	public int getNumber() {
		return this.cardNumber;
	}

	public void setNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}
	
	public Suit getSuit() {
		return this.cardSuit;
	}

	public void setSuit(Suit cardSuit) {
		this.cardSuit = cardSuit;
	}

	public Card(int cardNumber, Suit cardSuit) {
		this.cardNumber = cardNumber;
		this.cardSuit = cardSuit;
	}

}
