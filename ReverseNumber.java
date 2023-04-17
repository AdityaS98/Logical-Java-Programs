package day6;
import java.util.*;
/**
 * 
 * @author DELL
 *
 */

public class ReverseNumber {
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int number,a = 0,d=0;
		System.out.println("Enter a number");
		number=sc.nextInt();
		
		while(number>0) {
			int b = number%10;
			d=(d*10)+b;
			number=number/10;
		}
		System.out.println("Reverse Of a numbe is "+d);
	}

}
