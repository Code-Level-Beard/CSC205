package exercises;

public class Recursion_exercise {

	public static int func1(int n) {
		if (n == 1) {
			return 10;
		}
		else {
			return func1(n - 1) + 3;
		}
	}

	public static long func2(int n) {
		if (n == 1) {
			return 1;
		}
		else {
			return (n * n) * func2(n -1);
		}
	}

	public static int func3(int n) {
		if (n ==1) {
			return -1;
		}
		else {
			if (n%2 ==0) {
				return n + func3(n -1);
			}
			else {
				return (-1 * n) + func3(n-1);
			}
		}
	}

	public static int tribonacci(int n) {
		if (n == 1) {
			return 1;
		}
		else if (n == 2) {
			return 1;
		}
		else if (n == 3) {
			return 2;
		}
		else {
			return tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
		}
	}

	public static int add(int x, int y) {
		if ( x == 0) {
			return y;
		}
		else {
			return add(x-1,y) + 1;
		}
	}

	public static String printDownFrom(int n) {
		if (n == 1) {
			return " " + n + " ";
		}
		else {
			return " " + n  + " " + " " + printDownFrom(n-1) + " ";
		}
	}

	public static void printUpTo(int n) {
		if (n == 1) {
			System.out.print(" " + n + " ");
			return;
		}
		else {
			printUpTo(n - 1);
			System.out.print(" " + n + " ");
		}
	}

	public static int gCD(int x, int y) {
		if (y <= x && x % y == 0) {
			return y;
		}
		else if (y > x) {
			return gCD(y,x);
		}
		else {
			return gCD(y, x % y);
		}
	}

	public static Boolean isPalindrome(String n) {
		if (n.length() == 1 | n.length() == 0) {
			return true;
		}
		else if (n.charAt(0) == n.charAt(n.length() - 1)) {
			isPalindrome(n.substring(0, n.length() -1));
		}
		else {
			return false;
		}
		return true;
	}

	public static void collatz(int n) {
		System.out.print(n + " ");
		if (n > 1) {
			if ( n % 2 == 0) {
				collatz(n / 2);
			}
			else {
				collatz(3 * n +1);
			}
		}
	}


	public static void main(String[] args) {

		collatz(1);
		System.out.println();
		collatz(5);
		System.out.println();
		collatz(19);
		System.out.println();
	}
}
