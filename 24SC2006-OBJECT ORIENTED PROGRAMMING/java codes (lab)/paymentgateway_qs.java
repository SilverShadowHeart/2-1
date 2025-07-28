package neww;
import java.util.Scanner;
public class paymentgateway_qs {
	public void pay(int a) {
		System.out.println("cash payed "+a);
	}
	public void pay(int a,long b) {
		System.out.println("card payed "+a+"card number "+b);
	}
	public void pay(int a, long b,String c) {
		System.out.println("upi payed "+a+"transaction number "+b+"app "+c);
	}
 public static void main(String args[]) {
	 Scanner  Sc = new Scanner(System.in);
	 
 }
}
