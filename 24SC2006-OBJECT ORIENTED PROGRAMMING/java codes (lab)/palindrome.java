package neww;
import java.util.*;
public class palindrome {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	String var = sc.next();
	StringBuilder var1 = new StringBuilder(var);
	if ( var.equals(var1.reverse().toString())){
		System.out.println("the given is a plaindrome");
	}
	else {
		System.out.println("the given string is not a plaindrome");
	}
	sc.close();
}
}
