## 🔹 `np.put()` — Assign Values at Specific Indices

---

### ✅ Purpose

While `np.take()` retrieves values by index, `np.put()` does the **opposite** — it **modifies specific indices** in-place.

---

### 🔹 Syntax



`np.put(a, indices, values, mode='raise')`

- `a`: input array (modified in-place)
    
- `indices`: target positions (flat index)
    
- `values`: values to assign
    
- `mode`: how to handle out-of-bounds indices
    
    - `'raise'` (default): throw error
        
    - `'wrap'`: wrap around
        
    - `'clip'`: use nearest valid index
        

---

### 🔹 Example 1: Basic



`a = np.array([10, 20, 30, 40]) np.put(a, [0, 2], [100, 300]) print(a) # Output: [100  20 300  40]`

---

### 🔹 Example 2: 2D Arrays (uses flattened indexing)


`a = np.array([[1, 2], [3, 4]]) np.put(a, [0, 3], [9, 99]) print(a) # Output: # [[ 9  2] #  [ 3 99]]`

---

> ⚠️ Note: Indexing is **flattened**, so index `3` points to the last element (`[1][1]`) in a 2D shape.

---

### 🔹 Example 3: With `mode='clip'`


`a = np.array([10, 20, 30]) np.put(a, [0, 5], [100, 500], mode='clip') print(a) # Output: [100 20 500]  # 5 is clipped to 2 (last index)`

---

### ✅ Summary

- `np.put()` = Assign to **flat indices**
    
- Works in-place
    
- Use when:
    
    - You want fast, indexed assignment
        
    - You're building transformation or mutation logic

if you dont understand the above here a dummy version simple words

raise will throw an error if that index is occupied similar to u not going into a locked bathroom stall and standing still

wrap will overwrite the value if its occupied  similar to a maniac blasting through a bathroom stall and kicking out that person who is already in

clip will check for last index that is free like a proper human who looks for other bathroom stalls if this one is filled 