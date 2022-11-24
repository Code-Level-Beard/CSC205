package exercises.lists;

import java.util.Random;

public class ListDriver {

	public static void main(String[] args) {
		
		OrderedListClass<Integer> ranNums = new OrderedListClass<Integer>();
		Random ranNumGen = new Random();
		
		System.out.print("Numbers before sorting: ");
		
		for (int ii = 0; ii <= 15; ii++) {
			int placeHolder = ranNumGen.nextInt(100);
			ranNums.add(placeHolder);
			System.out.print(placeHolder + ", ");
		}
		
		System.out.println("\nNumbers after sorting: " + ranNums);
		
	}

}
