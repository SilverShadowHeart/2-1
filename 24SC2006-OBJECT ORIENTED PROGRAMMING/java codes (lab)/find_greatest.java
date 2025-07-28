package neww;
import java.util.*;
public class find_greatest {
public static void main(String args[]) {
	Scanner ob = new Scanner(System.in);
	System.out.println("enter the value of a");
	int a = ob.nextInt();
	System.out.println("enter the value of b");
	int b = ob.nextInt();
	System.out.println("enter the value of c");
	int c = ob.nextInt();
	
	if (a >= b && a >= c) {
		System.out.println("the value of a is greater s"+a);
	}
	else if (b >= a && b >= c) {
		System.out.println("the value of b is greater "+b);
		
	}
	else if (a == b && a == c) {
		System.out.println("all the given values are same "+a);
	}
	else {
		System.out.println("the value of c is greater "+c);
	}
	ob.close();
}
}
