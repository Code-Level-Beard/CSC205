package activities.activity1;

public class CardDriver {

	public static void main(String[] args) {

		int cardsToDeal = 5;
		Card[] dealtCard = new Card[cardsToDeal];
		

		for (int i = 0; i < cardsToDeal; i++) {
		
			dealtCard[i] = new Card();

			dealtCard[i].deal();

			System.out.println(dealtCard[i]);

		}

	}

}
