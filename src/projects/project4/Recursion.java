package projects.project4;

public class Recursion {

	public static void printRow() {
		System.out.print("*");
	}
	
	public static void printColumn() {
		
	}
	
    // Activity 4 
    public static int fib (int n)
    {
    	if (n <= 1) {
    		return n;
    	}
    	else {
    		return fib(n -1) + fib(n - 2);
    	}
    }
     
    public static int power (int x, int y)
    {
        if (y == 0) {
        	return 1;
        }
        else {
        	return x * power(x, y-1);
        }
    }
     
    public static int ackermann(int m, int n)
    {
        if (m == 0) {
        	return n + 1;
        }
        else if ( m > 0 && n == 0) {
        	return ackermann(m-1,1);
        }
        else {
        	return ackermann(m-1,ackermann(m,n-1));
        }
    }

    public static void triangle(int height)
    {
    	if (height == 0) {
    		return;
    	}
    	else {
        	printRow();
        	if (height >1) {
        		System.out.println();
        		printRow();
        		if (height > 2) {
        			triangle(1);
        		}
        		triangle(height - 1);
        	}
    	}
    }

    // Project 4
    public static int balance(int x, int y) {
        if ( x < y) {
        	int tempX = x;
        	x = y;
        	y = tempX;
        }
        if (x - y <= 1) {
        	return y;
        }
        else {
        	return balance(x-1,y+1);
        }
    }
     
	public static double pi_approximation(int n)
	{
        if (n == 1) {
        	return 1;
        }
        else {
        	return ((Math.pow(-1, (n+1))) / ((2*n) -1)) + pi_approximation(n -1);
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
		
	public static boolean monotonicallyIncreasing(Integer[] a) {
		if (a.length == 1) {
			return true;
		}
		else {
			return monotonicallyIncreasing(a, 0);
		}
	}
	public static boolean monotonicallyIncreasing(Integer[] a, int index) {
		if (index >= a.length - 1) {
			return true;
		}
		else if (a[index] > a[index +1]) {
			return false;
		}
		else {
			return monotonicallyIncreasing(a, index + 1);
		}
	}
	
}
