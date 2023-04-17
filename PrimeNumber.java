package day6;

import java.util.*;

/**
 * 
 * @author DELL
 *
 */

public class PrimeNumber {
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		int number, i, c = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number ");
		number = sc.nextInt();
		for (i = 2; i < number; i++)
			c = 1;
		if (number % i == 0) {
			System.out.println("It is a prime number");
		} else {
			System.out.println("It is not a prime number");
		}
	}

}
