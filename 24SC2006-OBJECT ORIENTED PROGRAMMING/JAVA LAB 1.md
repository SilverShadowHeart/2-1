## 📦 PACKAGE

**Definition:**  
`package` is a keyword that helps us group Java files into a folder.

**Content:**  
It helps organize code. All Java files in the same package are usually in the same folder.

**Example:**

```java
package neww;
```
---

## 🧱 CLASS

**Definition:**  
`class` is a keyword used to define a class. A class is a collection of functions and objects.

**Content:**  
It is like a box that holds your code.

**Example:**

```java
public class hellooo {
    // code goes here
}
```

---

## 🔐 PUBLIC

**Definition:**  
`public` is an access modifier.

**Content:**  
It allows code (like class or method) to be used from outside its file or package.

**Example:**

```java
public class hellooo
public static void main(String[] args)
```

---

## 🧠 MAIN FUNCTION

**Definition:**  
`main` is the entry point of every Java program.

**Content:**  
Java starts running from here. The method must be written exactly like this:

**Example:**

```java
public static void main(String[] args)
```

### 🔹 Breaking It Down:
- `public` → anyone can access this function.
- `static` → no need to create an object.    
- `void` → no value is returned.
- `main` → the function name. 
- `String[] args` → optional input from the user (command line).

---
## 📤 PRINT STATEMENT

**Definition:**  
Used to display text on the screen.

**Content:**  
Uses `System.out.println()` or `System.out.print()`.

- `System` = built-in package    
- `out` = output object
- `println()` = function to print + new line
- `print()` = function to print on same line

**Example:**

```java
System.out.println("Hello Java!");
```

🖨️ Output:

```
Hello Java!
```

---

## 🗨️ COMMENTS

**Definition:**  
Used to write notes inside code that are ignored by Java.

**Types:**

### 🔹 Single Line

```java
// This is a single-line comment
```

### 🔹 Multi-Line

```java
/* This is a 
   multi-line comment */
```

---

## 🧩 SYMBOLS

| Symbol | Meaning                                  |
| ------ | ---------------------------------------- |
| `;`    | Ends a statement                         |
| `{}`   | Group code blocks (class, method, loops) |
| `""`   | Used to write text in print statements   |

---

## EXAMPLE PROGRAM

```java
package neww;

public class hellooo {
    public static void main(String[] args) {
        System.out.println("hello java class this is my print");
    }
}
```

---

## 📎 Save This File As:

```
hellooo.java
```

> 💡 It must be saved in a folder named `neww` (same as the package).

---
