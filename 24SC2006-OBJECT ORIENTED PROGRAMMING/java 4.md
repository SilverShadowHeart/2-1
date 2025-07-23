legacy classes
date
calendar
time 
utils 

code :

```java
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
```


output:
```
current date is Wed Jul 23 10:12:19 IST 2025

current month is 6

current year is 125

current min is 12

current day is 3

current hour is 10
```

# 🕒 Java Legacy Date/Time Notes – Clear & Detailed

Legacy classes like `java.util.Date` and `java.util.Calendar` often return confusing values because of outdated design choices. Here’s what those values really mean:

---

## 🔹 Month = 6

- `Date.getMonth()` or `Calendar.MONTH` gives **months starting from 0**.
- Meaning:
  - `0` → January
  - `1` → February
  - ...
  - `6` → **July**
- So if you see:
month = 6 → it means July

- ⚠️ **Misleading** because normal human indexing starts from 1.

---

## 🔹 Year = 125

- `Date.getYear()` returns the **number of years since 1900**.
- So:
125 → 1900 + 125 = 2025

yaml
Copy
Edit
- Why? Because this class was originally made for 20th-century use only.

---

## 🔹 Day = 3

There are **two ways** to get the day in legacy Java. Both behave differently:

### A. If using Date.getDay() (deprecated)
- Returns the **day of the week**, starting from **0 (Sunday)**

| value | day       |
| ----- | --------- |
| 0     | sunday    |
| 1     | monday    |
| 2     | tuesday   |
| 3     | wednesday |
| 4     | thursday  |
| 5     | friday    |
| 6     | saturday  |


So:
day = 3 → Wednesday

yaml
Copy
Edit

### B. If using Calendar.get(Calendar.DAY_OF_WEEK)
- It starts from **1 (Sunday)**:
```
  | Value | Day        |
  |-------|------------|
  | 1     | Sunday     |
  | 2     | Monday     |
  | 3     | Tuesday    |
  | 4     | Wednesday  |
  | 5     | Thursday   |
  | 6     | Friday     |
  | 7     | Saturday   |
```

---

## 🔹 Time (Hour and Minute)

- `getHours()` → returns hour in 24-hour format
  - So `10` = 10 AM (correct as-is)
- `getMinutes()` → returns minutes (0–59)
  - So `12` = 12 minutes past the hour

---

| Field        | Value from Legacy API | What it Really Means    | Notes                       |
|--------------|------------------------|---------------------------|-----------------------------|
| `month = 6`  | 0-based index          | July                      | Add 1 to match real month   |
| `year = 125` | Years since 1900       | 1900 + 125 = **2025**     | Add 1900                    |
| `day = 3`    | Day of week (Sun=0)    | **Wednesday**             | From `getDay()`             |
| `hour = 10`  | 10                     | 10 AM                     | Already accurate            |
| `min = 12`   | 12                     | 12 minutes                | Already accurate    

## ✅ Difference between `Calendar` and `Date`

note learn 4-5 methods for exam

|Aspect|`Date` (`java.util.Date`)|`Calendar` (`java.util.Calendar`)|
|---|---|---|
|Purpose|Represents a **specific point in time**|Used to manipulate **date/time fields** (year, month, etc.)|
|Mutability|Mutable, but limited control|Mutable, and gives field-level control (set/get day, month)|
|Usefulness|Can only represent date/time, not manipulate|Allows date math: add/subtract days, set specific fields|
|Modern Usage|Mostly deprecated|Still used but replaced by `java.time` in Java 8+|

### Summary:

- **Use `Date`**: When you just want a time snapshot (e.g., current time).
    
- **Use `Calendar`**: When you want to **set**, **get**, or **manipulate parts** of a date (like year/month/day).
    

---

code:

```java
package neww;

import java.util.*;

public class calender{

public static void main(String args[]) {

Calendar c = Calendar.getInstance();

Date d=c.getTime();

System.out.println(d);

c.set(2023, c.SEPTEMBER,13);

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
```

output:

```
Wed Jul 23 10:30:01 IST 2025

2023

1

day of the week: 4

day of the year: 256

day of the month: 13

week in the year: 37

day of the week: 4

day of the month in year: 13

hour 10

minute 30

second 1

am or pm 0

hour (24-hour clock 10
```

## 🔍 (Line-by-Line)



`Calendar c = Calendar.getInstance();`

- Returns a `Calendar` object initialized with the **current date and time**.
    
- Typically gives you a `GregorianCalendar` internally.
    

---


`Date d = c.getTime(); System.out.println(d);`

