package neww;
import java.util.*;
public class string_builder {
 public static void main(String args[]) {
	 StringBuilder sb2 = new StringBuilder();
	 StringBuilder sb1 = new StringBuilder("this is a string");
	 
	 Scanner sc = new Scanner(System.in);
	 System.out.println("enter a string");
	 String str = sc.nextLine();
	 StringBuilder sb = new StringBuilder(str);
	 
	 sb.append("hello");
	 System.out.println(sb);
	 System.out.println(sb.insert(0, "hi"));
	 System.out.println(sb.reverse());
	 System.out.println(sb.replace(1, 8, "neww java"));
	 System.out.println(sb.delete(1, 8));
	 System.out.println(sb.capacity());
	 sb1.setCharAt(1, 'a');
	 System.out.println(sb1);
	 System.out.println(sb1.substring(5,8));
	 System.out.println(sb.deleteCharAt(2));
	 System.out.println(sb.toString());
		 
 }
}
