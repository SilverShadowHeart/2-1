### `np.random.rand`, `randn`, `randint` — Comparison

#### 🟡 1. `np.random.rand(shape...)`

- **Uniform distribution** over **[0, 1)**
    
- Returns **floats**
    
- Arguments: shape as separate values, not a tuple
    

python

CopyEdit

`np.random.rand(2, 3) # → 2x3 array of random floats in [0,1)`

#### 🔵 2. `np.random.randn(shape...)`

- **Standard normal distribution** (mean = 0, std = 1)
    
- Returns **floats**
    
- Arguments: shape as separate values (like `rand`)
    

python

CopyEdit

`np.random.randn(2, 3) # → 2x3 array of random floats centered around 0`

#### 🟢 3. `np.random.randint(low, high, size=...)`

- Returns **integers** in the range **[low, high)**
    
- Requires `size=(rows, cols)` as a **tuple**
    
- Very useful for labels, indexes, class numbers
    

python

CopyEdit

`np.random.randint(0, 10, size=(2, 3)) # → 2x3 array of ints from 0 to 9`

---

### 🔁 Key Differences

|Function|Type|Distribution|Args Shape|
|---|---|---|---|
|`rand`|Float|Uniform `[0,1)`|separate|
|`randn`|Float|Normal (mean=0)|separate|
|`randint`|Integer|Uniform `[low,high)`|**tuple**|

---

### 💡 Which one to use when?

- `rand` → when you just want noise/random decimal values
    
- `randn` → when simulating natural data / Gaussian variation
    
- `randint` → when working with class labels, indexes, or counting

## 🧠 NumPy Random Utilities – Part 2



 random(), choice(), permutation(), shuffle()

---

### ✅ np.random.random(size)

- **Purpose**: Generates random floats **between 0 and 1** (exclusive), **like `rand()` but only takes size.**
- **Syntax**: `np.random.random(size)`
- **Type**: Floats ∈ [0.0, 1.0)
- **Note**: Only takes size — no control over range.


np.random.random((2, 3))

Output: 2x3 array of floats ∈ [0, 1)

---

### ✅ np.random.choice(a, size=None, replace=True, p=None)

- **Purpose**: Randomly pick **elements from a 1D array** or range.
    
- **a**: Source — can be list or `int` (interpreted as `np.arange(a)`)
    
- **size**: Output shape
    
- **replace**:
    
    - `True` → sampling **with** replacement (can repeat)
        
    - `False` → sampling **without** replacement
        
- **p**: Probabilities (must sum to 1)
    

python

CopyEdit

`np.random.choice(5, size=3, replace=False) # Picks 3 unique values from [0, 1, 2, 3, 4]  np.random.choice([10, 20, 30], size=5, p=[0.1, 0.7, 0.2]) # Heavily biased towards 20`

---

### ✅ np.random.permutation(x)

- **Purpose**: Returns a **shuffled copy** of the array
    
- **Does NOT modify** the input array.
    
- **x**: Can be a range or 1D/2D array
    

python

CopyEdit

`np.random.permutation([1, 2, 3, 4]) # Output: [3, 1, 4, 2]`

---

### ✅ np.random.shuffle(x)

- **Purpose**: **Shuffles the input array in-place**
    
- **Modifies original**
    
- For 2D arrays, only the **first axis** is shuffled (rows)
    

python

CopyEdit

`arr = np.array([[1, 2], [3, 4], [5, 6]]) np.random.shuffle(arr) # arr is now row-shuffled version`

---

## 🟩 Summary

|Function|In-place?|Control over dist?|Can set prob?|Works on|
|---|---|---|---|---|
|`random()`|No|❌|❌|Random floats [0, 1)|
|`choice()`|No|✅|✅|1D data / range|
|`permutation()`|No|❌|❌|Returns shuffled copy|
|`shuffle()`|✅|❌|❌|Shuffles array in-place|