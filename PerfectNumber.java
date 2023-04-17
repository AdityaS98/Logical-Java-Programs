package day6;

import java.util.*;

/**
 * 
 * @author DELL
 *
 */
public class PerfectNumber {
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int i, number, sum = 0;
		System.out.print("Enter any number:");
		number = sc.nextInt();

		for (i = 1; i < number; i++)
			if (number % i == 0) {
				sum += i;
			}
		if (sum == number) {
			System.out.print("It is a perfect number");
		} else {
			System.out.println("Not a perfect number");
		}

	}
}
