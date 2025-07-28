package neww;

public class method_overloading {
	public int sum(int a,int b) {
		return a+b;
		
	}
	void sum(float a,float b) {
		float c =a+b;
		System.out.println(c);
	}
	
	void sum(int a,float b,double c) {
		double d = a+b+c;
		System.out.println(d);
	}
	public double sum(double a,double b) {
		return (a+b);
	}

	public static void main(String args[]) {
		method_overloading ob = new method_overloading();
		System.out.println(ob.sum(10, 10));
		ob.sum(2.5f, 5.3f);
		ob.sum(10,3.5f, 50.6);
		System.out.println(ob.sum(59.9,59.0));
	}
}

