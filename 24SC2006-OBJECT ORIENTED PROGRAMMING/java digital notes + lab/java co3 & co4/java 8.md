comparator : java.util
purpose defines custom or multiple sorting logic externally 

method 
public int compareTo(T o1,T o2)
implementation a separate class or lambda implement comparator

usage when you want to sort objects in different eg by name by age etc 

example 

class NameComparator implements Comparator



| Feature               | Comparable       | Comparator        |
| --------------------- | ---------------- | ----------------- |
| Package               | `java.lang`      | `java.util`       |
| Method                | `compareTo()`    | `compare()`       |
| Sorting defined       | Inside the class | Outside the class |
| Logic                 | Natural order    | Custom order      |
| Number of sort orders | Only one         | Multiple possible |

it has one main abstract method (sice java 8 its a functional interface ):
int compareTo(T obj, T obj2):
 - returns a negative number if obj1 < obj2
 - returns 0 if obj1 == obj2
 - returns a positive number if obj1 > obj2

when to use comparator

define a class named student sort them by all the 3 id age marks 