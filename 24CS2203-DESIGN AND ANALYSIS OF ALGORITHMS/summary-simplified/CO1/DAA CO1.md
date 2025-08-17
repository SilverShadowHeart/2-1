### Algorithm

#### Definition
An algorithm is a finite set of instructions that can be used to perform a particular task.  
In other words, it is a step-by-step procedure to solve a particular problem.  
Here, the problem is essentially an expression of an algorithm containing a set of instructions.

#### Origin
The word "algorithm" comes from the Persian mathematician and scholar Muhammad ibn Musa al-Khwarizmi (c. 780–850 AD).

#### Characteristics
- A set of rules for performing calculations manually or on a machine.
- Must be finite and well-defined.
- Produces a result for a given input.

1. **Input**  
   It generally requires a finite number of inputs.

2. **Output**  
   It must produce at least one output.

3. **Definiteness**  
   Each instruction must be clear and unambiguous (no confusion).

4. **Finiteness**  
   It must terminate after a finite number of steps.

5. **Effectiveness**  
   Every step of an algorithm should be feasible; in other words, each step must be executable manually.


### Steps Involved with an Algorithm

#### 1. How to Devise / Create an Algorithm
- Creating an algorithm is an art that may never be fully automated.  
- Algorithmic design strategies help in creating many useful algorithms.  
- Studying these design strategies is crucial in learning algorithm design.

#### 2. How to Analyze an Algorithm
- Analysis determines how much time and space an algorithm requires.  
- Also called **performance analysis**, focusing on mathematics and logic.  
- Behavior must be assessed in **best case**, **average case**, and **worst case** scenarios.

#### 3. How to Validate an Algorithm
- Validation checks whether an algorithm computes the correct result for all legal inputs.  
- Ensures the algorithm works properly, independent of programming language.

#### 4. How to Test an Algorithm
- **Debugging:** Identify, analyze, and remove errors or bugs to ensure correct operation.  
- **Profiling:** Measure performance characteristics like execution time, memory usage, function call frequency/duration, and resource utilization.  
- Profiling helps find performance bottlenecks and optimization opportunities.


### Algorithm Representation

#### Definition
An algorithm is a sequence of instructions written in simple English or mathematical notations.  

#### Other Representations
Programmers also use visual or structured representations:  
1. **Flowchart** – High-level description of an algorithm using graphical workflow symbols.  
2. **Pseudo-code** – Uses programming-like syntax for human readability, focusing on logic and flow rather than language-specific details.

### Pseudo-Code for Writing Algorithms

1. **Comments**  
   - Begin with `//` and continue until the end of the line.

2. **Blocks**  
   - Indicated with matching braces `{ }`.

3. **Identifiers & Data Types**  
   - Begin with a letter.  
   - Data types of variables are implicit.  
   - Compound types can use **records**:  
     ```text
     Record Node:
       data type-1 data-1;
       data type-n data-n;
     ```

4. **Assignment**  
   - `<Variable> := <expression>`  
   - Example: `a := 10;`

5. **Boolean Values**  
   - `TRUE` and `FALSE`  

6. **Operators**  
   - **Logical:** AND, OR, NOT  
   - **Relational:** =, <>, >, <, >=, <=

7. **Looping Statements**  
   - **While Loop:**  
     ```text
     while <condition> do {
       <statement-1>
       ...
       <statement-n>
     }
     ```  
   - **For Loop:**  
     ```text
     for variable := value-1 to value-2 step <step> do {
       <statement-1>
       ...
       <statement-n>
     }
     ```  
   - **Repeat-Until Loop:**  
     ```text
     repeat {
       <statement-1>
       ...
       <statement-n>
     } until <condition>
     ```

8. **Conditional Statements**  
   - **If-Then:** `if <condition> then <statement>`  
   - **If-Then-Else:**  
     ```text
     if <condition> then <statement-1>
     else <statement-2>
     ```  
   - **Case Statement:**  
     ```text
     case
       <condition-1>: <statement-1>
       ...
       <condition-n>: <statement-n>
       else: <statement-n+1>
     ```

9. **Input/Output**  
   - Use `read` & `write` instructions.  

10. **Procedure/Algorithm Definition**  
    - Only one type: `Algorithm Name(<Parameter list>)`
    - 
### Do's and Don'ts for Writing Pseudo-Code

#### Do's
- Use control structures.  
- Follow proper naming conventions.  
- Maintain indentation and white spacing.  
- Keep it simple.  
- Keep it concise.

#### Don'ts
- Don't make pseudo-code overly abstract.  
- Don't generalize too much.

### Example: Binary Search Algorithm in Pseudo-Code

