### 🔹 1. **Basic Slicing**


`a = np.array([[1, 2, 3],               [4, 5, 6],               [7, 8, 9]])  a[1:3, 2:]   # Output: array([[6], [9]])`

- `a[1:3, 2:]` → rows 1 to 2 (not 3), columns 2 to end.
    
- Works like Python list slicing, but extended to N dimensions.
    

---

### 🔹 2. **Integer Indexing**


`a = np.array([[10, 20],               [30, 40],               [50, 60]])  a[[0, 1, 2], [1, 0, 1]]  # Output: array([20, 30, 60])`

- Picks specific elements using parallel index lists.
    
- Think: `a[0,1]`, `a[1,0]`, `a[2,1]` → all in one call.
    

---

### 🔹 3. **Boolean Indexing**


`a = np.array([1, 2, 3, 4, 5]) a[a > 3]     # Output: array([4, 5])`

- Uses a boolean mask to filter.
    
- Can be created inline or reused:
    

    
    `mask = (a % 2 == 0) a[mask]      # even numbers`
    

---

### 🔹 4. **Fancy Indexing with Arrays**


`a = np.array([10, 20, 30, 40, 50]) idx = [1, 3, 4] a[idx]       # Output: array([20, 40, 50])`

- Similar to boolean, but uses positions directly.
    
- Works on multi-dim arrays too:
    
  
    `a = np.array([[1, 2], [3, 4]]) a[[0, 1], [1, 0]]  # Output: array([2, 3])`
    

---

### 🔹 5. **Combining Slicing + Fancy Indexing**


`a = np.arange(12).reshape(3, 4) # array([[ 0,  1,  2,  3], #        [ 4,  5,  6,  7], #        [ 8,  9, 10, 11]])  a[1:3, [1, 3]]  # Output: array([[ 5,  7],                #                [ 9, 11]])`

- Slice rows `1 to 2` + columns `[1, 3]`
    
- Mixing can lead to dimension mismatch if not careful.