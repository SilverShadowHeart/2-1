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


# Job Sequencing with Deadlines

You are given a set of jobs.  
Each job has a defined **deadline** and some **profit** associated with it.  
The profit of a job is given only when that job is completed within its deadline.  

**Constraints:**  
- Only one processor is available.  
- Processor takes **1 unit of time** to complete a job.  
- Only one job can be completed at a time.  

**Problem Statement:**  
*"How can the total profit be maximized if only one job can be completed at a time?"*  

---

## Greedy Algorithm
We adopt a greedy algorithm to determine how the next job is selected for an optimal solution.  
This greedy algorithm always gives the optimal solution.  

**Steps:**  
1. Sort all the given jobs in decreasing order of their profit.  
2. Check the maximum deadline.  
   - Draw a Gantt chart with time slots equal to the maximum deadline.  
3. Pick jobs one by one.  
   - Place each job as far as possible from $0$ ensuring that it finishes before its deadline.  

---

## Example

### Step 1: Jobs (sorted by profit)

| Job | Deadline | Profit |
|-----|----------|--------|
| J4  | 2        | 300    |
| J1  | 5        | 200    |
| J3  | 3        | 190    |
| J2  | 3        | 180    |
| J5  | 4        | 120    |
| J6  | 2        | 100    |

---

### Step 2: Maximum Deadline
Maximum deadline = 5  

So, Gantt chart has slots $1,2,3,4,5$.  

---

### Step 3: Job Placement


### Step 1: Schedule J4 (Deadline = 2)

|Time Slot|Job|
|---|---|
|1||
|2|J4|
|3||
|4||
|5||

---

### Step 2: Schedule J1 (Deadline = 5)

|Time Slot|Job|
|---|---|
|1||
|2|J4|
|3||
|4||
|5|J1|

---

### Step 3: Schedule J3 (Deadline = 3)

|Time Slot|Job|
|---|---|
|1||
|2|J4|
|3|J3|
|4||
|5|J1|

---

### Step 4: Schedule J2 (Deadline = 3 → slots 3,2 occupied → place in slot 1)

|Time Slot|Job|
|---|---|
|1|J2|
|2|J4|
|3|J3|
|4||
|5|J1|

---

### Step 5: Schedule J5 (Deadline = 4)

|Time Slot|Job|
|---|---|
|1|J2|
|2|J4|
|3|J3|
|4|J5|
|5|J1|

---

### Step 6: Try J6 (Deadline = 2 → slots 2,1 full → cannot schedule)

|Time Slot|Job|
|---|---|
|1|J2|
|2|J4|
|3|J3|
|4|J5|
|5|J1|

---

 **Final Scheduled Jobs:** J2, J4, J3, J5, J1  
 **Total Profit = 60 + 100 + 70 + 25 + 80 = 335**


---

### Step 4: Final Gantt Chart

| Time Slot | 1  | 2  | 3  | 4  | 5  |
|-----------|----|----|----|----|----|
| Job       | J2 | J4 | J3 | J5 | J1 |

---

## Optimal Schedule
$$ [J2, J4, J3, J5, J1] $$  

---

## Maximum Profit
$$
Profit = P(J_2) + P(J_4) + P(J_3) + P(J_5) + P(J_1)
$$

$$
= 180 + 300 + 190 + 120 + 200
$$

$$
= 990 \;\text{ units}
$$



A **feasible solution** is a subset of jobs such that each can be completed by its deadline.  
The **value** of a feasible solution \(J\) is:

$$
V(J) = \sum_{j \in J} p_j
$$

The **optimal solution** is the feasible solution \(J^*\) such that:

$$
V(J^*) = \max_{J} \sum_{j \in J} p_j
$$

---

## Algorithm (Greedy Job Sequencing)

**High-level description:**

1. Sort jobs in **descending order of profit**.  
2. For each job, place it in the latest available slot \(\leq\) its deadline.  
3. If no slot is available, discard the job.  

**Formal algorithm:**

### **Algorithm 1: GreedyJob**

```text
GreedyJob(d, j, n)
// J is a set of jobs that their deadlines can complete
{
    j := {1};
    for i := 2 to n do
    {
        if (all jobs in J ∪ {i} can be completed by their deadlines) then
            j := j ∪ {i};
    }
}
```

