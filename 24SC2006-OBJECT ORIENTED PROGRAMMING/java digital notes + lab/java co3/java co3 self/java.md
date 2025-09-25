exceptions in java 

![[Pasted image 20250925185201.png]]


### 1. **Throwable**

The root. Everything bad extends from here.

---

### 2. **Error** (don’t handle, just die)

- Happens when **Java itself breaks**, not your code.
    
- Example:
    
    - `OutOfMemoryError` → JVM ran out of memory.
        
    - `StackOverflowError` → Infinite recursion.
        
- **When to use?** → Never. You don’t catch these. You fix your code or give JVM more memory.
    

---

### 3. **Exception** (stuff you _can_ handle)

Two types:

#### A) **Checked Exceptions** (compiler forces you to handle)

- These are usually **external problems** (files, network, threads).
    
- Examples:
    
    - `IOException` → File not found, network fails.
        
    - `ClassNotFoundException` → Reflection can’t find a class.
        
    - `InterruptedException` → A sleeping thread was interrupted.
        
- **When to use?**
    
    - If your method can face these, declare with `throws`.
        
    - Example: `FileReader` → always expect `IOException`.
        

`try {     FileReader fr = new FileReader("data.txt"); } catch (IOException e) {     System.out.println("File not found or error reading file."); }`

---

#### B) **Unchecked Exceptions (RuntimeException)**

- Usually **your code’s fault** (logic mistakes).
    
- Examples:
    
    - `NullPointerException` → Used null like an object.
        
    - `ArithmeticException` → Division by zero.
        
    - `IndexOutOfBoundsException` → Wrong array/list index.
        
    - `ClassCastException` → Wrong type casting.
        
- **When to use?**
    
    - You don’t “handle” these; you **fix your code**.
        
    - Example: if you get `NullPointerException`, check why the variable was null.
        

---

### 4. Golden Rule

- **Error** → Don’t touch. JVM problem.
    
- **Checked exception** → External, unpredictable → handle or declare.
    
- **Unchecked exception** → Bug in your logic → fix code, don’t just catch.

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

**Q4.** Create your own exception class `InvalidAgeException`. Write a program that throws this exception if age < 18.

**Q5.** Write a program with `finally` block that always prints `"End of program"`, even if an exception happens.

**Q6.** Write a method that declares `throws IOException` and simulate throwing it. Call this method from `main` with a proper `try-catch`.

**Q7.** Use multiple catch blocks: try dividing by zero, and also try converting `"xyz"` to integer in the same `try`. Handle both separately.