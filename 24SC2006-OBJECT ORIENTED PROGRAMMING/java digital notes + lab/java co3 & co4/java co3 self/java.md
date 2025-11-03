exceptions in java 

![[Pasted image 20250925185201.png]]


### **Errors (JVM-level, don’t handle)**

- **OutOfMemoryError** → Heap runs out of memory.
    
- **StackOverflowError** → Infinite recursion eats stack.
    
- **VirtualMachineError** → JVM internal crash.
    
- **LinkageError** → Class problems at load time (wrong bytecode, missing defs).
    
- **AssertionError** → Failed `assert` statement.
    

---

### **Checked Exceptions (external, must handle/declare)**

- **IOException** → General I/O failure.
    
    - **FileNotFoundException** → File doesn’t exist.
        
    - **EOFException** → Reached end of file unexpectedly.
        
    - **SocketException** → Network socket broke.
        
- **SQLException** → Database access error.
    
- **ClassNotFoundException** → Class missing at runtime (reflection/class loader).
    
- **NoSuchMethodException** → Method not found via reflection.
    
- **IllegalAccessException** → Trying to access a private/protected field/method reflectively.
    
- **CloneNotSupportedException** → Object doesn’t implement `Cloneable`.
    
- **InterruptedException** → A thread was interrupted during sleep/wait.
    

---

### **Unchecked Exceptions (RuntimeException — your bugs)**

- **ArithmeticException** → Divide by zero.
    
- **NullPointerException** → Using `null` like a real object.
    
- **ArrayIndexOutOfBoundsException** → Invalid array index.
    
- **StringIndexOutOfBoundsException** → Invalid string index.
    
- **NumberFormatException** → Bad string-to-number conversion (`"abc"` → int).
    
- **ClassCastException** → Wrong type cast.
    
- **IllegalArgumentException** → Passing bad argument to a method.
    
- **IllegalStateException** → Method called at the wrong time.
    
- **ConcurrentModificationException** → Modify a collection while iterating over it.
    
- **UnsupportedOperationException** → Called a method not supported (like modifying unmodifiable list).
    

---

### **Golden Usage Rule**

- **Error** → JVM broken → fix environment/code, don’t catch.
    
- **Checked Exception** → Unpredictable external issue (files, network, DB) → _handle or declare_.
    
- **Unchecked Exception** → Pure logic bug → _fix your code_, don’t just catch.

**Q1.** Write a program that divides two numbers. Handle the case where the denominator is zero using `try-catch`.


ans 
```java
 public static void main(String args[]) {

try {

Scanner s = new Scanner(System.in);

int a = s.nextInt();

int b = s.nextInt();

int result = a/b;

System.out.println(result);

} catch (ArithmeticException e) {

System.out.println("cant divide with 0 "+e);

}

}
```
**Q2.** Create an array of 5 integers. Try to access index 10 and catch the exception that occurs.

```java 
try {

int[] Array = {1,2,3,4,5};

System.out.println("enter an element to access :");

Scanner q = new Scanner(System.in);

int element = q.nextInt();

System.out.println(Array[element]);

} catch (IndexOutOfBoundsException e) {

System.out.println("cant access elemnt out side the given array "+e);

}
```



**Q3.** Write a program that converts a `String` to an integer. Handle the case where the string is `"abc"` (invalid number).

```java 
try {

Scanner s = new Scanner(System.in);

String aw = s.nextLine();

int a =Integer.parseInt(aw);

} catch (NumberFormatException e) {

System.out.println("cant convert to a number "+e);

}

```

**Q4.** Create your own exception class `InvalidAgeException`. Write a program that throws this exception if age < 18.

**Q5.** Write a program with `finally` block that always prints `"End of program"`, even if an exception happens.

**Q6.** Write a method that declares `throws IOException` and simulate throwing it. Call this method from `main` with a proper `try-catch`.

**Q7.** Use multiple catch blocks: try dividing by zero, and also try converting `"xyz"` to integer in the same `try`. Handle both separately.