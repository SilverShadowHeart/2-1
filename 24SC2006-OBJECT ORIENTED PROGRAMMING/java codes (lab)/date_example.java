package neww;
import java.util.*;
public class date_example {
public static void main(String args[]) {
	Date d = new Date();
	System.out.println("current date is "+d);
	int month=d.getMonth();
	System.out.println("current month is "+month);
	int year=d.getYear();
	System.out.println("current year is "+year);
	System.out.println("current min is "+d.getMinutes());
	System.out.println("current day is "+d.getDay());
	System.out.println("current hour is "+d.getHours());
}
}

