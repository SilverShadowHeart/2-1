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