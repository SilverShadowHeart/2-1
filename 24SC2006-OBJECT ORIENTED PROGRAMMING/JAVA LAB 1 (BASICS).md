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
# 📘 Java Data Types (Beginner Notes)

---

## 🔸 WHAT ARE DATA TYPES?

**Definition:**  
Data types tell Java what kind of data a variable can store.

**Why it matters:**  
They help Java understand how much memory to reserve and how to handle the data.

---

## 🧱 TYPES OF DATA TYPES

Java has 2 main categories of data types:

1. **Primitive Data Types** → Built-in basic types  
2. **Non-Primitive Data Types** → Objects like String, Arrays, Classes

---

# ✅ PRIMITIVE DATA TYPES

Java has **8 primitive** types. They are not objects, just basic building blocks.

---

## 🔹 1. `byte`

- **Definition:** Stores small whole numbers  
- **Range:** -128 to 127  
- **Example:**
```java
byte a = 100;
```
---
## 🔹 2. `short`

- **Definition:** Stores medium-sized whole numbers
- **Range:** -32,768 to 32,767
- **Example:**


``` java
short b = 30000;
```

---

## 🔹 3. `int`

- **Definition:** Stores normal whole numbers    
- **Range:** ~ -2 billion to +2 billion
- **Example:**


``` java
int c = 123456;
```

---

## 🔹 4. `long`

- **Definition:** Stores very large whole numbers
- **Note:** Must end with `L`
- **Example:**

``` java
long d = 12345678900L;
```

---

## 🔹 5. `float`

- **Definition:** Stores small decimal numbers
- **Precision:** ~7 decimal digits
- **Note:** Must end with `f`
- **Example:**


``` java
float e = 12.34f;
```


---

## 🔹 6. `double`

- **Definition:** Stores large decimal numbers    
- **Precision:** ~15 decimal digits
- **Example:**
``` java
double f = 123.456789;
```

---

## 🔹 7. `char`

- **Definition:** Stores a single character (letters, digits, symbols)    
- **Use:** Single quotes `' '`
- **Example:**

```java
char g = 'A';
```

---

## 🔹 8. `boolean`

- **Definition:** Stores `true` or `false` values only    
- **Example:**

```java
boolean isJavaFun = true;
```

---

# 🧰 NON-PRIMITIVE DATA TYPES

These are objects and more advanced types.

---

## 🔹 1. `String`

- **Definition:** Stores a group of characters (text)    
- **Note:** Starts with capital `S` because it's a class
- **Example:**   

``` java
String name = "Tarun";
```

---

## 🔹 2. Arrays

- **Definition:** Stores multiple values of the same type in one variable    
- **Example:**

``` java
int[] marks = {90, 80, 70};
```

---

## 🔹 3. Classes and Objects

- **Definition:** Custom data types made by the user
- **Use:** Useful for storing and managing real-world objects    
- **Example:**

``` java
class Student {     String name;     int age; }
```

---
# 🧠 SUMMARY TABLE

| Type    | Category      | Stores            | Example                  |
| ------- | ------------- | ----------------- | ------------------------ |
| byte    | Primitive     | Small integers    | `byte a = 10;`           |
| short   | Primitive     | Medium integers   | `short b = 2000;`        |
| int     | Primitive     | Whole numbers     | `int c = 100000;`        |
| long    | Primitive     | Big whole numbers | `long d = 123456L;`      |
| float   | Primitive     | Small decimals    | `float e = 12.3f;`       |
| double  | Primitive     | Big decimals      | `double f = 45.678;`     |
| char    | Primitive     | Single character  | `char g = 'A';`          |
| boolean | Primitive     | true / false      | `boolean x = true;`      |
| String  | Non-Primitive | Text              | `String s = "Java";`     |
| Array   | Non-Primitive | Multiple values   | `int[] arr = {1,2,3};`   |
| Object  | Non-Primitive | User-defined data | `Student obj = new ...;` |

---

# 📝 NOTE

- Every variable must be declared with a data type.
- Primitive types are faster and use less memory.
- Non-primitive types are more powerful and flexible.    
- Java is **strict** with types — you can’t mix them without converting.    
---
# 🧪 Mini Practice

``` java
byte a = 10; 
int age = 20; 
float temp = 36.6f; 
boolean isHot = true; 
char grade = 'A'; 
String name = "Silver"; 
int[] scores = {90, 80, 70};
```