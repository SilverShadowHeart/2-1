11
```python
import math

# Distance matrix
dist = [
    [0, 10, 15, 20],
    [10, 0, 35, 25],
    [15, 35, 0, 30],
    [20, 25, 30, 0]
]

n = len(dist)
visited = [False] * n
min_path = math.inf

def tsp(curr_pos, count, cost):
    global min_path
    
    # If all cities visited and back to start
    if count == n and dist[curr_pos][0] > 0:
        min_path = min(min_path, cost + dist[curr_pos][0])
        return

    # Explore next unvisited city
    for i in range(n):
        if not visited[i] and dist[curr_pos][i] > 0:
            visited[i] = True
            new_cost = cost + dist[curr_pos][i]
            
            # Branch and Bound condition (prune large paths)
            if new_cost < min_path:
                tsp(i, count + 1, new_cost)
            
            visited[i] = False


# Start from city A (index 0)
visited[0] = True
tsp(0, 1, 0)

print("Minimum cost:", min_path)

```
```python
import heapq

items = [
    ("A", 2, 10),
    ("B", 4, 25),
    ("C", 6, 15),
    ("D", 3, 20),
    ("E", 5, 30),
]
capacity = 15
# sort by value/weight desc
items = sorted(items, key=lambda x: x[2]/x[1], reverse=True)

def bound(level, curr_w, curr_v):
    # fractional knapsack bound from next item (level)
    bw, bv = curr_w, curr_v
    cap = capacity - bw
    i = level
    while i < len(items) and cap > 0:
        _, w, v = items[i]
        if w <= cap:
            cap -= w
            bv += v
        else:
            bv += v * (cap / w)
            cap = 0
        i += 1
    return bv

# node: (-bound, level, curr_w, curr_v, taken_mask)
start = ( -bound(0,0,0), 0, 0, 0, 0 )
pq = [start]
best_value = 0
best_mask = 0

while pq:
    negb, level, cw, cv, mask = heapq.heappop(pq)
    if -negb <= best_value:
        continue
    if level == len(items):
        if cv > best_value:
            best_value, best_mask = cv, mask
        continue
    # branch: include item[level] if fits
    name, w, v = items[level]
    # include
    if cw + w <= capacity:
        im = mask | (1<<level)
        nv = cv + v
        nb = bound(level+1, cw+w, nv)
        if nv > best_value: best_value, best_mask = nv, im if nv>best_value else best_mask
        if nb > best_value:
            heapq.heappush(pq, (-nb, level+1, cw+w, nv, im))
    # exclude
    nb = bound(level+1, cw, cv)
    if nb > best_value:
        heapq.heappush(pq, (-nb, level+1, cw, cv, mask))

# decode solution
chosen = [items[i][0] for i in range(len(items)) if (best_mask>>i)&1]
total_w = sum(items[i][1] for i in range(len(items)) if (best_mask>>i)&1)
print("Best value:", best_value)
print("Items:", chosen)
print("Total weight:", total_w)

```
```python
import heapq

# ---------------------------------------------------
# 0/1 Knapsack using Least Cost Branch and Bound
# ---------------------------------------------------

class Node:
    def __init__(self, level, value, weight, bound, taken):
        self.level = level
        self.value = value
        self.weight = weight
        self.bound = bound
        self.taken = taken

    def __lt__(self, other):
        return self.bound > other.bound  # Max-heap behavior


def bound(node, n, capacity, weights, values):
    """Calculate upper bound on total value starting from this node."""
    if node.weight >= capacity:
        return 0

    profit_bound = node.value
    j = node.level + 1
    totweight = node.weight

    while j < n and totweight + weights[j] <= capacity:
        totweight += weights[j]
        profit_bound += values[j]
        j += 1

    if j < n:
        profit_bound += (capacity - totweight) * (values[j] / weights[j])

    return profit_bound


def knapsack_branch_and_bound(values, weights, capacity):
    n = len(values)

    # Input validation
    if capacity <= 0 or n == 0:
        raise ValueError("Invalid input: capacity must be > 0 and items must exist.")
    if any(w <= 0 or v < 0 for w, v in zip(weights, values)):
        raise ValueError("Invalid input: weights must be positive and values non-negative.")

    # Sort items by value/weight ratio
    items = sorted(list(zip(values, weights, range(n))), key=lambda x: x[0]/x[1], reverse=True)
    values = [i[0] for i in items]
    weights = [i[1] for i in items]
    indices = [i[2] for i in items]

    Q = []
    root = Node(-1, 0, 0, 0, [])
    root.bound = bound(root, n, capacity, weights, values)
    heapq.heappush(Q, root)

    max_value = 0
    best_taken = []

    while Q:
        node = heapq.heappop(Q)
        if node.bound < max_value or node.level == n - 1:
            continue

        # Next level
        next_level = node.level + 1

        # Include the next item
        include = Node(
            next_level,
            node.value + values[next_level],
            node.weight + weights[next_level],
            0,
            node.taken + [indices[next_level]]
        )

        if include.weight <= capacity and include.value > max_value:
            max_value = include.value
            best_taken = include.taken

        include.bound = bound(include, n, capacity, weights, values)
        if include.bound > max_value:
            heapq.heappush(Q, include)

        # Exclude the next item
        exclude = Node(next_level, node.value, node.weight, 0, node.taken[:])
        exclude.bound = bound(exclude, n, capacity, weights, values)
        if exclude.bound > max_value:
            heapq.heappush(Q, exclude)

    return max_value, sorted(best_taken)


# ---------------------------------------------------
# Example Run
# ---------------------------------------------------
if __name__ == "__main__":
    values = [10, 25, 15, 20, 30]
    weights = [2, 4, 6, 3, 5]
    capacity = 15

    try:
        max_val, items_taken = knapsack_branch_and_bound(values, weights, capacity)
        print("Maximum Total Value:", max_val)
        print("Optimal Selection (item indices):", items_taken)
    except ValueError as e:
        print("Error:", e)

```

