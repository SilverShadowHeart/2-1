# 📘 NumPy Basics — Introduction & Core Concepts

### 🔹 Why NumPy?

NumPy (Numerical Python) is a fundamental Python library used for:

- High-performance array computing
    
- Handling large multi-dimensional arrays and matrices
    
- Performing vectorized operations (faster than native Python lists)
    
- Backbone of data science, machine learning, simulations, image processing, etc.
    

To use it:



`pip install numpy`

Then import it in your notebook:


`import numpy as np`

---

## 🔸 Arrays vs Lists


`a = np.array([1, 2, 3, 4])`

- This creates a **NumPy array** — not a Python list.
    
- Unlike lists, arrays:
    
    - Support only **one data type**
        
    - Are **faster**
        
    - Enable **mathematical operations**, broadcasting, slicing, reshaping
        

---

## 🔸 Array Attributes

|Expression|Meaning|
|---|---|
|`type(a)`|Shows it is a `numpy.ndarray`|
|`a.dtype`|Data type of elements (`int64`, `float64`, etc.)|
|`a.shape`|Tuple showing dimensions (e.g., `(4,)` for 1D with 4 elements)|
|`a.ndim`|Number of dimensions (e.g., `1`, `2`, `3`)|
|`a.size`|Total number of elements|

Example:



`a = np.array([1, 2, 3, 4]) print(type(a))     # <class 'numpy.ndarray'> print(a.dtype)     # int64 print(a.shape)     # (4,) print(a.ndim)      # 1 print(a.size)      # 4`

---

## 🔸 Multi-dimensional Arrays

You can create arrays with any number of dimensions:



`a = np.array([[[1], [2], [3]]]) print(a.shape)  # (1, 3, 1)`

- This is a **3D array**:
    
    - 1 block
        
    - 3 rows
        
    - 1 column per row
        

Indexing deeper:



`print(a[0][0].shape)  # (1,) — you're selecting row 0 of block 0`

> Accessing elements reduces dimensionality — it **feels** like removing an axis, but it’s just narrowing the view.

---

## 🔸 Creating Dummy Arrays with `np.zeros()`

### Purpose:

- Pre-allocate arrays
    
- Use as placeholders for models/simulations
    
- Quickly create arrays of a certain shape filled with `0`
    

### Syntax:



`np.zeros(shape, dtype=float)`

### Examples:

python

CopyEdit

`np.zeros(5)                     # [0. 0. 0. 0. 0] → shape (5,) np.zeros((5, 5))                # 2D array (5×5) np.zeros((5, 5, 6), dtype=int)  # 3D int array filled with 0 np.zeros((2, 3), dtype=bool)    # All False (boolean type)`

> ⚠️ **By default, dtype is `float64`** unless explicitly set.

---

## 🧪 Quick Practice Tips

- Start indexing different shapes and observing how `.shape`, `.ndim`, and `.dtype` change.
    
- Try accessing individual elements to see how dimensions reduce.
    
- Use `np.array()` to manually build 1D, 2D, 3D arrays.
    
- Use `np.zeros()` to prepare empty/dummy arrays for logic you plan to build.

### 🧾 Common Data Types in NumPy

|NumPy Type|Meaning|Example Values|
|---|---|---|
|`int8`, `int16`, `int32`, `int64`|Signed integers (8 to 64 bits)|`1`, `1000`, `-55`|
|`uint8`, `uint16`, `uint32`, `uint64`|Unsigned integers|`0` to positive-only|
|`float16`, `float32`, `float64`|Floating point numbers|`1.5`, `3.14159`, `-0.01`|
|`complex64`, `complex128`|Complex numbers|`1 + 2j`|
|`bool`|Boolean (True / False)|`True`, `False`|
|`str_`, `unicode_`|Strings (fixed-length)|`"hello"`, `'abc'`|
|`object`|Arbitrary Python objects|Mixed types or lists|

---

### 🔍 Examples



`np.array([1, 2, 3], dtype=np.int32) np.array([1.2, 3.5], dtype=np.float64) np.array([True, False], dtype=bool) np.array(['a', 'b'], dtype=str)`

---

### ⚠️ Best Practices

- Let NumPy **infer `dtype`** unless you have strict memory/performance needs.
    
- Use `float32` instead of `float64` in ML/Deep Learning to save memory.
    
- For Boolean masks or filters, use `dtype=bool`.

## 🔸 Array Creation: `np.ones()`, `np.full()`, `np.empty()`

These functions are used to create arrays with **predefined content** but customizable shape and data type.

---

### 🟩 `np.ones()`

Creates an array **filled with 1s**.

#### ✅ Syntax:



`np.ones(shape, dtype=float)`

#### ✅ Examples:



`np.ones(5)                     # [1. 1. 1. 1. 1.] → shape (5,) np.ones((2, 3))                # 2D array of ones np.ones((2, 2), dtype=int)     # Integer ones`

---

### 🟨 `np.full()`

Creates an array of **any constant value** you specify.

#### ✅ Syntax:



`np.full(shape, fill_value, dtype=None)`

#### ✅ Examples:



`np.full((2, 2), 7)             # [[7, 7], [7, 7]] np.full((3, 3), 3.14)          # 3×3 filled with 3.14 np.full((2, 2), True, dtype=bool)  # [[True, True], [True, True]]`

#### 📌 Use when:

- You need to fill arrays with a **non-zero constant**
    
- Useful in masking, padding, or initializing weights
    

---

