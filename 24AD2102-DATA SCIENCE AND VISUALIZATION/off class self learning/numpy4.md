
🔄 Reshaping and Manipulating Arrays in NumPy

These functions let you change the structure of arrays **without changing the data**. Some return **views**, others return **copies**, and a few work **in-place**.

---

### 🔁 `reshape()`

- **Changes shape** of the array to the given dimensions.
    
- Returns a **new array** (view if possible, otherwise copy).
    
- Total number of elements **must remain the same**.
    


`a = np.array([1, 2, 3, 4, 5, 6]) a.reshape(2, 3)        # shape becomes (2, 3) a.reshape(-1, 2)       # NumPy auto-calculates rows: shape (3, 2)`

---

### 🔁 `flatten()` vs `ravel()`

|Method|Returns|Modifies Original?|Memory|
|---|---|---|---|
|`flatten()`|1D array|❌ No|Always Copy|
|`ravel()`|1D array|❌ No|View if possible (faster)|


`a = np.array([[1, 2], [3, 4]]) a.flatten()    # [1 2 3 4] a.ravel()      # [1 2 3 4]`

Use `flatten()` when you need a **guaranteed copy**, `ravel()` when you just want a **quick 1D view**.

---

### 🔁 `transpose()` and `.T`

- Reverses axes for multi-dimensional arrays.
    
- For **2D**, it’s equivalent to flipping rows ↔ columns.
    
- For **3D+**, you must **manually specify** axis order.
    



`a = np.array([[1, 2], [3, 4]]) a.T                      # Transposed: [[1 3], [2 4]] np.transpose(a)          # Same  b = np.ones((2, 3, 4)) np.transpose(b, (1, 0, 2))  # axis 0 ↔ axis 1`

---

### 🔁 `swapaxes()`

- Specifically swaps **two axes only** in **N-D arrays**.
    

`arr = np.random.rand(2, 3, 4) np.swapaxes(arr, 0, 2)  # swaps axis 0 and 2`

Used when you want to rotate axes without full transpose control.

---

### ⚖️ `reshape()` vs `resize()`

|Method|Returns|In-place?|Behavior|
|---|---|---|---|
|`reshape`|View|❌ No|Only if possible; else copy|
|`resize`|None|✅ Yes|Modifies array, fills excess with 0s|



``a = np.array([1, 2, 3, 4]) a.reshape((2, 2))     # Returns a reshaped array a.resize((3, 3))      # Modifies `a` directly, fills missing with 0``

Use `resize()` with caution — it can cause data loss or unwanted 0-filling.

---

### 🪣 `expand_dims()` — Add Axis

- Adds a **new dimension** at a specified axis.
    
- Used to convert shape (3,) → (1,3) or (3,1), etc.
    


`a = np.array([1, 2, 3]) np.expand_dims(a, axis=0)  # shape: (1, 3) np.expand_dims(a, axis=1)  # shape: (3, 1)`

---

### 🧼 `squeeze()` — Remove Singleton Dimensions

- Removes all dimensions with **size 1**.
    



`a = np.array([[[1, 2, 3]]])   # shape (1, 1, 3) np.squeeze(a)                 # shape (3,)`

---

### 📌 Recap Visual:

|Operation|Purpose|Key Effect|
|---|---|---|
|`reshape()`|Change shape|New shape, same data|
|`flatten()`|2D → 1D (copy)|Flattens to 1D|
|`ravel()`|2D → 1D (view)|Faster flatten if possible|
|`transpose()`|Rearrange axes|Rows ↔ Cols or N-D axes|
|`swapaxes()`|Swap 2 specific axes|Used in N-D array reshuffling|
|`resize()`|Change shape in-place|May pad with 0s|
|`expand_dims()`|Add a dimension|Prepares for broadcasting|
|`squeeze()`|Remove 1-size dimensions|Useful after indexing/slicing|