```python
from itertools import permutations

# -----------------------------------------------
# Count number of Hamiltonian cycles with total time = K
# -----------------------------------------------

def count_paths_with_time(N, K, T):
    cities = [i for i in range(1, N)]  # cities 2...N
    count = 0

    for perm in permutations(cities):
        time = 0
        curr = 0  # start from city 1 (index 0)

        # travel through permutation
        for nxt in perm:
            time += T[curr][nxt]
            curr = nxt

        # return to city 1
        time += T[curr][0]

        if time == K:
            count += 1

    return count


# -----------------------------------------------
# Example I/O handling
# -----------------------------------------------
if __name__ == "__main__":
    N, K = map(int, input().split())
    T = [list(map(int, input().split())) for _ in range(N)]
    print(count_paths_with_time(N, K, T))

```

```python
# -----------------------------------------------
# Lucky Bags Variance Minimization
# -----------------------------------------------

def minimize_variance(N, D, weights):
    S = sum(weights)
    q = S // D
    r = S % D
    mean = S / D

    # r bags get (q+1), D-r bags get q
    variance = (r * ((q + 1 - mean) ** 2) + (D - r) * ((q - mean) ** 2)) / D
    return variance


# -----------------------------------------------
# Example Run
# -----------------------------------------------
if __name__ == "__main__":
    N, D = map(int, input().split())
    weights = list(map(int, input().split()))

    result = minimize_variance(N, D, weights)
    print(f"{result:.10f}")

```

- Problem definitions:
    
    - **3-SAT**: decide satisfiability of a Boolean formula already in 3-CNF (each clause has ≤3 literals).
        
    - **CNF-SAT**: decide satisfiability of a Boolean formula given in CNF (clauses of arbitrary length).
        
- Reduction (polynomial-time): every instance of **3-SAT** is already an instance of **CNF-SAT** — the identity mapping (take the same formula) is a valid polynomial-time reduction.
    
- Conclusion: since **3-SAT** is NP-hard, and 3-SAT≤PCNF-SAT3\text{-SAT}\le_P\text{CNF-SAT}3-SAT≤P​CNF-SAT, CNF-SAT is NP-hard; because CNF-SAT is also verifiable in polynomial time (guess an assignment and check every clause), CNF-SAT is NP-complete.


