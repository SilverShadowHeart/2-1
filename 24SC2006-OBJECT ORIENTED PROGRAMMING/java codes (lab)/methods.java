package neww;

public class methods {
 public void niii() {
	 System.out.println("this is me doing a custom fucntion");
	 
 }
 public int niiiii() {
	 int a = 10;
	 return a;
 }
 public static void main(String args[]) {
	 methods n = new methods();
	 n.niii();
	 System.out.println("this is me using a main class");
	 int b = n.niiiii();
	 System.out.println(b);
 }
}
