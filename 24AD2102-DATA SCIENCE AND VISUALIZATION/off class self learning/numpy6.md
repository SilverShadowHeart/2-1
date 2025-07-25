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