```python
#!/usr/bin/env python3
# Minimum Vertex Cover: exact by increasing-combination search (practical for N <= ~25).
# Falls back to a 2-approx (maximal matching) when N is large.

import sys
from itertools import combinations

def read_input():
    data = sys.stdin.read().strip().split()
    if not data:
        return 0,0,[]
    it = iter(data)
    N = int(next(it)); M = int(next(it))
    edges = []
    for _ in range(M):
        u = int(next(it)); v = int(next(it))
        edges.append((u-1, v-1))   # convert to 0-based
    return N, M, edges

def is_vertex_cover(selected_set, edges):
    sel = set(selected_set)
    for u,v in edges:
        if u not in sel and v not in sel:
            return False
    return True

def exact_min_vertex_cover(N, edges, limit=25):
    if N > limit:
        return None  # signal fallback
    nodes = list(range(N))
    for k in range(0, N+1):
        # check all combinations of size k
        for comb in combinations(nodes, k):
            if is_vertex_cover(comb, edges):
                return list(comb)
    return None

def approx_vertex_cover(N, edges):
    # 2-approx via greedy maximal matching
    used = [False]*N
    cover = set()
    for u,v in edges:
        if not used[u] and not used[v]:
            used[u] = used[v] = True
            cover.add(u); cover.add(v)
    return sorted(cover)

def main():
    N, M, edges = read_input()
    if N == 0:
        print("0\n[]")
        return

    exact = exact_min_vertex_cover(N, edges, limit=25)
    if exact is not None:
        cover = sorted(exact)
        method = "exact"
    else:
        cover = approx_vertex_cover(N, edges)
        method = "2-approx"

    # print 1-based indices
    cover_1based = [x+1 for x in cover]
    print(len(cover_1based))
    if cover_1based:
        print(*cover_1based)
    else:
        print()

if __name__ == "__main__":
    main()

```

Here’s the clean, exam-ready proof procedure — no fluff:

---

### **1. Vertex Cover Decision Problem (VCDP)**

