package neww;

import java.util.Scanner;

public class cone_number_pattern {
	public static void main(String args[]) {
		Scanner ob = new Scanner(System.in);
		System.out.println("enter the value of a");
		int a = ob.nextInt();
		
		for (int i = a; i >0 ;i --) {
			for (int j=1;j <=i;j++) {
				System.out.print(j);
			}
			System.out.println("");
		}
		ob.close();
	}
}
