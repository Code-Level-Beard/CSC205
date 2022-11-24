package exercises.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapActivity {
	
	public static void countEach(Integer userArray[]) {
		Map<Integer, Integer> nums = new HashMap<Integer, Integer>();
		for (int x: userArray) {
			if ( nums.containsKey(x)) {
				nums.replace(x, nums.get(x) +1);
			}
			else {
				nums.put(x, 1);
			}
		}
		
		System.out.println("Total counts: ");
		for (int y: nums.keySet()) {
			System.out.println(y + " occurs " + nums.get(y) + " times.");
		}
		
	}

	public static void main(String[] args) {
		Integer a2[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 8, 6, 7, 8, 1, 1, 1, 8, 8, 2, 4, 5, 7};
		
		countEach(a2);
	}

}