**Statement:**  
Given a graph ( G(V,E) ) and integer ( k ), does there exist a subset ( V' \subseteq V ) with (|V'| \le k) such that every edge in ( E ) is incident to at least one vertex in ( V' )?

**To Prove:** VCDP is **NP-Hard**.

**Procedure:**

1. **Show VCDP ∈ NP:**
    
    - Given a subset ( V' ), we can verify in polynomial time that every edge is covered by checking all edges once.
        
    - Hence, VCDP ∈ NP.
        
2. **Reduction from an NP-Complete Problem (3-SAT or Clique):**
    
    - Use **reduction from Clique Decision Problem (CDP)** which is NP-Complete.
        
3. **Construct Complement Graph:**
    
    - For a given graph ( G = (V, E) ) and integer ( k ) in CDP, create a complement graph ( G' = (V, E') ), where ( E' ) contains all edges **not in E**.
        
4. **Transformation Relation:**
    
    - ( G ) has a clique of size ( k ) **iff** ( G' ) has a vertex cover of size ( |V| - k ).
        
5. **Conclusion:**
    
    - Since CDP ≤p VCDP and CDP is NP-Complete, VCDP is **NP-Hard**.
        

---

### **2. Clique Decision Problem (CDP)**

**Statement:**  
Given a graph ( G(V,E) ) and integer ( k ), does there exist a subset ( V' \subseteq V ) with (|V'| = k) such that every pair of vertices in ( V' ) is connected by an edge?

**To Prove:** CDP is **NP-Hard**.

**Procedure:**

1. **Show CDP ∈ NP:**
    
    - Given a subset of vertices ( V' ), we can verify all pairs are adjacent in polynomial time.
        
2. **Reduction from 3-SAT (known NP-Complete):**
    
    - For each clause in a 3-SAT formula, create a node for each literal.
        
    - Connect two nodes if they come from different clauses and are not negations of each other.
        
    - The formula is satisfiable **iff** the graph has a clique of size equal to the number of clauses.
        
3. **Conclusion:**
    
    - Since 3-SAT ≤p CDP, CDP is NP-Hard.
        

---

### **3. Combined Insight**

- **Clique ↔ Vertex Cover:** They are **complementary** problems.  
    ( G ) has a clique of size ( k ) ⇔ ( \overline{G} ) has a vertex cover of size ( |V| - k ).
    
- Hence, proving one NP-Hard automatically implies the other is NP-Hard.
    

---

**Final Summary:**

- **3-SAT ≤p Clique** ⇒ Clique is NP-Hard.
    
- **Clique ≤p Vertex Cover** ⇒ Vertex Cover is NP-Hard.

```python
from collections import Counter

def min_operations_to_equal(arr):
    freq = Counter(arr)
    max_freq = max(freq.values())
    return len(arr) - max_freq

def main():
    T = int(input())
    for _ in range(T):
        N = int(input())
        A = list(map(int, input().split()))
        print(min_operations_to_equal(A))

if __name__ == "__main__":
    main()

```

Here’s a concise, step-by-step proof showing that **Boolean Satisfiability (SAT) reduces to the Clique Decision Problem**, which demonstrates NP-hardness.

---

### **1. Recall the problems**

**Boolean Satisfiability (SAT):**

- Input: A Boolean formula ( \phi ) in CNF (conjunctive normal form).
    
- Question: Is there an assignment of truth values to variables that makes ( \phi ) true?
    

**Clique Decision Problem:**

- Input: An undirected graph ( G ) and integer ( k ).
    
- Question: Does ( G ) contain a clique of size ( k ) (subset of ( k ) vertices all pairwise connected)?
    

---

### **2. Reduction Idea**

We want a polynomial-time transformation ( f ) such that:

[  
\text{SAT instance } \phi \text{ is satisfiable } \iff \text{graph } G = f(\phi) \text{ has a clique of size } k  
]

**Construction:**

1. Let ( \phi = C_1 \wedge C_2 \wedge \dots \wedge C_m ) be a CNF formula with ( m ) clauses.
    
2. For each literal ( l ) in clause ( C_i ), create a **vertex** ( v_{i,l} ) in the graph ( G ).
    
3. Connect **vertices from different clauses** with an edge if their literals are **not contradictory** (i.e., they can be true simultaneously).
    

Formally, for vertices ( v_{i,p} \in C_i ) and ( v_{j,q} \in C_j ) (with ( i \neq j )):  
[  
(v_{i,p}, v_{j,q}) \in E(G) \iff l_{i,p} \text{ and } l_{j,q} \text{ are consistent (not complements)}  
]

4. Set ( k = m ) (number of clauses).
    

---

### **3. Correctness**

**Claim:** ( \phi ) is satisfiable ( \iff ) ( G ) has a clique of size ( m ).

- **(⇒)** If ( \phi ) is satisfiable, choose one true literal from each clause. The corresponding vertices form a clique because no two chosen literals are contradictory. Size = number of clauses = ( k ).
    
- **(⇐)** If ( G ) has a clique of size ( m ), then it contains exactly one vertex from each clause (vertices from the same clause are not connected). Assign truth values to make these literals true — this satisfies all clauses.
    

---

### **4. Complexity**

- Constructing ( G ) requires iterating over clauses and pairs of vertices, so it’s **polynomial in the size of ( \phi )**.
    
- Therefore, this is a **polynomial-time reduction**.
    

---

### **5. Conclusion**

Since **SAT is NP-complete** and we have a polynomial-time reduction ( \text{SAT} \le_P \text{CLIQUE} ), the **Clique Decision Problem is NP-hard**.

---

This is the classic textbook reduction used in **computational complexity proofs**.

If you want, I can also **draw a small example** showing a CNF formula mapped to a graph with a clique. It makes this reduction visually obvious.

```python
import math

def compute_gcd_lcm(a, b):
    gcd = math.gcd(a, b)
    lcm = (a * b) // gcd
    return gcd, lcm

def main():
    T = int(input())
    for _ in range(T):
        A, B = map(int, input().split())
        gcd, lcm = compute_gcd_lcm(A, B)
        print(f"{gcd} {lcm}")

if __name__ == "__main__":
    main()
```

