package neww;

import java.util.Scanner;

public class sum_of_squares_till_N {
	public static void main(String args[]) {
		Scanner ob = new Scanner(System.in);
		System.out.println("enter the value of a");
		int a = ob.nextInt();
		int b = 0;
		for (int i = 0; i <= a ; i++) {
			b += i*i;
		}
		ob.close();
		System.out.println("the sum of squares till "+a +" is "+b);
	}
}
