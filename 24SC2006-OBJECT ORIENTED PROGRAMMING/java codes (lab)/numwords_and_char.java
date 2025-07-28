package neww;
import java.util.*;
public class numwords_and_char {
 public static void main(String args[]) {
	 Scanner sc = new Scanner(System.in);
	 String var = sc.nextLine();
	 char countchar[] = var.toCharArray();
	 String words[] = var.split(" ");
	 System.out.println(words.length);
	 System.out.println(countchar.length);
	 sc.close();
 }
}
