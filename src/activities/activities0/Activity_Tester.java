package activities.activities0;

import java.util.Scanner;

public class Activity_Tester {
	
	public static boolean isSquare(int a) {
		boolean result = false;
		if (Math.sqrt(a) % 1 == 0) {
			result = true;
		}
		return result;	}

	public static void printSquare(int x)  {
		System.out.print("Squares: ");
		for (int i = 1; (i * i) < x; i++) {
			System.out.print(" " + i * i);	}
		System.out.println();	}
	
	/*public static void find_xy(int limit) {
		int x = 0;
		int y = 0;
		
		System.out.println("find_xy: ");
		
		for (int i = 1; (i * i) < limit; i++) {
			x = i;
			int diff = limit - (i * i);
			y = diff / 3;
			
			if ((x * x) + (3 * y) < limit) {
				System.out.println("x=" + x + ", y=" + y );	
				}
			}
		}*/

	public static void find_xy(int limit) {
		int a = limit;
		int x = 1;
		int y = 1;

		System.out.println("find_xy: ");

		do {	
			for (int j = 0; j < a; j++) {
				if ((x * x) + (3 * y) < a &&  (y * y ) + (3 * x) < a ) {
					System.out.println("x=" + x + ", y=" + y );	
					System.out.println(isSquare((x * x) + (3 * y)));}
				y++;
			}while (y < a);
			y =1; 
			x++;
		}while (x < a);
	}

	public static void main(String[] args) {
		int userInput;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter a whole number between 1-1000");

		userInput = scanner.nextInt();

		do {
			if (userInput < 0 || userInput > 1000) {
				System.out.println("Sorry, you entered an invalid number. Please enter a whole number between 1-1000");
				userInput = scanner.nextInt();
			}
		} while (userInput < 1 || userInput > 1000);

		System.out.println("You entered: " + userInput);
		System.out.println(isSquare(userInput));

		printSquare(userInput);
		System.out.println();
		find_xy(userInput);
		System.out.println();

		scanner.close();
	}

}