```text
Function BinarySearch(A, n, key)
  // A is a sorted array of size n
  // key is the value to search for
  low := 1
  high := n

  while low <= high do {
    mid := (low + high) / 2

    if A[mid] = key then
      return mid       // key found at index mid

    else if A[mid] < key then
      low := mid + 1   // search in the right half

    else
      high := mid - 1  // search in the left half
  }

  return -1             // key not found

```



### **Question 1**

Pseudo-code:

```
for i := 1 to 4 step 1 do
    if +--i then
        display i
    end-if
end-for
```

- The `+--i` part is unclear in strict pseudo-code. If interpreted as **pre-decrement then unary plus** like in C (`+--i`):
    
    - `i` starts at 1 → `--i` makes it 0 → `+0` = 0 → false → not displayed
        
    - i = 2 → `--i` = 1 → true → display 1
        
    - i = 3 → `--i` = 2 → true → display 2
        
    - i = 4 → `--i` = 3 → true → display 3
        

**Output (assuming C-style interpretation):**

```
1
2
3
```



### **Question 2**

Pseudo-code:

```
Set Character c = '7'
switch (c)
    case '1': display "One"
    case '7': display "Seven"
    case '2': display "Two"
    default: display "Hello"
break
end-switch
```

- `c = '7'` → matches `case '7'` → display **Seven**
    
- `break` stops further cases.
    

**Output:**

```
7
```




dummy questions :

1. Write an algorithm for calculating the factorial of a number?

2. write an algorithm to check if a given string is a palindrome


# Asymptotic Notations

Asymptotic notations are tools to describe how an algorithm’s running time or space requirement grows with input size. They help analyze **efficiency** in terms of:

- **Time complexity** – How long an algorithm takes to run  
- **Space complexity** – How much memory it uses  

They describe the **limiting behavior** of a function as input size becomes very large.

---

## Why We Use Them

1. Express the **growth trend** of algorithms.  
2. Compare algorithms **independently of hardware**.  
3. Predict performance for **large inputs**.

---

## Common Types of Time Complexity

| Complexity | Description | Example |
|------------|------------|---------|
| **O(1)** – Constant | Same time regardless of input size | Accessing an array element |
| **O(log n)** – Logarithmic | Time grows slowly, dividing problem each step | Binary search in sorted array |
| **O(n)** – Linear | Time grows proportionally to input size | Finding an element by scanning a list |
| **O(n log n)** – Linearithmic | Slightly worse than linear, often in divide & conquer | Merge sort |
| **O(n²)** – Quadratic | Nested loops over input | Comparing all pairs in an array |
| **O(2ⁿ)** – Exponential | Time doubles with each input increase | Generating all subsets of a set |
| **O(n!)** – Factorial | Very slow, tries all permutations | Traveling Salesman Problem |

---

## Examples

1. **Linear search:**  
   - 1,000 books → may need to check all 1,000 shelves.  
   - **Worst case:** O(n)  

2. **Best case:**  
   - Book found on the first shelf → O(1)  

3. **Binary search:**  
   - Eliminate half of remaining books each check.  
   - **Time complexity:** O(log n)  

---

## Notation Definitions

### 1. Big O (O)
- **What it means:** Upper bound / worst-case
- **Formula:**  
  $$
  f(n) = O(g(n)) \quad \text{if } \exists c>0, n_0>0: f(n) \le c \cdot g(n) \text{ for all } n \ge n_0
  $$
- **Example:**  
  $f(n) = 3n^2 + 2n + 1 \implies f(n) = O(n^2)$

---

### Omega Notation (Ω)

- **Purpose:** Describes a **lower bound** of an algorithm’s running time — the **best-case** scenario or the shortest time it can take.  
- **Formal definition:**  
  $$
  f(n) = \Omega(g(n)) \quad \text{if there exist constants } c>0 \text{ and } n_0>0 \text{ such that } f(n) \ge c \cdot g(n) \text{ for all } n \ge n_0
  $$
- **Example:**  
  $$
  f(n) = 3n^2 + 2n + 1 \implies f(n) = \Omega(n^2)
  $$  
  Here, the algorithm **cannot be faster than quadratic** in the best case asymptotically.


---

### Theta Notation (Θ)

- **Purpose:** Describes a **tight bound** on an algorithm’s running time — the **average-case** or asymptotically exact growth.  
- **Formal definition:**  
  $$
  f(n) = \Theta(g(n)) \quad \text{if there exist constants } c_1, c_2 > 0 \text{ and } n_0 > 0 \text{ such that } c_1 \cdot g(n) \le f(n) \le c_2 \cdot g(n) \text{ for all } n \ge n_0
  $$
- **Example:**  
  $$
  f(n) = 3n^2 + 2n + 1 \implies f(n) = \Theta(n^2)
  $$  
  This means the algorithm’s growth is **asymptotically quadratic**, neither faster nor slower.