### 🟥 `np.empty()`

Creates an array without initializing values — **contains garbage/random values** already in memory.

#### ✅ Syntax:



`np.empty(shape, dtype=float)`

#### ✅ Examples:

python

CopyEdit

`np.empty((2, 3))       # Uninitialized 2×3 array (may show random floats) np.empty((3, 3), dtype=int)`

#### ⚠️ Warning:

- Do **not use** if you rely on default values
    
- Use it **only when** you're going to fill the array **immediately after creation**
    

---
### ✅ Summary Table:

|Function|Fills With|Default `dtype`|Output Example|
|---|---|---|---|
|`np.zeros()`|`0`|`float64`|`[0. 0. 0.]`|
|`np.ones()`|`1`|`float64`|`[1. 1. 1.]`|
|`np.full()`|Custom value|Type of value|`[7 7 7]` or `[3.14 3.14]`|
|`np.empty()`|Garbage/leftovers|`float64`|`[1.435e-316 ... ???]`|

---

### 🟠 Important Notes:

- ✅ **Same syntax structure**: `(shape, dtype=...)`
    
- 🔄 **Interchangeable use** depending on your fill requirement
    
- ⚠️ `np.empty()` is memory-efficient but **never use unless you overwrite immediately**
    
- 🧱 All these are **array builders**, not modifiers — they **create new arrays**
---

### 🧪 Practice Tip:



`np.full((3, 3), 99, dtype=int) np.ones((2, 4), dtype=bool) np.empty((5, 5), dtype=float)`

## 📘 Catch-Up: Array Creation Functions in NumPy

These functions are essential tools for quickly initializing arrays in numerical computing and ML pipelines.

---

### 🔹 `np.zeros(shape, dtype=float)`

- Creates array filled with **0**
    
- Default type: `float64`
    
- Used for **dummy values, padding, preallocating**
    

python

CopyEdit

`np.zeros((2, 3))  # [[0. 0. 0.]                   #  [0. 0. 0.]]`

---

### 🔹 `np.ones(shape, dtype=float)`

- Creates array filled with **1**
    
- Default type: `float64`
    
- Used for **baseline identity values or testing**
    

python

CopyEdit

`np.ones((2, 3))   # [[1. 1. 1.]                   #  [1. 1. 1.]]`

---

### 🔹 `np.full(shape, fill_value, dtype=None)`

- Fills entire array with **any constant**
    
- `dtype=bool` → converts `fill_value` accordingly
    
- Used for **masking, constant initialization**
    

python

CopyEdit

`np.full((2, 2), 7)       # [[7 7]                          #  [7 7]] np.full((2, 2), 0, dtype=bool)  # [[False False]]`

---

### 🔹 `np.empty(shape, dtype=float)`

- Allocates space, but **does not initialize**
    
- Fast but contains **random garbage**
    
- Used for **high-performance code** where you’ll overwrite immediately
    

python

CopyEdit

`np.empty((2, 3))  # May contain random numbers like [[1.4e-316 ...]]`

---

### ✅ Behavior with `dtype=bool`

|Function Call|Result|
|---|---|
|`np.zeros(..., dtype=bool)`|All `False`|
|`np.ones(..., dtype=bool)`|All `True`|
|`np.full(..., 0, dtype=bool)`|All `False`|
|`np.full(..., 99, dtype=bool)`|All `True`|
|`np.empty(..., dtype=bool)`|Random `True` / `False`|

### 🔹 `np.eye(N, M=None, k=0, dtype=float)`

Returns a 2D array with **ones on a specified diagonal** and zeros elsewhere.


`np.eye(3) # Output: # [[1. 0. 0.] #  [0. 1. 0.] #  [0. 0. 1.]]`

**Parameters:**

- `N`: int → Number of rows.
    
- `M`: int (optional) → Number of columns. Defaults to `N`.
    
- `k`: int → Index of the diagonal:
    
    - `k=0`: main diagonal
        
    - `k>0`: above the main diagonal
        
    - `k<0`: below the main diagonal
        
- `dtype`: optional → Data type of the array (default is `float`).
    

**Use Case:**  
Useful for creating **identity-like matrices**, or when you want **offset diagonal structures**.

---

### 🔹 `np.identity(n, dtype=None)`

Returns a **square identity matrix** of size `n x n`.


`np.identity(3) # Output: # [[1. 0. 0.] #  [0. 1. 0.] #  [0. 0. 1.]]`

**Parameters:**

- `n`: int → Number of rows and columns (always square).
    
- `dtype`: optional → Data type of the array.
    

**Use Case:**  
Shortcut for generating square identity matrices. Equivalent to `np.eye(n)` with default settings.

---

### 🔹 `np.diag(v, k=0)`

- If `v` is a 1D array: returns a 2D matrix with `v` on the specified diagonal.
    
- If `v` is a 2D array: extracts the specified diagonal values.

`# Construct diagonal matrix: np.diag([1, 2, 3]) # Output: # [[1 0 0] #  [0 2 0] #  [0 0 3]]  # Extract diagonal from 2D matrix: A = np.array([[1,2,3], [4,5,6], [7,8,9]]) np.diag(A) # Output: [1 5 9]`

**Parameters:**

- `v`: 1D or 2D array
    
- `k`: int → Diagonal offset (same as in `eye()`)
    

**Use Case:**

- Convert 1D vectors into diagonal matrices
    
- Extract diagonals for trace, eigenvalue prep, or analysis

[[numpy1]]