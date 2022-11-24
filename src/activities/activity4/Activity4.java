package activities.activity4;

import java.util.Arrays;
import java.util.List;

public class Activity4 {

		public static void main(String[] args) {
			List<Integer> testValues = Arrays.asList(1, 5, 10, 20);
			
			System.out.println("Activity 4 Testing:");

			// Test Fibonacci
			System.out.println();
			System.out.println("Fibonacci:");
			System.out.print("  ");
			for (Integer ii : testValues) {
				System.out.print(Recursion.fib(ii) + "   ");
			}
			System.out.println();

			// Test power function
			System.out.println();
			System.out.println("Power:");
			for (Integer ii : testValues) {
				System.out.print("  ");
				for (int jj = 0; jj<6; jj ++)  {
					System.out.print(ii + "^" + jj + "=" + Recursion.power(ii,jj) + "   ");
				}
				System.out.println();
			}

			// Test the Ackermann function 
			System.out.println();
			System.out.println("Ackermann:");
			testValues = Arrays.asList(1, 2, 3);
			for (Integer ii : testValues)
			{
				System.out.print("  ");
				for (int jj = 0; jj < 5; jj++)
				{
					System.out.print(Recursion.ackermann(ii,jj) + "\t");
				}
				System.out.println();
			}
			
			// Test triangle method
			System.out.println();
			System.out.println("Triangle");
			Recursion.triangle(2);
			System.out.println();
			Recursion.triangle(4);

		}
		
	}


