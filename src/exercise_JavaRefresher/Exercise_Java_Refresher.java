//Program Name: Exercise_Java_Refresher.java
//Author: Joshua Decker
//Class: CSC205
//Date Written: 8/23/2022
//Brief Description: Program that converts fahrenheit to celsius, converts  a string, averages the even numbers in an array, and outputs text based on instructions from the professor. 
package exercise_JavaRefresher;


public class Exercise_Java_Refresher {
	
	public static double convertTemp(double degF) {
		double degC =  (degF - 32) * (0.55);
		return Math.round(degC);
	}
	
	public static String convertString(String inputString, int rCase) {
		String convertedString;
		int dCase = rCase;
		
		if (dCase < 0) {
			return convertedString = inputString.toLowerCase();
		}
		if (dCase > 0) {
			return convertedString = inputString.toUpperCase();
		}
		else {
			return convertedString = "";
		}
	}
	
	public static int avgEvens(int inpNum[]) {
		int total = 0;
		int numOfEvens = 0;
		int avgOfEvens = 0;
		
		for (int i = 0; i < inpNum.length; i++) {
			if (inpNum[i] % 2 == 0) {
				total = total + inpNum[i];
				numOfEvens++;
			}
		}
		return avgOfEvens = total / numOfEvens;
	}


	public static void main(String[] args) {
		
		System.out.println("convertTemp:");
		for (int t = 30; t < 111; t += 20) {
			System.out.println("\t" + t +"F = " + convertTemp(t) +"C");
		}
		
		String inpStr[] = {"Hello, WORLD!", "CSC205", "Activity 0 - Java Review"};
		
		System.out.println( "\nconvertString:"); 
		
		int j = 0;
		
		for (int i = -1; i < 2; i++) {;
			if (j < inpStr.length) {
				System.out.println("\t" +inpStr[j] + ", is converted to " + convertString(inpStr[j], i));
			}
			j++;
		}
		
		System.out.println("\navgEvens:");
		
		int numSet1[] = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		
		System.out.print("\tAvg=" + avgEvens(numSet1) + " for ");
		
		for (int i = 0; i < numSet1.length; i++) {
			System.out.print(numSet1[i] + " ");
		}
		
		int numSet2[] = {17,24,99,100,-43,-60};
		
		System.out.print("\n\tAvg=" + avgEvens(numSet2) + " for ");
		
		for (int i = 0; i < numSet2.length; i++) {
			System.out.print(numSet2[i] + " ");
		}
	}
}
