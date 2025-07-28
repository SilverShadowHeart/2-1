package neww;

public class multiplemethods {
 public void A() {
	 System.out.println("this is func a");
 }
 public void B() {
	 System.out.println("this is func b");
 }
 public void c() {
	 A();
	 System.out.println("this is func c");
 }
 public void d() {
	 B();
	 System.out.println("this is func d");
	
 }
 public static void main(String args[]) {
	 multiplemethods mm = new multiplemethods();
	 mm.c();
	 mm.d();
	 
 }
}
