package projects.project7sorting.cards;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Deck {
	private ArrayList<PlayingCard> cards;
	private Random rand;

	public Deck(int n) {
		super();
		rand = new Random();
		cards = new ArrayList<PlayingCard>(n);
		for (int suite = 1; suite <= 4; suite ++)
			for (int rank = 1; rank <= 13; rank ++) {
				if ((suite - 1) * 13 + rank <= n) { 
				  cards.add(new PlayingCard(rank, suite));
				}
			}
	}
	
	public PlayingCard dealOne() {
		return cards.get(rand.nextInt(52));
	}
	
	public void shuffle() {
			Integer[] nums = generateRandomArray(cards.size());
			
			for (int ii = 0; ii < nums.length; ii++) {
				for (int jj = ii + 1; jj < nums.length; jj++) {
					if (less_than(nums[jj], nums[ii])) {
						swap(nums, jj, ii);
						swap(cards, jj, ii);
					}
				}
			}
		}

		public static Integer[] generateRandomArray(int len) {
			Integer[] a = new Integer[len];
			Random rand = new Random();
		    for (int ii=0;ii<a.length;ii++) {
		    	a[ii] = rand.nextInt(1000);
		    }			
		    return a;
		}
		
		private static <T extends Comparable<T>> boolean less_than(T a, T b) {
			return (a.compareTo(b) < 0);
		}
		
		private static void swap(Object[] a, int ii, int jj) {
			Object swap = a[ii];
			a[ii] = a[jj];
			a[jj] = swap;
		}
		
		private void swap(ArrayList<PlayingCard> a, int ii, int jj) {
		PlayingCard swap = a.get(ii);
		a.set(ii, cards.get(jj));
		a.set(jj, swap);
	}
	
	public String toString(){
		String ret = "";
		for (PlayingCard card : cards){
			ret += card + " ";
		}
		return ret;
	}
}
