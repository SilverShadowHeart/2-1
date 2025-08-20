## Convex Hull Problem

#### Definition
- A polygon \(P\) is **convex** if, for every pair of points \(x\) and \(y\) in \(P\), the line segment \(xy\) also lies inside \(P\).  
- Otherwise, the polygon is called **concave**.  

![[Pasted image 20250818204452.png]]

#### Problem Statement
- The **Convex Hull problem** is about finding the smallest convex polygon that can enclose a given set of points in a 2D plane.  
- One efficient approach is **Divide and Conquer**, which splits the problem into smaller subproblems, solves them independently, and merges the results.  

![[Pasted image 20250818204530.png]]

---

### Steps

#### 1. Sort the Points
- Sort the given points based on their **x-coordinates**.  
- If two points have the same \(x\), use their **y-coordinates**.  
- Sorting takes:  
$$
O(n \log n)
$$  

#### 2. Divide the Points
- Split the sorted points into two halves: **left** and **right**.  

#### 3. Recursive Hull Computation
- Recursively compute the convex hull for each half.  

#### 4. Merge the Hulls
- Find the **upper** and **lower** tangents that connect the two hulls.  
- Merge them into one convex hull.  
- Remove any points that are inside and not part of the final hull.  

#### example:

#### Step 1
![[Pasted image 20250818205006.png]]

#### Step 2
![[Pasted image 20250818205056.png]]

#### Step 3
![[Pasted image 20250818205114.png]]

#### Step 4
![[Pasted image 20250818210508.png]]

#### Step 5
![[Pasted image 20250818210542.png]]

#### Step 6
![[Pasted image 20250818210557.png]]

#### Step 7
![[Pasted image 20250818210615.png]]

#### Final
![[Pasted image 20250818210700.png]]

#### Time Complexity of Divide & Conquer Convex Hull

- **Best Case:** O(n log n)  
- **Worst Case:** O(n log n)  
- **Average Case:** O(n log n)  

**Reasoning:**  
- **Divide step:** Splits into left and right halves → O(log n) levels.  
- **Merge step:** Merging two convex hulls per level → O(n).  
- **Total:** O(n log n). 

#### Advantages
- Efficient (O(n log n)) compared to naive O(n²) approaches.  
- Well-suited for large point sets.  
- The recursive structure is elegant and parallelizable.  

#### Disadvantages
- More complex to implement than Graham’s scan or Jarvis march.  
- Overhead in recursion and merging.  
- Not always faster in practice for small datasets.  

#### Why We Use It
- Balances theoretical efficiency with manageable implementation.  
- Useful when datasets are huge, and divide & conquer can be parallelized.  

#### Applications
- **Computer Graphics:** Object boundary detection.  
- **Robotics:** Path planning and collision avoidance.  
- **Geographical Information Systems (GIS):** Mapping boundaries.  
- **Pattern Recognition:** Shape analysis.  
- **Computational Geometry:** Base for higher-level geometric algorithms.  




## Flattening Nested Loops into a Single Loop

### Original 2D Loops
```c
int A = 3; 
int B = 2;  

for (int i = 0; i < A; i++) {     
    for (int j = 0; j < B; j++) {         
        printf("%d %d\n", i, j);     
    } 
}
````

### Flattened into 1 Loop

```c
int A = 3; 
int B = 2;  

