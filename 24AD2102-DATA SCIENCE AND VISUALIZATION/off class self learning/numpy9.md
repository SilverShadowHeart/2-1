## Boolean Masking in NumPy

### 📌 What is it?

A **boolean mask** is a condition applied to a NumPy array, returning a new array filtered by `True/False` values.

---

### 🔹 1. Basic Usage


`import numpy as np  a = np.array([1, 2, 3, 4, 5, 6])  mask = a > 3              # Creates a boolean array print(mask)               # [False False False  True  True  True]  print(a[mask])            # [4 5 6] — values where mask is True`

You can write it more compactly:


`print(a[a > 3])           # Same result: [4 5 6]`

---

### 🔹 2. Combine Multiple Conditions


`a = np.array([10, 20, 30, 40, 50])  print(a[(a > 15) & (a < 45)])   # [20 30 40]`

> ⚠ Use `&`, `|`, `~` instead of `and`, `or`, `not` for NumPy.

---

### 🔹 3. Modify Values Using Mask


`a[a < 25] = 0 print(a)   # [ 0  0 30 40 50]`

---

### 🔹 4. `np.where()`

Acts like a ternary operator:

`a = np.array([10, 15, 20, 25, 30]) result = np.where(a > 20, 1, 0) print(result)   # [0 0 0 1 1]`

---

### 🔹 5. `np.nonzero()` – Get Indices of True Values


`a = np.array([0, 1, 0, 3]) indices = np.nonzero(a) print(indices)   # (array([1, 3]),) print(a[indices]) # [1 3]`

---

### 🔹 6. Use with 2D Arrays

`b = np.array([[1, 2, 3],               [4, 5, 6]])  print(b[b > 3])    # [4 5 6]`

---

### ✅ Summary

|Operation|Purpose|
|---|---|
|`a[a > 5]`|Filter values|
|`a[(a > 2) & (a < 5)]`|Combine conditions|
|`a[a < 10] = 0`|Modify in-place|
|`np.where(cond, x, y)`|Conditional replace|
|`np.nonzero(a)`|Indices of non-zero/True values|