---

### **Algorithm 2: JS**

```text
JS(d, j, n)
// d[i] ≥ 1, 1 ≤ i ≤ n are the deadlines, n ≥ 1.
// The jobs are ordered such that p[1] ≥ p[2] ≥ … ≥ p[n]
// j[i] is the ith job in the optimal solution.
// At termination: d[j[i]] ≤ d[j[i+1]], 1 ≤ i ≤ k
{
    d[0] := j[0] := 0;      // Initialize
    j[1] := 1;              // Include job 1
    k := 1;

    for i := 2 to n do
    {
        // Consider jobs in descending order of p[i].
        // Find position for i and check feasibility of insertion.
        r := k;
        while (d[j[r]] > d[i] and d[j[r]] ≠ r) do
            r := r - 1;

        if (d[i] > r) then
        {
            // Insert i into j[]
            for q := k downto r+1 do
                j[q+1] := j[q];

            j[r+1] := i;
            k := k + 1;
        }
    }
    return k;
}
```

---

### **Time Complexity**

The time taken by this algorithm is:  
 $O(n^2)$

---


# MERGE SORT

[MERGE SORT YOUTUBE](https://youtu.be/mB5HXBb_HY8?si=03tZ28qv5eXDY0XZ)


Merge Sort is a Divide and Conquer algorithm.  
It divides input array in two halves, calls itself for the two halves and then merges the two sorted halves.  
The `merge()` function is used for merging two halves.  
The `merge(arr, l, m, r)` is key process that assumes that `arr[l..m]` and `arr[m+1..r]` are sorted and merges the two sorted sub-arrays into one.  

---

### Complexity

| Case        | Time Complexity |
|-------------|-----------------|
| Best Case   | O(n log n)      |
| Average Case| O(n log n)      |
| Worst Case  | O(n log n)      |

| Memory | Stable | In-place |
|--------|--------|----------|
| n      | YES    | NO       |

---

### Algorithm (Divide and Conquer)
```
 Algorithm D and C(P)  
{  
if small(P)  
then return S(P)  
else  
      {  
  divide P into smaller instances P1 ,P2 .....Pk  
  apply D and C to each sub problem  
  return combine (D and C(P1)+ D and C(P2)+.......+D and C(Pk))  
      }  
}
```

![[Pasted image 20250820200903.png]]

![[Pasted image 20250820200915.png]]

![[Pasted image 20250820200926.png]]

![[Pasted image 20250820200941.png]]

![[Pasted image 20250820200954.png]]

![[Pasted image 20250820201004.png]]

![[Pasted image 20250820201013.png]]

![[Pasted image 20250820201031.png]]

![[Pasted image 20250820201043.png]]


### ALGORITHM

```
Algorithm MergeSort(low, high)
// a[low:high] is the array segment to sort
// Base condition: only one element ⇒ already sorted
{
    if (low < high) then
    {
        // Divide step
        mid := (low + high) / 2

        // Conquer step
        MergeSort(low, mid)
        MergeSort(mid+1, high)

        // Combine step
        Merge(low, mid, high)
    }
}
```

---

# QUICK SORT

## [Watch Here](https://youtu.be/7h1s2SojIRw?si=TakMBG20jI4VzHfU)

**Concept:**  
Divide and Conquer algorithm. Pick a pivot, partition the array around it, then recursively sort the subarrays.

**Pivot selection strategies:**

- First element
    
- Last element
    
- Random element
    
- Median element
    

---

### Algorithm (pivot = highest index element)

1. Choose the last element as pivot.
    
2. Initialize two pointers:
    
    - `left` = low - 1
        
    - `right` = high
        
3. Move `left` rightwards while `arr[left] < pivot`.
    
4. Move `right` leftwards while `arr[right] > pivot`.
    
5. If `left < right`, swap `arr[left]` and `arr[right]`.
    
6. When `left ≥ right`, swap pivot with `arr[left]`.
    
7. Pivot is now at correct position; recursively apply to subarrays.
    

---

### Time Complexity

- **Best Case:** Pivot divides array into two equal halves → **O(n log n)**
    
- **Average Case:** Pivot divides array reasonably balanced → **O(n log n)**
    
- **Worst Case:** Pivot is smallest/largest (highly unbalanced) → **O(n²)**
    

**Reasoning:**

- Recursion depth:
    
    - Best/Average: `log n`
        
    - Worst: `n`
        
- Work per level: `O(n)`
    

---

### Space & Properties

- Memory:
    
    - Best/Average: `O(log n)` (recursion stack)
        
    - Worst: `O(n)` (skewed recursion tree)
        
- Stable: **No** (equal elements may be swapped)
    
- In-place: **Yes**
    

![[Pasted image 20250820201732.png]]

![[Pasted image 20250820201752.png]]

![[Pasted image 20250820201807.png]]

- **Best Case:** The pivot always divides the array into two equal halves.  
   - ![[Pasted image 20250820201925.png]]
- **Average Case:** The pivot divides the array into two subarrays that are not necessarily equal but reasonably balanced.  
	- ![[Pasted image 20250820201941.png]] 
- **Worst Case:** The pivot is always the smallest or largest element, leading to highly unbalanced partitions.  
	 - ![[Pasted image 20250820201956.png]]




# Shortest Path Problem

The **Shortest Path Problem** is the problem of finding the shortest path(s) between vertices of a given graph.  

- The shortest path between two vertices is the path that has the least cost compared to all other existing paths.  

## Applications
- Google Maps  
- Road Networks  
- Logistics Research  

---

## Types
- **Single Source Shortest Path Problem:** Find the shortest path from a given source vertex to all other remaining vertices.  
- Famous algorithms: **Dijkstra's Algorithm** and **Bellman-Ford Algorithm**.  

---

## Dijkstra's Algorithm
- A greedy algorithm for solving the single-source shortest path problem.  
- Computes the shortest path from one source node to all other nodes in the graph.  
- Works only for **connected graphs** with **non-negative edge weights**.  
- Supports **directed and undirected graphs**.  
- Provides the **cost of shortest paths**, not the actual path (predecessors can be tracked for paths).  

---

## Pseudocode

**Step 01:** Define two sets:  
- **Visited set (S):** Vertices included in the shortest path tree. Initially empty.  
- **Unvisited set (Q):** All vertices of the graph. Initially contains all vertices.  

---

**Step 02:** For each vertex `v`:  
- `n[v]` → predecessor of vertex `v`.  
- `d[v]` → shortest path estimate from source.  

Initialization:  
- `n[v] = NIL` for all `v`.  
- `d[source] = 0`.  
- `d[v] = ∞` for all other vertices.  

---

**Step 03:** Repeat until all vertices are processed:  
1. Choose `u ∈ Q` with minimum `d[u]`.  
2. Relax all outgoing edges `(u, v)`:  

   $$
   \text{if } d[u] + w(u,v) < d[v] \quad \Rightarrow \quad d[v] = d[u] + w(u,v), \; n[v] = u
   $$

3. Move `u` from `Q` to `S`.  

---

## Example (Edge Relaxation)

For edge `(a, b)`:

- $d[a]$ = shortest path estimate of `a` from source `s`.  
- $d[b]$ = shortest path estimate of `b` from source `s`.  

Relaxation rule:  

$$
\text{if } d[a] + w(a,b) < d[b] \quad \Rightarrow \quad d[b] = d[a] + w(a,b), \; n[b] = a
$$  

---

## Complexity
- Graph $G$ represented as an **adjacency matrix**.  
- Priority queue `Q` as an unordered list.  
- Selecting vertex with smallest distance = $O(V)$.  
- For each neighbor of `u`, updating distance = $O(1)$ (at most $V$ neighbors).  
- Each iteration = $O(V)$, repeated $V$ times.  

**Total complexity:**

$$
O(V^2)
$$

---

## Example Run (Initialization)

- **Unvisited set:** {S, a, b, c, d, e}  
- **Visited set:** { }  

Initialize:  
- $d[S] = 0$  
- $d[a] = d[b] = d[c] = d[d] = d[e] = ∞$  

---

After relaxing edges from `S`:  
- **Unvisited set:** {a, b, c, d, e}  
- **Visited set:** {S}  

