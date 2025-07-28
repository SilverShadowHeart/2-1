package neww;

import java.util.Scanner;

public class sumofdigits {
	public static void main(String args[]) {
		Scanner ob = new Scanner(System.in);
		System.out.println("enter the value of a");
		String a = ob.next();
		int sum = 0;
		for (int i = 0; i < a.length(); i++) {
		    char ch = a.charAt(i);
		    int digit = ch - '0'; 
		    sum += digit;
		System.out.println("the sum of the given digit"+sum);
		ob.close();
		}
	
	}
	}
