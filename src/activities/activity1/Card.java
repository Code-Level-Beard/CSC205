package activities.activity1;

import java.util.Random;

public class Card {
	private final static String cardFace[] = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
	private final static String cardSuit[] = { "Hearts", "Spades", "Diamonds", "Clubs" };
	Random dealer = new Random();
	private String dealtCardFaceValue, dealtCardSuit;

	public Card() {

	}
	
	public String getDealtCardFaceValue() {
		return dealtCardFaceValue;
	}

	public void setDealtCardFaceValue() {
		
		dealtCardFaceValue = cardFace[dealer.nextInt(12) +1];

	}
	
	public void setDealtCardSuit() {
		
			dealtCardSuit = cardSuit[dealer.nextInt(3) +1];
			
	}
	
	public String getDealtCardSuit() {
		
		return dealtCardSuit;

	}
		
	public void deal() {
		
		setDealtCardFaceValue();
		setDealtCardSuit();
	}

	public String getCard() {

		return dealtCardFaceValue + " " + dealtCardSuit;

	}

	@Override
	public String toString() {
		 return dealtCardFaceValue + " of " + dealtCardSuit;
	}

}