---
### Little o Notation (o)

- **Purpose:** Describes an **upper bound that is not tight** — a function that grows **strictly slower** than the comparison function.  
- **Formal definition:**  
  $$
  f(n) = o(g(n)) \quad \text{if } \lim_{n \to \infty} \frac{f(n)}{g(n)} = 0
  $$
  Equivalently,  For large enough $n$, $f(n) < c \cdot g(n)$ for any constant $c > 0$.

- **Example:**  
  $$
  f(n) = n \implies f(n) = o(n^2)
  $$  
  This means a **linear algorithm grows strictly slower than a quadratic algorithm** as input size increases.


---
### Little Omega Notation (ω)

- **Purpose:** Describes a **lower bound that is not tight** — a function that grows **strictly faster** than the comparison function.  
- **Formal definition:**  
  $$
  f(n) = \omega(g(n)) \quad \text{if } \lim_{n \to \infty} \frac{f(n)}{g(n)} = \infty
  $$
  Equivalently, For large enough $n$, $f(n) > c \cdot g(n)$ for any constant $c > 0$.

- **Example:**  
  $$
  f(n) = n^2 \implies f(n) = \omega(n)
  $$  
  This means **quadratic grows strictly faster than linear** as input size increases.  

- **Intuition:** If \(f(n) = \omega(g(n))\), then \(g(n)\) grows asymptotically slower than \(f(n)\) as \(n \to \infty\).


---

## Quick Reference

| Notation | Bound Type | Case |
|----------|------------|------|
| O(g(n)) | Upper | Worst-case |
| Ω(g(n)) | Lower | Best-case |
| Θ(g(n)) | Tight | Average-case |
| o(g(n)) | Upper (strict) | Strictly less |
| ω(g(n)) | Lower (strict) | Strictly more |

---

## Summary of Intuition

- **O:** “It will take **at most** this long”  
- **Ω:** “It will take **at least** this long”  
- **Θ:** “It takes roughly this long”  
- **o:** “Definitely less than this”  
- **ω:** “Definitely more than this”  

## [YOUTUBE click me p1 ](https://youtu.be/7dz8Iaf_weM?si=ZsQqUv0RzDD2dwlg)

## [YOUTUBE click me p2 ](https://youtu.be/Hk_AWLNjGLs?si=IY1S9wRvm0UtepqF)


#### numerical comparison 

| n   | log₂(n) | n·log₂(n) | n²     | 2ⁿ            |
| --- | ------- | --------- | ------ | ------------- |
| 1   | 0       | 0         | 1      | 2             |
| 2   | 1       | 2         | 4      | 4             |
| 4   | 2       | 8         | 16     | 16            |
| 8   | 3       | 24        | 64     | 256           |
| 16  | 4       | 64        | 256    | 65,536        |
| 32  | 5       | 160       | 1,024  | 4,294,967,296 |
| 64  | 6       | 384       | 4,096  | —             |
| 128 | 7       | 896       | 16,384 | —             |
| 256 | 8       | 2,048     | 65,536 | —             |



### Linear Search (O(n))

```

for i = 0 to n-1:  
if array[i] == target:  
return i  
return -1

```

**Explanation:**  
- Scan each element one by one.  
- **Best case:** target at first position → O(1)  
- **Worst case:** target not found or at last position → O(n)  

---

### Binary Search (O(log n))

```

low = 0  
high = n - 1  
while low <= high:  
mid = (low + high) // 2  
if array[mid] == target:  
return mid  
elif array[mid] < target:  
low = mid + 1  
else:  
high = mid - 1  
return -1

```

**Explanation:**  
- Requires a **sorted array**.  
- Divide and conquer: check middle, reduce search space by half.  
- **Best case:** middle element is target → O(1)  
- **Worst case:** halves until single element left → O(log n)



### Bubble Sort (O(n²))

```

for i = 0 to n-1:  
for j = 0 to n-i-1:  
if array[j] > array[j+1]:  
swap(array[j], array[j+1])

```

**Explanation:**  
- Repeatedly compare adjacent elements and swap if out of order.  
- Largest element "bubbles" to the end each pass.  
- **Time Complexity:**  
  - Best case: O(n) (already sorted, with optimized version)  
  - Worst case: O(n²) (reverse sorted)  

---

### Insertion Sort (O(n²))

```

for i = 1 to n-1:  
key = array[i]  
j = i - 1  
while j >= 0 and array[j] > key:  
array[j+1] = array[j]  
j -= 1  
array[j+1] = key

```

**Explanation:**  
- Take one element at a time and insert it into the sorted portion.  
- **Time Complexity:**  
  - Best case: O(n) (already sorted)  
  - Worst case: O(n²) (reverse sorted)
