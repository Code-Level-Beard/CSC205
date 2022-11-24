package activities.activity8;

public class SearchingDriver {

	public static void main(String[] args) {
			Integer targets[] = {10, 50, 60, 200, 300};

			Integer[] testArray = new Integer[100];
			
			for (int ii = 0; ii < 100; ii++) {
				testArray[ii] = ii * 2;
			}
			
			System.out.println("Testing Interpolation Search function: ");
			for (Integer target: targets) {
			System.out.println("Target is: " + target);
			Integer search = Searching.interpolationSearch(testArray, target);
			System.out.println("Result: " + search + ". Found in " + Searching.getCounter() + " tries");
			}
			
			
	}
	
	

}
