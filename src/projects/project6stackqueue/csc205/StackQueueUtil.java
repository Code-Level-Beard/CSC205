package projects.project6stackqueue.csc205;

import projects.project6stackqueue.jsjf.LinkedQueue;
import projects.project6stackqueue.jsjf.LinkedStack;

public class StackQueueUtil {

	public static boolean isPalindrome(String s) {
		String str = s.replaceAll("[^a-zA-Z0-9]", "");
		String tester = str.toLowerCase();

		if (tester.length() == 0) {
			return false;
		}

		LinkedStack<Character> charStack = new LinkedStack<Character>();
		LinkedQueue<Character> charQueue = new LinkedQueue<Character>();

		for (int ii = 0; ii < tester.length(); ii++) {
			charStack.push(tester.charAt(ii));
			charQueue.enqueue(tester.charAt(ii));
		}

		for (int ii = 0; ii < tester.length(); ii++) {
			if (!charQueue.first().equals(charStack.peek())) {
				return false;
			}
			charQueue.dequeue();
			charStack.pop();
		}

		return true;
	}

	public static String reverseWords(String str) {
		String revStr = "";
		LinkedStack<Character> revStack = new LinkedStack<Character>();
		LinkedQueue<Character> charQueue = new LinkedQueue<Character>();

		for (int ii = 0; ii < str.length(); ii++) {
			charQueue.enqueue(str.charAt(ii));
		}

		while (charQueue.isEmpty() == false) {
			if (charQueue.first() == ' ') {
				revStack.push(charQueue.dequeue());
				while (revStack.size() > 0) {
					revStr += revStack.pop();
				}
			}
			if (!(charQueue.first() == ' ')) {
				revStack.push(charQueue.dequeue());
			}
		}

		if (charQueue.isEmpty() == true) {
			while (revStack.isEmpty() == false) {
				revStr += revStack.pop();
			}
		}
		return revStr;
	}

	public static boolean checkArrays(int min, int max, int[] testArr1, int[] testArr2) {
		LinkedQueue<Integer> arrQueue1 = new LinkedQueue<Integer>();
		LinkedQueue<Integer> arrQueue2 = new LinkedQueue<Integer>();

		for (int ii = 0; ii < testArr1.length; ii++) {
			if (testArr1[ii] >= min && testArr1[ii] <= max) {
				arrQueue1.enqueue(testArr1[ii]);
			}
		}
		
		for (int ii = 0; ii < testArr2.length; ii++) {
			if (testArr2[ii] >= min && testArr2[ii] <= max) {
				arrQueue2.enqueue(testArr2[ii]);
			}
		}
		
		while (arrQueue1.isEmpty() == false) {
			if (arrQueue1.dequeue() != arrQueue2.dequeue()) {
				return false;
			}
		}
		
		return true;
	}

}
