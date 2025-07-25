## 📌 **Broadcasting** – Extending smaller shapes to fit larger ones during operations

---

### 🔧 Why it matters:

- Enables **element-wise operations** between arrays of **different shapes** without explicit loops.
    
- Saves memory, avoids copies, and improves performance.
    

---

### 🧠 Key Broadcasting Rules:

1. **Align from the trailing dimensions**.
    
2. A dimension is compatible if:
    
    - It is **equal**, or
        
    - It is **1** (gets broadcast).
        

---

### 📏 Example:



`a = np.array([[1], [2], [3]])     # Shape (3,1) b = np.array([10, 20, 30])        # Shape (3,)  # Broadcasting to (3,3) print(a + b) # Output: # [[11 21 31] #  [12 22 32] #  [13 23 33]]`

> ✅ `a` expands from (3,1) → (3,3), `b` from (3,) → (1,3) → (3,3)

## ✅ **Basic Math in NumPy (Element-wise vs Matrix Ops)**

---

### 🔹 1. **Element-wise Operations**

> Performed **position by position** (same shape or broadcastable)

python

CopyEdit

`a = np.array([[1, 2], [3, 4]]) b = np.array([[10, 20], [30, 40]])  print(a + b)   # element-wise addition # [[11 22] #  [33 44]]  print(a * b)   # element-wise multiplication # [[10 40] #  [90 160]]`

---

### 🔹 2. **Broadcasted Math**

> NumPy automatically adjusts shapes if possible:



`a = np.array([[1, 2], [3, 4]])    # shape (2, 2) b = np.array([10, 20])           # shape (2,) → broadcasted to (2,2)  print(a + b) # [[11 22] #  [13 24]]`

---

### 🔹 3. **Matrix Multiplication (Dot Product)**

> Using `@` or `np.dot()` or `np.matmul()`  
> Rows of A × Columns of B


`a = np.array([[1, 2], [3, 4]])      # shape (2,2) b = np.array([[5, 6], [7, 8]])      # shape (2,2)  print(a @ b)  # matrix multiplication # [[19 22] #  [43 50]]`

> Calculation:

- Row1 × Col1 → (1*5 + 2*7) = 19
    
- Row1 × Col2 → (1*6 + 2*8) = 22  
    ... and so on.
    

---

### 🔹 4. **Scalar Operations**

> Scalar applied to every element:



`a = np.array([[1, 2], [3, 4]]) print(a * 10) # [[10 20] #  [30 40]]`