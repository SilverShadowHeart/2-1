## ✅ NumPy Aggregation Functions (Reductions)

> Reductions **collapse** one or more axes by applying a function (like sum, mean, etc.).  
> Used in analytics, statistics, matrix ops, etc.

---

### 🔹 1. **Basic Reductions – Apply to All Elements**

#### ➤ Syntax:



`np.function(array)`

#### ➤ Example:



`a = np.array([[1, 2], [3, 4]])  print(np.sum(a))     # 10 print(np.mean(a))    # 2.5 print(np.min(a))     # 1 print(np.max(a))     # 4 print(np.prod(a))    # 24  (1*2*3*4)`

These **flatten the array** first → operate on 1D.

---

### 🔹 2. **Axis-Wise Aggregation**

#### ➤ Syntax:


`np.function(array, axis=axis)`

#### ➤ Example:



`a = np.array([[1, 2], [3, 4]]) # shape: (2, 2)  np.sum(a, axis=0)  # [4 6] # column-wise: [1+3, 2+4]  np.sum(a, axis=1)  # [3 7] # row-wise: [1+2, 3+4]`

#### 📌 Rule of Thumb:

- **axis=0** → **collapse rows**, operate **down columns**
    
- **axis=1** → **collapse columns**, operate **across rows**
    

---

### 🔹 3. **Cumulative Aggregations**

Operate progressively element-by-element:


`a = np.array([1, 2, 3, 4])  np.cumsum(a)     # [1 3 6 10] np.cumprod(a)    # [1 2 6 24]`

Also works row-wise or column-wise with 2D arrays using `axis=`.

---

### 🔹 4. **Keep Dimensions**

Prevents dimension from being removed (good for broadcasting).



`a = np.array([[1, 2], [3, 4]])  np.sum(a, axis=1, keepdims=True) # Output: [[3] #          [7]]   → shape stays (2,1)`

Without `keepdims=True`, it would be just `[3, 7]` (shape = (2,)).

---

### 🔹 5. **Working with NaN / Inf**

#### ➤ If you have NaN or inf:

`a = np.array([1, 2, np.nan, 4])  np.sum(a)         # nan np.nansum(a)      # 7.0 np.nanmean(a)     # 7 / 3 = 2.33`

Use `np.nan*` functions to **ignore NaNs safely**.

---

### 🔹 6. **Other Aggregates**

|Function|Purpose|
|---|---|
|`np.std`, `np.var`|Standard deviation, variance|
|`np.argmin`, `np.argmax`|Index of min/max value|
|`np.any`, `np.all`|Boolean reductions|

#### Example:

`a = np.array([[1, 0], [0, 1]])  np.any(a)  # True  (at least one non-zero) np.all(a)  # False (not all non-zero)`

---

### 🧠 Summary:

- **Global (flattened)**: `np.sum(a)`
    
- **Along axis**: `np.sum(a, axis=1)`
    
- **Preserve shape**: `keepdims=True`
    
- **Safe for NaN**: `np.nan*` versions
    
- **Progressive**: `cumsum`, `cumprod`