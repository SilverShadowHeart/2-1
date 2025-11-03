the java stream api is a sequence of elements that can be processed (filtered, mapped reduced etc) in a pipeline 

you can think of a steam as a conveyor belt
 the collection like list or set is the data source 
  the stream is the processing pipeline
the result  is produced without modifying the original data
how to create a stream 

from a collection

List`<Integer>` list Arrays.asList(1,2,3,4,5);
Stream`<Integer>` stream = list.stream();
2. from an array 
	Stream`<Integer>` stream = Stream.of(1,2,3,4,5);
3. from static methods 
	Stream`<Integer>` numbers =

common stream operations 


| Type         | Operation    | Description                               |
|---------------|--------------|------------------------------------------|
| Intermediate  | `filter()`   | Filters elements based on a condition.    |
|               | `map()`      | Transforms each element.                  |
|               | `sorted()`   | Sorts elements.                           |
|               | `distinct()` | Removes duplicates.                       |
| Terminal      | `collect()`  | Converts the stream to a collection.      |
|               | `forEach()`  | Performs an action for each element.      |
|               | `count()`    | Counts the elements.                      |
|               | `reduce()`   | Combines elements to produce one value.   |


create a string list convert every string to uppercase using map filter names starting with letter h using filter use the sorted to sort the names then use count the number of names in list 
