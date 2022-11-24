package activities.activity2excep;

import java.util.Scanner;

/**
 * Driver class for CSC205 Activity 2
 * 
 * @author Wade Huber
 * 
 * Modified by: Josh Decker
 *
 */
public class Activity2 {

	public static void main(String[] args) {

		Fraction sampleFraction = new Fraction(8,3);
		
		

		System.out.print ("Enter the numerator:  ");
	
		
		try  (Scanner scan = new Scanner(System.in);) {
			sampleFraction.setNumerator(scan.nextInt());
			
			System.out.print ("Enter the denominator:  ");
			sampleFraction.setDenominator(scan.nextInt());	

			System.out.println ("The fraction " + sampleFraction.getNumerator() + "/" +
			sampleFraction.getDenominator() + " is equal to " + sampleFraction.toMixedNumber());
		} 
		
		catch (Exception e) {
			System.out.println("There was an exception and it was: " + e.getMessage() + " \n\tProgram closing!");
		}
		
	}
}