for (int n = 0; n < A * B; n++) {     
    int i = n / B; // row (outer loop index)     
    int j = n % B; // col (inner loop index)     
    printf("%d %d\n", i, j); 
}
```

### Output (same for both)

```
0 0
0 1
1 0
1 1
2 0
2 1
```

---

### ✅ Advantages

- Simpler indexing: reduces nesting depth.
    
- Easier to parallelize in GPU/array operations.
    
- Can improve cache locality in some cases.
    
- Useful for mathematical mapping between dimensions.
    

### ⚠️ Disadvantages

- Less readable for humans compared to nested loops.
    
- Harder to apply if inner loop depends on outer loop (`j < i`, etc.).
    
- Debugging and logic errors can be harder to spot.
    

### 🎯 Why We Use It

- To simplify nested loops into a single iteration space.
    
- Useful when working with linear memory (e.g., arrays stored as 1D).
    
- Helps when flattening loops for optimization or vectorization.
    

### 📌 Applications

- Matrix operations (flattened indexing).
    
- GPU/parallel programming (mapping threads to indices).
    
- Data serialization (storing multidimensional data in 1D form).
    
- Compilers and code optimizations.
    


<p align="center" style="font-size:24px"><b>GREEDY ALGORITHMS</b></p>


# Greedy Method – Optimization Problems

## Basic Notations
- **Feasible Solution** → Any subset of the original input that satisfies given constraints.  
- **Objective Function** → A function to maximize or minimize over feasible solutions.  
- **Optimal Solution** → A feasible solution that maximizes or minimizes the objective function (unique for a given problem).  

---

## Optimization Problem
Optimization problems aim to **maximize or minimize** some value.  
Examples:  
- Minimum number of colors for graph coloring.  
- Shortest path between two vertices in a graph.  

**Common strategies:**
- Greedy Method  
- Dynamic Programming  
- Branch and Bound  

---

## Greedy Algorithm
The greedy algorithm builds an **optimal solution by making a sequence of local decisions**:  
- Choices are made one by one.  
- Each choice follows a **greedy-choice property** (locally best at the moment).  
- Choices depend on past selections but not future consequences.  
- Global optimal solutions are approximated through local optimal choices.  

### Subset Paradigm
Greedy algorithms work by generating subsets of inputs using a selection rule.  
Examples:  
- Knapsack Problem  
- Job Sequencing with Deadlines  

---

## Greedy Algorithm – Pseudocode
```c
Greedy(a[1..n]) {
    // Initialize solution
    solution = {}
    for (i = 1; i <= n; i++) {
        x = Select(a[i]);  
        if (Feasible(solution, x))  
            solution = Union(solution, x);  
        else  
            reject(x);  
    }
    return solution;
}
````

---

## Three Key Activities

1. **Selection** → Choose the best candidate.
    
2. **Feasibility** → Check if including the candidate keeps the solution valid.
    
3. **Optimality** → From all feasible solutions, select the one that optimizes the objective.
    

---

## Applications

- **Knapsack Problem**
    
- **Job Sequencing with Deadlines**
    
- **Minimum Spanning Tree** (Prim’s, Kruskal’s)
    
- **Huffman Coding**
    
- **Single-source Shortest Path** (Dijkstra’s, without negative weights)
    

---

## Limitations

- Greedy only considers **local information**, not the overall problem → may fail to find the global optimum.
    
- Proving correctness is non-trivial, even when the greedy approach works.
    
- Cannot handle certain problems (e.g., shortest path with **negative edges**).
    

![[Pasted image 20250820191921.png]]

<p align="center" style="font-size:24px"><b>GREEDY ALGORITHMS</b></p>

### [huffmancoding youtube](https://www.youtube.com/watch?v=co4_ahEDCho)

# Encoding and Compression of Data

## Compression
- **Definition**: Data compression reduces the size of data (e.g., a string) so it takes up less space.  
- **Purpose**: Efficient storage and faster transmission.  

## Encoding
- **Definition**: Converting a string into binary codes.  

## Decompression
- **Definition**: Converting binary codes back into the original string.  

---

## Fixed-Length Code
- **Definition**: Every word/code has the same length (block code).  

### Advantages
- Fast access (computer knows where each word starts).  

### Disadvantages
- Records are larger → more storage space.  
- Slower to transfer.  

---

## Variable-Length Code
- **Definition**: More frequent characters get shorter codes; infrequent characters get longer codes.  

### Advantages
- Efficient storage (frequent characters take fewer bits).  

### Disadvantages
- Harder to parse (difficult to identify where one character ends and another begins).  

---

## Prefix Property
- A code has the **prefix property** if the code for one character is *not* the prefix of another.  
- Ensures unique decoding.  

### Example

| Symbol | Code    |
|--------|---------|
| S      | 0100110 |
| •      | 00010   |
| ooo    | 01      |
| P      | 11      |
| Q      | 001     |
| R      | 10      |

