package neww;
import java.util.*;

public class class2 {
    public static void main(String args[]) {
     Scanner ob = new Scanner(System.in);
     
     System.out.println("enter employee id:");
     int val = ob.nextInt();
     System.out.println("enter employee name:");
     String val1 = ob.next();
     System.out.println("enter employee department:");
     String val2 = ob.next();
     System.out.println("enter employee experience:");
     float val3 = ob.nextFloat();
     System.out.println("enter status of employee full-time?");
     boolean val6 = ob.nextBoolean();
     System.out.println("enter employee salary:");
     Double val4 = ob.nextDouble();
     System.out.println("enter employee contact");
     Long val5 =ob.nextLong();
     
     System.out.println("-----employee details---");
     System.out.println("id:"+val);
     System.out.println("name:"+val1);
     System.out.println("department:"+val2);
     System.out.println("experience:"+val3);
     System.out.println("isfulltime :"+val6);
     System.out.println("salary:"+val4);
     System.out.println("contact:"+val5);
     
     ob.close();
     
    }
}
