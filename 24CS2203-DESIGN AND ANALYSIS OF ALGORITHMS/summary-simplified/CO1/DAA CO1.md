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


### Asymptotic Notations

Asymptotic notations are tools to describe how an algorithm’s running time or space requirement grows with input size. They help analyze **efficiency** in terms of:

- **Time complexity** – How long an algorithm takes to run  
- **Space complexity** – How much memory it uses  

They describe the **limiting behavior** of a function as input size becomes very large.

---

#### Why We Use Them

1. Express the **growth trend** of algorithms.  
2. Compare algorithms **independently of hardware**.  
3. Predict performance for **large inputs**.

---

#### Common Types of Time Complexity

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

- **Intuition:** If $(f(n) = \omega(g(n))$, then $g(n)$ grows asymptotically slower than $f(n)$ as $n \to \infty$.


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

```pyhton

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

```python

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

```python

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

```python

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


### Performance Analysis of Algorithms

The efficiency of an algorithm is measured by its **time** and **space** requirements.

We mainly concentrate on:
- **Space Complexity**
- **Time Complexity**

---

#### Space Complexity

Space complexity can be defined as the total memory required by the algorithm during execution.

It consists of:
1. **Constant part (C)** – fixed space required (instructions, variables, identifiers, inputs/outputs).
2. **Variable part (Sp)** – space dependent on instance characteristics (e.g., input size).

 Formula:
$$
S(p) = C + Sp
$$

---

 Example 1:
```cpp
// a, b, c are floating type
return a + b + c;
````

- `a, b, c` each require 1 word.
    
- Total size = 3.
    

So,

S(p)=3

For an array of size `n`,

S(p)=n

---

Example 2:

**Algorithm Add(x, n):**

```pseudo
sum := 0.0
for i = 1 to n do
    sum := sum + x[i]
return sum
```

**Space required:**

- `x[i]` → `n` space
    
- `n` → 1 space
    
- `i` → 1 space
    
- `sum` → 1 space
    

Therefore,

S(p)=n+3

### [CLICK ME YOUTUBEE](https://www.youtube.com/watch?v=oQ5sAfT_3V4)

### Time Complexity

Time complexity is the **amount of time required to execute an algorithm**.  
It is mainly measured in terms of **execution time (run time)**.

---

#### Methods to Compute Time Complexity
1. **Step Count Method**
2. **Tabular Method**

---

**note there are many videos on youtube i just used these to learn them there are websites you can put chatgpt on cold prompts to learn as well**

### [step count method](https://www.youtube.com/watch?v=6cv5Quw3JGE)

### [tabular method](https://www.youtube.com/watch?v=GIv-Uux9xs4&t=1760s)




#### Step Count 

#### 1) Message(n)
```
for i = 1 to n do        -> loop control: n + 1
    write("Hello")       -> n
return                    -> 0  (implicit / ignored)

Total steps = (n + 1) + n = 2n + 1  ⇒  O(n)
```


#### 2) Add(x, n)
```
sum := 0.0               -> 1
for j = 1 to n do        -> loop control: n + 1
    sum := sum + x[j]    -> n
return sum               -> 1
```

Total steps = 1 + (n + 1) + n + 1 = 2n + 3  ⇒  O(n)



#### 3) Nested loops Add(a, b, c, m, n)
```
for i = 1 to m do            -> outer loop control: m + 1
    for j = 1 to n do        -> inner loop control per i: n + 1  ⇒ total: m(n + 1) = mn + m
        // constant work     -> mn

Total steps = (m + 1) + (mn + m) + mn = 2mn + 2m + 1  ⇒  O(mn)
```

#### 4) RSum(a, n)   // Recursive sum
```
if (n == 0)              -> base check: 1
    return 0             -> base return: 1
else
    return RSum(a,n-1) + a[n]  -> per recursive call (n>0): check 1 + add 1 = 2

Recurrence:
T(0) = 2
T(n) = T(n-1) + 2  (for n > 0)

Unroll:
T(n) = 2n + T(0) = 2n + 2  ⇒  O(n)
```

**Rule of thumb used (so you can replicate fast):** loop control = iterations + 1; each simple statement = 1; nested loops multiply bodies; recursion → write the recurrence and unroll.




### Iterative Sum of n numbers

#### Algorithm

```
Sum(a, n) {
  s := 0;
  for i := 1 to n do {
    s := s + a[i];
  }
  return s;
}
```

#### Tabular Method — Step-by-Step

|Statement|s/e|Frequency|Total|Why|
|---|---|---|---|---|
|`Sum(a, n) {` (function start)|0|1|0|Structural only; no runtime work.|
|`s := 0;`|1|1|1|One-time initialization.|
|`for i := 1 to n do {` (loop ctrl)|1|n+1|n+1|Count condition checks: n true + 1 false to exit (init/increment folded into control).|
|`s := s + a[i];`|1|n|n|Executes once per iteration.|
|`}` (loop end)|0|n|0|Block delimiter; no work.|
|`return s;`|1|1|1|Single return.|
|`}` (function end)|0|1|0|Structural only.|
|**Total**|||**2n + 3**|Matches standard step-count convention.|

> Notes: We treat the **loop control** as the single place where check/init/increment costs are aggregated → `n+1` checks; this keeps totals consistent with the classic `2n+3`.
> **DONT RIGHT WHY PART ITS JUST FOR YOU**

---

### Recursive Sum of n numbers

#### Algorithm

```
RSum(a, n) {
  if (n == 0) {
    return 0;
  } else {
    return RSum(a, n-1) + a[n];
  }
}
```

#### Tabular Method — Step-by-Step

|Statement|s/e|Frequency|Total|Why|
|---|---|---|---|---|
|`RSum(a, n) {` (function start)|0|n+1|0|Structural for each call; no work.|
|`if (n == 0)` (condition check)|1|n+1|n+1|Every call checks the base case (for n…1 and for 0).|
|`return 0;` (base case)|1|1|1|Executes once when `n == 0`.|
|`return RSum(a, n-1) + a[n];` (recursive)|1|n|n|**Counts only the addition** per non-base call; the recursive work is in the next call.|
|`}` (function end)|0|n+1|0|Structural only.|
|**Total**|||**2n + 2**|`n+1` checks + `n` additions + `1` base return.|

> Notes: We **don’t** charge an extra step for the call itself (its cost is the next frame’s work); returns in non-base cases aren’t double-counted (their value is the addition’s result).
> **DONT RIGHT WHY PART ITS JUST FOR YOU**


---

### Master Theorem

Master Theorem is a tool to quickly solve recurrence relations that appear in **divide-and-conquer algorithms**.  

For recurrences of the form:
$$
T(n) = aT\!\left(\frac{n}{b}\right) + f(n)
$$

**Definitions:**  
- **a ≥ 1** → number of subproblems  
- **b > 1** → factor by which problem size shrinks  
- **f(n)** → cost of dividing/combining  
- **p = $(\log_b a)$** → critical exponent (baseline for comparison)  

---

#### Cases

1. **Case 1 (Recursion dominates):**  
   If  
   $$
   f(n) = O(n^{p - \epsilon}), \quad \epsilon > 0
   $$  
   then  
   $$
   T(n) = \Theta(n^p)
   $$

2. **Case 2 (Balanced):**  
   If  
   $$
   f(n) = \Theta(n^p \cdot \log^k n), \quad k \geq 0
   $$  
   then  
   $$
   T(n) = \Theta(n^p \cdot \log^{k+1} n)
   $$

3. **Case 3 (Combine dominates):**  
   If  
   $$
   f(n) = \Omega(n^{p + \epsilon}), \quad \epsilon > 0
   $$  
   and **regularity condition** holds:  
   $$
   a f(n/b) \leq c f(n), \quad \text{for some } c < 1
   $$  
   then  
   $$
   T(n) = \Theta(f(n))
   $$

---

#### Quick Examples

- $$T(n) = 2T(n/2) + O(n) \quad \Rightarrow \quad \Theta(n \log n) \quad (\text{Case 2})$$  
- $$T(n) = 4T(n/2) + O(n) \quad \Rightarrow \quad \Theta(n^2) \quad (\text{Case 1})$$  
- $$T(n) = T(n/2) + O(n) \quad \Rightarrow \quad \Theta(n) \quad (\text{Case 3})$$


## Parallel vs Sequential Computers

| Type                | Algorithm Used   | Processor Used | Parallelism |
|---------------------|------------------|----------------|-------------|
| **Parallel Computer**   | Multiple algorithms | Multiple processors | Yes (0 → simultaneous execution) |
| **Sequential Computer** | Single algorithm    | Single processor    | No (0 → one step at a time)     |

---

#### What is a Parallel Algorithm?

A **parallel algorithm** executes **instructions simultaneously** on different processors (e.g., multiple CPUs).  
After processing, their outputs are combined to produce the **final result**.

- **Goal**: Improve computation speed.  
- **Key parameters** when analyzing:
  1. **Time Complexity (Execution Time)** → how long it takes to finish.  
  2. **Number of Processors Used** → more processors = faster but more costly.  
  3. **Total Cost** = (Time Complexity) × (Number of Processors).  
  4. **Efficiency** = (Sequential Execution Time) ÷ (Parallel Execution Time).

---

#### Time Complexity in Parallel Computing

- In sequential: execution time = time from start to finish of the single processor.  
- In parallel: if processors **start/stop at different times**, execution time =  
  **first processor start → last processor stop**.

---

### Speedup

$$
\text{Speedup (S)} = \frac{T_{seq}}{T_{par}}
$$

- $T_{seq}$ Time taken by the **fastest sequential algorithm**.  
- $T_{par}$ Time taken by the **parallel algorithm**.  
- A speedup of **2×** means parallel is **twice as fast** as sequential.  

---

### Total Cost

$$
\text{Cost} = T_{par} \times P
$$

- $T_{par}$ Execution time in parallel.  
- $P$: Number of processors used.  
- More processors = more expensive solution.

---

### Efficiency

$$
\text{Efficiency (E)} = \frac{T_{seq}}{P \times T_{par}}
$$

- If $E = 1$ → perfect efficiency (rare in practice).  
- If $E < 1$ → some processor power is **wasted**.  

---

### Example: Matrix Addition

Suppose we want to add two $N \times N$ matrices.

1. **Sequential Execution (Single Processor):**  
   - Each of the $N^2$ elements must be added one after another.  
   - Time Complexity = $O(N^2)$.

2. **Parallel Execution (P Processors):**  
   - Each processor handles a chunk of additions.  
   - Time Complexity = $O(N^2 / P)$.

3. **Speedup:**  

$$
S = \frac{T_{seq}}{T_{par}} = \frac{N^2}{N^2 / P} = P
$$

   → Speedup is equal to the number of processors.

4. **Total Cost:**  

$$
\text{Cost} = T_{par} \times P = \frac{N^2}{P} \times P = N^2
$$

   → Cost same as sequential, but faster execution.

5. **Efficiency:**  

$$
E = \frac{S}{P} = \frac{P}{P} = 1
$$

   → Perfect efficiency if processors are fully utilized.
---
### Flynn's Classification in Parallel Algorithms

Proposed by **Michael J. Flynn (1966)**.  
It classifies computer systems based on the multiplicity of **instruction streams** and **data streams**.

- **Instruction stream** → sequence of instructions executed by a computer.
    
- **Data stream** → sequence of data (input or intermediate results).
    

#### Four categories:

- **SISD (Single Instruction, Single Data)** → Single CPU (Von Neumann model)
    
- **SIMD (Single Instruction, Multiple Data)** → Vector processors, parallel computers
    
- **MISD (Multiple Instruction, Single Data)** → Pipelined computers
    
- **MIMD (Multiple Instruction, Multiple Data)** → Multiprocessors, multicomputers
    

#### Matrix View

||**One Data Stream**|**Many Data Streams**|
|---|---|---|
|**One Instruction Stream**|SISD|SIMD|
|**Many Instruction Streams**|MISD|MIMD|

---


## Odd-Even Merge Sort

#### [YOUTUBE](https://youtu.be/oIXKITGGk84?si=aIKjvS0QZIbIu1Ih)
#### Steps
1. Divide
   - Split the input array into two sub-arrays: one containing elements at odd indices and the other containing elements at even indices.
2. Recursively Sort
   - Recursively apply Odd-Even Merge Sort to both sub-arrays until the base case is reached (usually when the sub-array has one element).
3. Merge
   - Merge the two sorted sub-arrays back together in a sorted manner.

#### Merge Process
1. Initial Merge  
   - Compare and swap elements from the two sorted sub-arrays that have the same relative positions in their respective sub-arrays.
2. Odd-Even Comparisons  
   - Perform a series of comparisons and swaps on odd and even indexed pairs of elements in the combined array until the entire array is sorted.

#### Steps

**Step 0:**  
If `m = 1`, merge the sequence with one comparison.  

**Step 1:**  
Partition `X1` and `X2` into their odd and even parts.  
- `X1(odd) = k1, k3, k5, …, km-1`  
- `X1(even) = k2, k4, k6, …, km`  
- Similarly partition `X2` into `X2(odd)` and `X2(even)`.  

**Step 2:**  
Recursively merge:  
- Merge `X1(odd)` with `X2(odd)` using `m` processors → result = `L1`.  
- Merge `X1(even)` with `X2(even)` using `m` processors → result = `L2 = l(m+1), l(m+2), …, l(2m)`  

**Step 3:**  
Shuffle `L1` and `L2` as follows:  
`L = l1, l(m+1), l2, l(m+2), …, lm, l(2m)`  

Then perform pairwise comparisons:  
- Compare `(l(m+1), l2)` and swap if out of order.  
- Compare `(l(m+2), l3)` and swap if out of order.  
- Continue until the end.  

**Output:**  
The resulting sequence after all swaps.  

#### Complexity
- **Space Complexity:** `O(n)`

---

#### Example Walkthrough

![[Pasted image 20250818194113.png]]
---

## Applications

Odd-Even Merge Sort is particularly useful in scenarios where parallel processing can be leveraged to sort large datasets efficiently, such as:

- Sorting in database management systems  
- Real-time data processing  
- Parallel computing environments  

## Advantages
- Well-suited for parallel processing.  
- Deterministic structure (fixed sequence of comparisons).  
- Good for hardware implementation in sorting networks.  

## Disadvantages
- Higher constant factors compared to simpler algorithms.  
- Not practical for sequential execution (slower than quicksort/mergesort).  
- Complexity of implementation is higher than basic sorting algorithms.  

---

## Tower of Hanoi
[YOUTUBE](https://youtu.be/R6fQRMy2-BY?si=Xy3K4CBUbxOGuti4)
#### Rules
1. Only one disk can be moved at a time.  
2. A disk can only be placed on top of a larger disk or an empty rod.  
3. The objective is to move all disks from the source rod to the destination rod with the minimum number of moves.  

#### Recursive Solution
1. Move the top \(n-1\) disks from the source rod to the auxiliary rod.  
2. Move the \(n\)-th (largest) disk from the source rod to the destination rod.  
3. Move the \(n-1\) disks from the auxiliary rod to the destination rod.  

#### Recurrence Relation
$$
T(n) = 2T(n-1) + 1, \quad T(0) = 0
$$  

##### Base Case
$$
T(1) = 1
$$  
(one disk → one move).  

---

#### Substitution Method (Derivation)

Start with the recurrence:  
$$
T(n) = 2T(n-1) + 1
$$  

Expand step by step:  
$$
T(n) = 2[2T(n-2) + 1] + 1 = 2^2 T(n-2) + 2 + 1
$$  

$$
T(n) = 2^3 T(n-3) + 2^2 + 2 + 1
$$  

After \(k\) steps:  
$$
T(n) = 2^k T(n-k) + (2^{k-1} + 2^{k-2} + \dots + 2 + 1)
$$  
#### Summation of Geometric Series

In the substitution step we got:  
$$
S = 2^{k-1} + 2^{k-2} + \dots + 2^1 + 2^0
$$  

This is a finite geometric series with:  
- First term \(a = 1\)  
- Common ratio \(r = 2\)  
- Number of terms \(k\)  

The sum of a finite geometric series is:  
$$
S = a \frac{r^k - 1}{r - 1}
$$  

Substitute \(a = 1, r = 2\):  
$$
S = \frac{2^k - 1}{2 - 1} = 2^k - 1
$$  

So the series simplifies to:  
$$
2^{k-1} + 2^{k-2} + \dots + 2 + 1 = 2^k - 1
$$

The summation is a geometric series:  
$$
2^k - 1
$$  



So:  
$$
T(n) = 2^k T(n-k) + (2^k - 1)
$$  

Now, set \(k = n\):  
$$
T(n) = 2^n T(0) + (2^n - 1)
$$  

Since \(T(0) = 0\):  
$$
T(n) = 2^n - 1
$$  

---

#### Time Complexity
- Number of moves =  
$$
2^n - 1
$$  
- Hence, time complexity is:  
$$
T(n) \in O(2^n)
$$  

![[Pasted image 20250818200340.png]]

---

# String Matching Algorithms

## Overview
- **Purpose**: Text-editing programs often need to locate all instances of a pattern within a text.
- **Problem Definition**:
  - Given a text array \( T[1..n] \) of length \( n \) and a pattern array \( P[1..m] \) of length \( m \).
  - A pattern \( P \) occurs with a shift \( s \) in text \( T \) if  

    $$
    0 \leq s \leq n - m \quad \text{and} \quad P[1..m] = T[s+1..s+m]
    $$
  - If \( P \) occurs at shift \( s \), \( s \) is a valid shift; otherwise, it’s an invalid shift.
  - The string-matching problem involves identifying all valid shifts where \( P \) appears in \( T \).
- **Example**:  
  $$
  T = \text{ababcabdabcaabc}, \quad P = \text{abc}
  $$
  - Occurrences:  
    - First at \( T[3] \) (shift 2)  
    - Second at \( T[9] \) (shift 8)  
    - Third at \( T[13] \) (shift 12)  

### Applications
- Searching keywords in a file
- Search engines (e.g., Google, Openfind)
- Database searching (e.g., GenBank)

---

## Techniques for String Matching

### 1. Naive String-Matching Algorithm
- **Concept**: A straightforward approach that checks the pattern at every possible position in the text by comparing characters.
- **Algorithm Design**:
  
 
 ```
  Algorithm: Naive_String_Match(T, P)
      n = length of T
      m = length of P
      for s = 0 to n - m do
          match = true
          for j = 1 to m do
              if P[j] ≠ T[s + j] then
                  match = false
                  break
          if match then
              record s as a valid shift
 ```
 
![[Pasted image 20250820223203.png]]

- **Example Walkthrough**:
$$
T = \text{ababcabdabcaabc}, \quad P = \text{abc}, \quad m = 3, \quad n = 14
$$

- **Step 1**:  
  $$
  s = 0, \quad T[1..3] = \text{aba} \quad \text{(no match)}
  $$

- **Step 2**:  
  $$
  s = 1, \quad T[2..4] = \text{bab} \quad \text{(no match)}
  $$

- **Step 3**:  
  $$
  s = 2, \quad T[3..5] = \text{abc} \quad \text{(match, shift 2)}
  $$

- **Step 4**:  
  $$
  s = 3, \quad T[4..6] = \text{bca} \quad \text{(no match)}
  $$

- **Step 5**:  
  $$
  s = 4, \quad T[5..7] = \text{cab} \quad \text{(no match)}
  $$

- **Step 6**:  
  $$
  s = 5, \quad T[6..8] = \text{abd} \quad \text{(no match)}
  $$

- **Step 7**:  
  $$
  s = 6, \quad T[7..9] = \text{bda} \quad \text{(no match)}
  $$

- **Step 8**:  
  $$
  s = 7, \quad T[8..10] = \text{dab} \quad \text{(no match)}
  $$

- **Step 9**:  
  $$
  s = 8, \quad T[9..11] = \text{abc} \quad \text{(match, shift 8)}
  $$

- **Step 10**:  
  $$
  s = 9, \quad T[10..12] = \text{bca} \quad \text{(no match)}
  $$

- **Step 11**:  
  $$
  s = 10, \quad T[11..13] = \text{caa} \quad \text{(no match)}
  $$

- **Step 12**:  
  $$
  s = 11, \quad T[12..14] = \text{aab} \quad \text{(no match)}
  $$

- **Step 13**:  
  $$
  s = 12, \quad T[13..15] = \text{abc} \quad \text{(match, shift 12)}
  $$

- **Result**:  
  $$
  \text{Valid shifts are } 2, 8, \text{ and } 12
  $$

---

- **Time Complexity**:  
  $$
  O((n - m + 1) \cdot m)
  $$

  - Best Case:  
    $$
    O(m) \quad \text{(e.g., pattern found at start, } T = \text{abcdabdef}, P = \text{ab})
    $$

  - Worst Case:  
    $$
    O(nm) \quad \text{(e.g., } T = \text{aaaaaaab}, P = \text{aab})
    $$

- **Advantages**:
    
    - No preprocessing required.
        
    - No extra space needed.
        
    - Comparisons can be done in any order.
        
- **Disadvantage**: Inefficient as it doesn’t reuse information from previous shifts.
    

### 2. Rabin-Karp Algorithm

- **Concept**: Matches the hash value of the pattern with the hash value of the current text substring. If hashes match, it verifies with character-by-character comparison.
    
- **Algorithm Design**:
    
    ```plaintext
    Algorithm: Rabin_Karp_Match(T, P, d, q)
        n = length of T
        m = length of P
        h_P = hash(P[1..m]) mod q
        h_T = hash(T[1..m]) mod q
        for s = 0 to n - m do
            if h_P = h_T then
                if P[1..m] = T[s+1..s+m] then
                    record s as a valid shift
            if s < n - m then
                h_T = (d * (h_T - T[s+1] * d^(m-1)) + T[s+m+1]) mod q
    ```
    
- **Hash Function Types**:  

1. **Simple Sum Hash**  
   $$
   h(f) = \sum_{i=1}^{m} a_i
   $$
   Example:  
   $$
   h(\text{ababc}) = 1 + 2 + 1 + 2 + 3 = 9
   $$

2. **Polynomial Hash**  
   $$
   h(f) = \sum_{i=1}^{m} a_i \cdot d^{m-i}
   $$
   Example:  
   $$
   h(\text{ababc}) = 1 \cdot 10^4 + 2 \cdot 10^3 + 1 \cdot 10^2 + 2 \cdot 10 + 3 = 12123
   $$

3. **Modulo Hash**  
   $$
   h(f) = (\text{value}) \bmod q
   $$
   Example:  
   $$
   12345 \bmod 11 = 2
   $$

---

**Example (Rabin-Karp)**:  

Given:  
$$
T = 31415926535, \quad P = 26, \quad q = 11
$$  

- Pattern hash:  
  $$
  h_P = 26 \bmod 11 = 4
  $$  

- Text substring hashes:  

  $$
  314 \bmod 11 = 9 \quad \text{(no match)}
  $$
  $$
  141 \bmod 11 = 3 \quad \text{(no match)}
  $$
  $$
  415 \bmod 11 = 8 \quad \text{(no match)}
  $$
  $$
  159 \bmod 11 = 4 \quad \text{(spurious hit, verify: no match)}
  $$
  $$
  592 \bmod 11 = 4 \quad \text{(spurious hit, verify: no match)}
  $$
  $$
  926 \bmod 11 = 4 \quad \text{(spurious hit, verify: match at shift 2)}
  $$
  $$
  265 \bmod 11 = 4 \quad \text{(spurious hit, verify: no match)}
  $$
  $$
  653 \bmod 11 = 9 \quad \text{(no match)}
  $$
  $$
  535 \bmod 11 = 2 \quad \text{(no match)}
  $$


![[Pasted image 20250820223242.png]]

![[Pasted image 20250820223252.png]]

![[Pasted image 20250820223302.png]]

  As we can see, when a match is found, further testing is done to ensure that a game has indeed been found.
---

**Time Complexity**:  

- Best/Average Case:  
  $$
  O(n + m)
  $$  

- Worst Case:  
  $$
  O(nm)
  $$

- **Applications**:
    
    - Substring search in large texts
        
    - Plagiarism detection
        
    - Bioinformatics (DNA sequences)
        
    - Database string querying
        


---

## Notes

- The Naive algorithm is simple but inefficient for large texts due to redundant comparisons.
    
- Rabin-Karp is efficient with good hash functions but suffers from spurious hits.
    