- Converts the `Calendar` into a `Date` object.
    
- `Date` will print the current date-time as:  
    `Wed Jul 23 10:12:19 IST 2025` (example)
    

---


`c.set(2023, c.SEPTEMBER, 13);`

- Sets the calendar to **13th September 2023**.
    
- Note: Months are **0-based**, so `c.SEPTEMBER = 8`.
    

---

`int year = c.getWeekYear(); System.out.println(year);`

- Returns the **year that the week belongs to**.
    
- Useful when a week (like Jan 1) starts in the previous year.
    

---


`int h = c.getFirstDayOfWeek(); System.out.println(h);`

- Returns the **first day of the week** in your locale.
    
    - Usually `1` (Sunday) or `2` (Monday)
        
    - Value matches `Calendar.SUNDAY`, `Calendar.MONDAY`, etc.
        

---

`System.out.println("day of the week: " + c.get(Calendar.DAY_OF_WEEK));`

- Returns the **day of the week** for the date (e.g., `4` → Wednesday)
    

---



`System.out.println("day of the year: " + c.get(Calendar.DAY_OF_YEAR));`

- Day number within the year, starting from Jan 1 = 1.
    
- E.g., Sep 13 = 256th day in 2023.
    

---



`System.out.println("day of the month: " + c.get(Calendar.DAY_OF_MONTH));`

- Day in the month: `13` (from the date you set)
    

---


`System.out.println("week in the year: " + c.get(Calendar.WEEK_OF_YEAR));`

- Week number of the year that this date belongs to.
    
- Useful in calendar views or reporting.
    

---



`System.out.println("day of the month in year: " + c.get(Calendar.DAY_OF_MONTH));`

- Same as above. `DAY_OF_MONTH` and `day of month in year` refer to same value.
    

---


`System.out.println("hour " + c.get(Calendar.HOUR));`

- Returns hour in **12-hour format (0–11)**.
    

---


`System.out.println("minute " + c.get(Calendar.MINUTE));`

- Current minute (0–59).
    

---



`System.out.println("second " + c.get(Calendar.SECOND));`

- Current second (0–59).
    

---


`System.out.println("am or pm " + c.get(Calendar.AM_PM));`

- Returns:
    
    - `0` → AM
        
    - `1` → PM
        

---



`System.out.println("hour (24-hour clock) " + c.get(Calendar.HOUR_OF_DAY));`

- Returns hour in **24-hour format (0–23)**.
    
- More reliable than `Calendar.HOUR`.
    

---

## ✅ Notes for Reference

|Field|Description|Range / Values|
|---|---|---|
|`Calendar.YEAR`|Year (e.g., 2025)|1900+|
|`Calendar.MONTH`|Month (0-based)|0 (Jan) to 11 (Dec)|
|`Calendar.DAY_OF_MONTH`|Day in month|1–31|
|`Calendar.DAY_OF_YEAR`|Day in year|1–365/366|
|`Calendar.DAY_OF_WEEK`|Day in week|1 (Sun) – 7 (Sat)|
|`Calendar.HOUR`|Hour (12-hour format)|0–11|
|`Calendar.HOUR_OF_DAY`|Hour (24-hour format)|0–23|
|`Calendar.MINUTE`|Minute|0–59|
|`Calendar.SECOND`|Second|0–59|
|`Calendar.AM_PM`|AM or PM indicator|0 = AM, 1 = PM|
|`Calendar.WEEK_OF_YEAR`|Week number in year|1–52/53|
|`Calendar.getFirstDayOfWeek()`|Usually returns `1 (Sunday)` or `2 (Monday)`|Locale-dependent|
|`getTime()`|Converts `Calendar` to `Date`|




functions present in string class 
the string class has a set of built in methods that you can use on strings 
length() returns the length of a specified string
toUpperCase() will convert the string into upper case
toLowerCase() will convert the string into lower case 
charAt() index always starts at 0 not 1 it will give char
compareTo() will try to give some val does asccii calculations every time a mismatch is found
compareToIgnoreCase() it will ignore the casing unlike compareto which is case sensitive 
concat() it will attach two strings together and give us the new combined string
contains() it will check if the string is there or not it will check for sequence eg
if hello is a string and i have hel in the contains the it will look for hel if string is holel it will return false  
contentEquals() it will 
endsWith()
equals()
compares two strings returns true or false if they are equal strings then true else it will be false 
indexOf("") it will find the first occurrence of the given element
	equalsIgnoreCase()
	isEmpty()
	join()
	lastIndex()
matches() it gives true or false tries to see if given things are there are not if all are not present then it will give false
replace()
