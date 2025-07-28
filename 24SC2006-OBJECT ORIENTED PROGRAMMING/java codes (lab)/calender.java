package neww;
import java.util.*;
public class calender{
public static void main(String args[]) {
Calendar c = Calendar.getInstance();
Date d=c.getTime();
System.out.println(d);
c.set(2023, Calendar.SEPTEMBER,13);
int year = c.getWeekYear();
System.out.println(year);
int h=c.getFirstDayOfWeek();
System.out.println(h);
System.out.println("day of the week: "+c.get(Calendar.DAY_OF_WEEK));
System.out.println("day of the year: "+c.get(Calendar.DAY_OF_YEAR));
System.out.println("day of the month: "+c.get(Calendar.DAY_OF_MONTH));
System.out.println("week in the year: "+c.get(Calendar.WEEK_OF_YEAR));
System.out.println("day of the week: "+c.get(Calendar.DAY_OF_WEEK));
System.out.println("day of the month in year: "+c.get(Calendar.DAY_OF_MONTH));
System.out.println("hour "+c.get(Calendar.HOUR));
System.out.println("minute "+c.get(Calendar.MINUTE));
System.out.println("second "+c.get(Calendar.SECOND));
System.out.println("am or pm "+c.get(Calendar.AM_PM));
System.out.println("hour (24-hour clock) "+c.get(Calendar.HOUR_OF_DAY));

}
}