- `000` is not a prefix of `11`, `01`, `001`, or `10`.  
- `11` is not a prefix of `000`, `01`, `001`, or `10`.  

---

# Huffman Coding

**Developed by David Huffman (1951)**  
Huffman Coding is a famous **Greedy Algorithm** used for **lossless compression** of data.  
It assigns **variable length codes** to characters depending on their frequency.  

- Most frequent character → smallest code  
- Least frequent character → largest code  
- Also known as **Huffman Encoding**  
- Uses **prefix rule** (no code is a prefix of another)

---

## Steps in Huffman Coding

1. **Build Huffman Tree**
   - Create a leaf node for each character with its frequency.
   - Arrange nodes in increasing frequency order.
   - Take two minimum frequency nodes → create new internal node.  
     - New node’s frequency = sum of the two.  
     - First node → left child, second node → right child.  
   - Repeat until single tree remains (Huffman Tree).

2. **Assign Codes**
   - Traverse tree (Left → `0`, Right → `1`) to assign codes.

---

## Important Formulas

**Formula 1: Average Code Length**

$$
\text{Average code length per character} = 
\frac{\sum (f_i \times L_i)}{\sum f_i}
$$

where  
- $f_i$ = frequency of character \( i \)  
- $L_i$ = code length of character \( i \)  


---

**Formula 2: Encoded Message Size**

$$
\text{Total bits in Huffman encoded message} = N \times \text{Average code length}
$$

or equivalently,

$$
= \sum (f_i \times L_i)
$$

where \( N = \) total number of characters.

---

## Problem

A file contains the following characters with given frequencies. Using Huffman Coding, determine:

1. Huffman Code for each character  
2. Average code length  
3. Encoded message length (in bits)


### Example 

![[Pasted image 20250820193259.png]]

![[Pasted image 20250820193317.png]]

![[Pasted image 20250820193329.png]]

![[Pasted image 20250820193417.png]]

![[Pasted image 20250820193436.png]]

![[Pasted image 20250820193455.png]]

![[Pasted image 20250820193512.png]]

![[Pasted image 20250820193523.png]]

### Assigning Weights in Huffman Tree

- We assign weights to all the edges of the constructed Huffman Tree.  
- Let us assign weight $0$ to the left edges and weight $1$ to the right edges.  

#### Rule:
- If you assign weight $0$ to the left edges, then assign weight $1$ to the right edges.  
- If you assign weight $1$ to the left edges, then assign weight $0$ to the right edges.  
- Either convention may be followed.  
- But the **same convention** must be used during decoding as was used during encoding.  

![[Pasted image 20250820193730.png]]

### Huffman Code for Each Character

To write the Huffman code for any character, traverse the Huffman Tree from the root node to the leaf node of that character.  

#### Codes:
- $$s = 01$$  
- $$a = 111$$  
- $$e = 10$$  
- $$o = 11001$$  
- $$u = 1101$$  
- $$\cdot = 11000$$  

#### Observations:
- Characters with **lower frequency** → assigned **longer codes**.  
- Characters with **higher frequency** → assigned **shorter codes**. 

### Average Code Length  

Using the formula:  

$$
\bar{L} = \frac{\sum_i f_i \cdot L_i}{\sum_i f_i}
$$  

Substituting values:  

$$
\bar{L} = \frac{(10 \times 3) + (15 \times 2) + (12 \times 2) + (3 \times 5) + (4 \times 4) + (13 \times 2) + (1 \times 5)}{10 + 15 + 12 + 3 + 4 + 13 + 1}
$$  

$$
\bar{L} = \frac{120}{48} = 2.52
$$  

### Length of Huffman Encoded Message  

Using formula:  

$$
\text{Total bits} = N \times \bar{L}
$$  

Where:  
- \(N = 58\) (total characters in message)  
- \(\bar{L} = 2.52\) (average code length per character)  

So:  

$$
\text{Total bits} = 58 \times 2.52 = 146.16 \approx 147 \, \text{bits}
$$  


### Applications of Huffman Coding  
- File compression for transmission  
- Statistical coding (shorter codes for frequent symbols)  
- Text and fax transmission  
- Practical use of multiple data structures (trees, heaps, queues) 