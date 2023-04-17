package day6;
import java.util.*;
/**
 * 
 * @author DELL
 *
 */

public class FibonacciSeries {
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		/*
		 * 
		 */
		Scanner sc=new Scanner(System.in);
		int a=0,b=1,c=0,n,i;
		System.out.println("Enter teh limit = ");
		n=sc.nextInt();
		for(i=0;i<=n;i++) {
			System.out.print(b+" ");
			c=a+b;
			a=b;
			b=c;
		}
	}

}
