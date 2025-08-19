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
