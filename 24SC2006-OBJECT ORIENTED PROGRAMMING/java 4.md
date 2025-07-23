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

yaml
Copy
Edit
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

CALENDAR 
