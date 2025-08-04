localdate represents a date without time and time zone 
local date.now()
is a static method in the java.time.LocalDate class that returns the current date from the system clock without any time or time zone 
it returns an object of type local date which includes 
year 
month
 day of month
LocalDate date = LocalDate.now()
date.getyear();
date.getMonth();
date.getDayofMonth();
date.detDayOfWeek();
date.plusDays(5);
date.minusMonth(2);
local date does not 


local time is used to represent only time hour minute second and nano second , without a date and without a timezone

use localtime only when we need things like
	school timing
	alarm setting
	booking times
	opening and closing hours
common menthods
getHour();
getMinute();
getSecond();
plusHours();
minusMinutes;
isBefore();
isAfter();



local date time is a class that represents a date and time without a timezone it combines local date and local time

getyear
getmonth
getdayofmonth
gethour
getminute
getsecond
plusdays
minushous
tolocaldate
tolocaltime


period class its is used to find diff between 2 local date values like age of a person or time until a event

it represents amount of time in years month and days

getyears
getmonths
getdates
iszero
isnegative
plus
minus
multipliedby

